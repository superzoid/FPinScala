package chapter2



import org.junit.Assert._
import org.junit.Test

class Fibonacci  {
  
  @Test
  def testt() = {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(2, fib(3))
    assertEquals(3, fib(4))
    assertEquals(5, fib(5))
    assertEquals(8, fib(6))
    assertEquals(13, fib(7))
    assertEquals(21, fib(8))
    assertEquals(34, fib(9))
    assertEquals(117669030460994l, fib(69))
    println(fib (100))
  }
  
  def fib(i:Int):Long = {
    if(i == 0) return 0
    if(i == 1) return 1
    
    def go(a:Long,b:Long, index:Int):Long = {
      if( index == i-1) {
        b
      } else {
        go(b,a+b, index+1)
      }
    }
    go(0,1,0)
  }
}