// ExtensionProperties/AnyFromListOfStar.kt
// �2020 Mindview LLC. See Copyright.txt for permissions.
package extensionproperties
import atomictest.eq

fun main() {
  val list: List<*> = listOf(1, 2)
  val any: Any? = list[0]
  any eq 1
}
