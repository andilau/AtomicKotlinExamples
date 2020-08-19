// Lambdas/ListIndicesMap.kt
// �2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c')
  list.indices.map {
    "[$it]"
  } eq listOf("[0]", "[1]", "[2]")
}
