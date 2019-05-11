package in.simpledsl

import org.scalatest._

class ApplicationSpec extends FlatSpec with Matchers {

  "(+ 100 100)" should "evaluate to 200" in {
    Application.evaluate("(+ 100 100)").intValue() shouldBe 200
  }

  "(+ 100 (- 100 90.0))" should "evaluate to 110" in {
    Application.evaluate("(+ 100 (- 100 90.0))").intValue() shouldBe 110
  }

  "(* (/ 4 3) (* 3.141 (* (* 10 10) 10)))" should "evaluate to 4187" in {
    Application.evaluate("(* (/ 4 3) (* 3.141 (* (* 10 10) 10)))").intValue() shouldBe 4187
  }

  "(sphere-volume 10)" should "evaluate to 4187" in {
    Application.evaluate("(sphere-volume 10)").intValue() shouldBe 4187
  }

  "(sphere-volume (* (+ 3 2) 2))" should "evaluate to 4187" in {
    Application.evaluate("(sphere-volume (* (+ 3 2) 2))").intValue() shouldBe 4187
  }
}
