class Solution {
    fun numberOfSteps(num: Int): Int {
        var steps = 0
        var total = num

        while (total > 0) {
            if (total % 2 == 0) {
                steps += 1
                total /= 2
            } else {
                steps += 1
                total -= 1
            }
        }
        
        return steps

    }
}
