package in.simpledsl

import in.simpledsl.parser.{sexpressionLexer, sexpressionParser}
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}

object Application {

  def evaluate(expressionStr: String) = {
    val charStream = new ANTLRInputStream(expressionStr)
    val lexer = new sexpressionLexer(charStream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new sexpressionParser(tokens)

    val visitor = new SExpressionVisitor()

    val expression = visitor.visit(parser.sexpr())
    expression.eval()
  }

  def main(args: Array[String]): Unit = {
    val expressionString = "(square 5)" // ou qualquer entrada válida
    
    val charStream = new ANTLRInputStream(expressionString)
    val lexer = new sexpressionLexer(charStream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new sexpressionParser(tokens)

    val visitor = new SExpressionVisitor()
    val expression = visitor.visit(parser.sexpr())

    println(s"Expression:: ${expression.repr}")
    val result = expression.eval()
    println(s"Result:: $result")
  }
}