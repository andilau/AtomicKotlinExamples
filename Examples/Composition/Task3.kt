// Composition/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package compositionExercise3
import atomictest.*

@OptIn(ExperimentalStdlibApi::class)
class Queue<E> {
  private val arrayDeque = ArrayDeque<E>()
  fun put(e: E) = arrayDeque.addLast(e)
  fun poll(): E = arrayDeque.removeFirst()
}

fun main() {
  val queue = Queue<String>()
  queue.put("a")
  queue.put("b")
  queue.put("c")
  queue.put("d")
  queue.poll() eq "a"
  queue.poll() eq "b"
}
