class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val n = strs.size
        var ans = ""
        strs.sortBy { it.length }
        val c = strs[0]
        strs.sort()
        val a = strs[0]
        val b = strs[n - 1]
        apply {
            for (i in c.indices) {
                if (a[i] == b[i]) ans += a[i]
                else return@apply
            }
        }
        return ans
    }
}