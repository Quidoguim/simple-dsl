package in.simpledsl.ast

trait SExpression {
  def eval(): BigDecimal
}

case class NumExpr(value: BigDecimal) extends SExpression {
  override def eval(): BigDecimal = value
}

case class PlusExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() + second.eval()
}

case class MinusExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() - second.eval()
}

case class MultiplyExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() * second.eval()
}

case class DivideExpr(first: SExpression, second: SExpression) extends SExpression {
  override def eval(): BigDecimal = first.eval() / second.eval()
}

case class SphereVolumeExpr(radius: SExpression) extends SExpression {
  override def eval(): BigDecimal = (BigDecimal(4) / BigDecimal(3)) * BigDecimal(3.141) * radius.eval().pow(3)
}