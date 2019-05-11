package in.simpledsl

import in.simpledsl.ast._
import in.simpledsl.parser.{sexpressionBaseVisitor, sexpressionParser}

class SExpressionVisitor extends sexpressionBaseVisitor[SExpression] {

  override def visitAtom(ctx: sexpressionParser.AtomContext): SExpression = {
    if(ctx.NUMBER() != null) {
      NumExpr(BigDecimal(ctx.NUMBER().getText))
    } else if(ctx.SYMBOL() != null) {
      val symbol = ctx.SYMBOL().getText
      symbol match {
        case "+" => PlusExpr(null, null)
        case "-" => MinusExpr(null, null)
        case "*" => MultiplyExpr(null, null)
        case "/" => DivideExpr(null, null)
        case "sphere-volume" => SphereVolumeExpr(null)
        case x => throw new UnsupportedOperationException(s"Operator $x is not supported")
      }
    } else if(ctx.STRING() != null) {
      NumExpr(BigDecimal(ctx.NUMBER().getText))
    } else null
  }

  override def visitList(ctx: sexpressionParser.ListContext): SExpression = {
    val op = visit(ctx.item(0))
    op match {
      case numExpr: NumExpr => numExpr
      case _: PlusExpr => {
        val first = visit(ctx.item(1))
        val second = visit(ctx.item(2))
        PlusExpr(first, second)
      }
      case _: MinusExpr => {
        val first = visit(ctx.item(1))
        val second = visit(ctx.item(2))
        MinusExpr(first, second)
      }
      case _: MultiplyExpr => {
        val first = visit(ctx.item(1))
        val second = visit(ctx.item(2))
        MultiplyExpr(first, second)
      }
      case _: DivideExpr => {
        val first = visit(ctx.item(1))
        val second = visit(ctx.item(2))
        DivideExpr(first, second)
      }
      case _: SphereVolumeExpr => {
        val radius = visit(ctx.item(1))
        SphereVolumeExpr(radius)
      }
    }
  }

  override def aggregateResult(aggregate: SExpression, nextResult: SExpression): SExpression = Option(nextResult).getOrElse(aggregate)
}
