package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        var result = sadArray
        var hasSadElement = true
        while (hasSadElement) {
            hasSadElement = false
            val happyArray = mutableListOf<Int>()
            result.forEachIndexed { index, element ->
                val isGoodElement = when {
                    index == 0 -> true
                    index == result.lastIndex -> true
                    else -> {
                        val leftIndex = index - 1
                        val rightIndex = index + 1
                        val leftElement = result[leftIndex]
                        val rightElement = result[rightIndex]
                        leftElement + rightElement >= element

                    }
                }
                if (isGoodElement)
                    happyArray.add(element)
                else {
                    hasSadElement = true
                }


            }
            result = happyArray.toIntArray()
        }



        return result
    }
}
