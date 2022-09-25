
class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var index=-1
        val leftSumArray=leftSum(nums)
        val right=leftSum(nums.reversedArray())
        val rightSumArray=right.reversedArray()

        println("left Sum ${leftSumArray.asList()}")
        println("right Sum ${rightSumArray.asList()}")
        for(i in leftSumArray.indices){
            if (leftSumArray[i]==rightSumArray[i]){
                index=i
                break
            }
        }
        return index
    }
}

fun leftSum(nums: IntArray): IntArray {
    val result = IntArray(nums.size)

    nums.forEachIndexed { index, i ->
        if (index==0){
            result[index]=i
        }else{
            result[index]=i+result[index-1]
        }
    }
    return result
}