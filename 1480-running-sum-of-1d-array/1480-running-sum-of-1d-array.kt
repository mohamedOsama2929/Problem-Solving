class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        nums.forEachIndexed { index, item ->
            if (index==0){
                result[index]=item
            }else{
                result[index]=item+result[index-1]
            }

        }
        return result
    }
}