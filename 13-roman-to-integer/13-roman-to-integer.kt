class Solution {
    fun romanToInt(s: String): Int {
        var total = 0
        val romanMap: Map<Char, Int> = mapOf(
            Pair('I', 1),
            Pair('V', 5),
            Pair('X', 10),
            Pair('L', 50),
            Pair('C', 100),
            Pair('D', 500),
            Pair('M', 1000)
        )
        s.toCharArray().forEachIndexed { index, c ->
            if ((index + 1) != s.length) {
                if (romanMap[s[index + 1]]!! > romanMap[s[index]]!!) {
                    total -= romanMap[c]!!
                } else {
                    total += romanMap[c]!!
                }
            } else {
                total += romanMap[c]!!
            }
        }

        return Math.abs(total)

    }
}