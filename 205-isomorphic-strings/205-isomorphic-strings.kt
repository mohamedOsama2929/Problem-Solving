class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()
        var sSum = 0
        var tSum = 0
        for (i in s.indices) {
            if (sMap.containsKey(s[i])) {
                sMap[s[i]] = sMap[s[i]]!! + (i + 1)
            } else {
                sMap[s[i]] = i + 1
            }
            if (tMap.containsKey(t[i])) {
                tMap[t[i]] = tMap[t[i]]!! + (i + 1)
            } else {
                tMap[t[i]] = i + 1
            }
        }
        sMap.forEach {
            sSum += it.value
        }
        tMap.forEach {
            tSum += it.value
        }
        if (sMap.size != tMap.size) {
            return false
        } else {
            for (i in sMap.toList().indices) {
                if (sMap.values.toList()[i] != tMap.values.toList()[i])
                    return false
            }

            return true
        }
    }
}