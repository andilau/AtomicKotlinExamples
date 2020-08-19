// Composition/House2.kt
// �2020 Mindview LLC. See Copyright.txt for permissions.
package composition2

interface Building
interface Kitchen

interface House: Building {
  val kitchen1: Kitchen
  val kitchen2: Kitchen
}
