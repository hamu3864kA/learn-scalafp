// Scalaの基本の基だけどどっちでもOK
/*
object Test01 extends App {
    println("hello")
}
*/

object Test01 {
    def main(args: Array[String]) = {
        println("hello23")
    }

    // 0, 1, 1, 2, 3, 5
    def fib(i: Integer) = {
        assert(0 < i)
        def loop(x: Integer, a: Integer, b: Integer): Integer = {
            if (x <= 1) a
            else loop(x - 1, b, a + b)
        }
        loop(i, 0, 1)
    }
    
}