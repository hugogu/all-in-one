package hugo.io.leetcode


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val valuePosition = nums.mapIndexed { index, i -> i to index }.toMap()
        val matchPair = nums.mapIndexed { index, i ->
            val match = target - i
            val matchPosition = valuePosition.getOrDefault(match, -1)
            if (matchPosition > 0 && matchPosition != index) {
                listOf(index, matchPosition)
            } else {
                emptyList()
            }
        }

        return matchPair.firstOrNull { it.isNotEmpty() }.orEmpty().toIntArray()
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return addTwoNumbers(l1, l2, 0)
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, advance: Int): ListNode? {
        return if (l1 == null && l2 == null) {
            if (advance == 0) null else ListNode(1)
        } else {
            val value = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + advance
            ListNode(value % 10).apply {
                next = addTwoNumbers(l1?.next, l2?.next, value / 10)
            }
        }
    }
}

