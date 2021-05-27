package subtask3

class StringParser {


    fun getResult(inputString: String): Array<String> {

        val result = mutableListOf<String>()

        var stillSearch = true
        var startIndex = 0

        while (stillSearch) {
            stillSearch = false
            val Scobca = inputString.indexOf('(', startIndex)
            val Treugoln = inputString.indexOf('<', startIndex)
            val Cvadrat = inputString.indexOf('[', startIndex)
            val minimalIndex = listOf(Scobca, Treugoln, Cvadrat).filter { it != -1 }.min()
            if (minimalIndex != null) {
                val zacrivscobca = when (minimalIndex) {
                    Scobca -> ')'
                    Treugoln -> '>'
                    else -> ']'
                }
                val indexZacrScb = inputString.indexOf(zacrivscobca, minimalIndex)
                if (indexZacrScb != -1) {
                    val result1 = inputString.substring(minimalIndex + 1, indexZacrScb)
                    result.add(result1)
                }
                stillSearch = true
                startIndex = minimalIndex + 1

                
            }


        }


        return result.toTypedArray()


    }
}
