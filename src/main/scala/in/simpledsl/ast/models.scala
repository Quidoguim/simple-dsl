package in.simpledsl.ast

trait SExpression {
  def eval(): BigDecimal
  def repr: String
}

case class NumExpr(value: BigDecimal) extends SExpression {
  override def eval(): BigDecimal = value
  override def repr: String = s"NumExpr($value)"
}

case class PlusExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() + second.eval()
  override def repr: String = s"PlusExpr(${first.repr}, ${second.repr})"
}

case class MinusExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() - second.eval()
  override def repr: String = s"MinusExpr(${first.repr}, ${second.repr})"
}

case class MultiplyExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() * second.eval()
  override def repr: String = s"MultiplyExpr(${first.repr}, ${second.repr})"
}

case class DivideExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() / second.eval()
  override def repr: String = s"DivideExpr(${first.repr}, ${second.repr})"
}

case class SphereVolumeExpr(radius: SExpression) extends SExpression {
  override def eval(): BigDecimal =
    (BigDecimal(4) / BigDecimal(3)) * BigDecimal(3.141) * radius.eval().pow(3)
  override def repr: String = s"SphereVolumeExpr(${radius.repr})"
}

case class SquareExpr(value: SExpression) extends SExpression {
  override def eval: BigDecimal = {
    val v = value.eval
    v * v
  }
  override def repr: String = s"SquareExpr(${value.repr})"
}