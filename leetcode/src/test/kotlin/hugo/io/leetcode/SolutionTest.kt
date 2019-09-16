package hugo.io.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun lengthOfLongestSubstringTest() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"))

        assertEquals(1, solution.lengthOfLongestSubstring("a"))
        assertEquals(1, solution.lengthOfLongestSubstring("aa"))
        assertEquals(2, solution.lengthOfLongestSubstring("aba"))
        assertEquals(3, solution.lengthOfLongestSubstring("abc"))
        assertEquals(3, solution.lengthOfLongestSubstring("abcb"))
        assertEquals(4, solution.lengthOfLongestSubstring("abcbad"))
    }
}