package lesson02

object OddOccurencesInArray {
    fun solution(a: IntArray): Int {
        if (a.isEmpty() || a.size % 2 == 0) return 0
        var unpaired = 0
        for (element in a) {
            unpaired = unpaired xor element
        }
        return unpaired
//        this one is more functional solution but doesn't fit to the iterative approach of this lesson
//        return a.groupBy { it }.filter { it.value.size % 2 != 0 }.keys.first()
    }
}