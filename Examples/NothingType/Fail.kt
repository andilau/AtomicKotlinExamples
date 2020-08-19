// NothingType/Fail.kt
// �2020 Mindview LLC. See Copyright.txt for permissions.
package nothingtype
import atomictest.*

fun fail(i: Int): Nothing =
  throw Exception("fail($i)")

fun main() {
  capture {
    fail(1)
  } eq "Exception: fail(1)"
  capture {
    fail(2)
  } eq "Exception: fail(2)"
}
