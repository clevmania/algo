import java.util.*

fun solution(n: Int): ArrayList<Int> {
    val num = Integer.toBinaryString(n)
    val positions = ArrayList<Int>()
    for (i in num.indices) {
        if (num[i].toString() == "1") {
            positions.add(i)
        }
    }
    val result = ArrayList<Int>()
    for (i in positions.size - 1 downTo 1) {
        val b = positions[i] - positions[i - 1] - 1
        result.add(b)
    }
    return result
}

fun findMaxGap(list: ArrayList<Int>): Int {
    if (list.isEmpty()) return 0
    return list.max()!!
}

fun main() {
    print(findMaxGap(solution(20)))
}
