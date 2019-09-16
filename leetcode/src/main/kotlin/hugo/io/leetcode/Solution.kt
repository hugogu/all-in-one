package hugo.io.leetcode

class Solution {
    fun lengthOfLongestSubstring(value: String): Int {
        var begin = 0
        var end = 0
        var longBegin = 0
        var longEnd = 0
        val distinctChars = linkedMapOf<Char, Int>()
        value.forEachIndexed { index, c ->
            val existing = distinctChars.getOrDefault(c, -1)
            if (existing >= 0) {
                (begin..existing).map { value[it] }.forEach { distinctChars.remove(it) }
                begin = existing + 1
            }
            distinctChars[c] = index
            end = index + 1

            if (end - begin > longEnd - longBegin) {
                longBegin = begin
                longEnd = end
            }
        }

        return longEnd - longBegin
    }
}