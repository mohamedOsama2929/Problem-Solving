class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var subStrong=t
        s.forEach {
            if (!subStrong.contains(it)){
                return false
            }else{
                subStrong = subStrong.substring(subStrong.indexOf(it)+1)
            }
        }
        return true
    }
}
