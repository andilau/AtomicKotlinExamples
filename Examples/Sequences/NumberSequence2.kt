// Sequences/NumberSequence2.kt
// �2020 Mindview LLC. See Copyright.txt for permissions.
package usingsequences
import atomictest.eq

fun main() {
  generateSequence(6) {
    (it - 1).takeIf { it > 0 }
  }.toList() eq listOf(6, 5, 4, 3, 2, 1)
}
