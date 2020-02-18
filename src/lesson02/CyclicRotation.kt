package lesson02

object CyclicRotation {
    fun solution(a: IntArray, k: Int): IntArray {
        if (a.isEmpty()) return a
        val kNormalized = k % a.size
        if (kNormalized == 0) return a
        return (a.drop(a.size - kNormalized) + a.take(a.size - kNormalized)).toIntArray()
    }
}