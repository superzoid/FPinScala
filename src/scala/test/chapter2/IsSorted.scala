package chapter2

import org.junit.Assert._
import org.junit.Test

class IsSorted {

  @Test
  def testIsSorted() = {
    def gt(a: Int, b: Int) = a > b
    assertTrue(isSorted(Array(0,1,2,3,4), gt))
    assertTrue(isSorted(Array(0), gt))
    assertTrue(isSorted(Array(), gt))
    assertFalse(isSorted(Array(0,1,4,3,4), gt))
  }

  def isSorted[A](as: Array[A], gt: (A,A) => Boolean) : Boolean = {
    def go(a: A, t: Array[A]): Boolean = {
      if(t.length == 0) {
        return true
      }
      if(gt(t.head,a))
        go(t.head, t.tail)
      else
        false
    }
    if(as.length == 0){
      return true
    }
    go(as.head, as.tail)
  }
}
