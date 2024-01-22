// Scalaの基本の基だけどどっちでもOK
/*
object Test01 extends App {
    println("hello")
}
*/

object Test01 {

    def main(args: Array[String]) = {
        val f = (a: Int) => (b: Int) => a + b
        println(uncurry(f)(1, 2))
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

    // exercise 2.3
    def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
        // 関数を返す
        a: A => (b: B) => f(a, b)
    }

    // exercise 2.4
    def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
        (a: A, b: B) => f(a)(b)
    }


    
}