// Scalaの基本の基だけどどっちでもOK
/*
object Test01 extends App {
    println("hello")
}
*/

object Test01 {

    def main(args: Array[String]) = {
        println(isSorted(Array(1, 1, 3, 5, 6), (a: Int, b: Int) => a <= b))
        println(isSorted(Array(1), (a: Int, b: Int) => a <= b))
        ()
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

    // exercise2.2
    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        as match {
            case Array(a) => true
            case Array(a, b, _*) if (!ordered(a, b)) => false
            case Array(_*) => isSorted(as.tail, ordered)
        }
    }
    
}