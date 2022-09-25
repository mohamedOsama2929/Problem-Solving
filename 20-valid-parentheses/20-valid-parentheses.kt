class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        if (s.length%2!=0){
            return false
        }
        s.forEach {


              //  stack.push(it)
            if (stack.isNotEmpty()) {
                if (it == ')') {
                    if (stack.peek() == '('){
                        stack.pop()
                    }else{
                        return false
                    }

                }else if (it == '}') {
                    if (stack.peek() == '{'){
                        stack.pop() 
                    }else{
                        return false
                    }
                       
                }else if (it == ']') {
                    if (stack.peek() == '['){
                        stack.pop()
                    }else{
                        return false
                    }

                }else{
                    stack.push(it)
                }
            }else{
                stack.push(it)
            }

        }

        return stack.isEmpty()
    }
}