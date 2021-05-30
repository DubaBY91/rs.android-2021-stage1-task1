package subtask3

class StringParser {


    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        var nix = 0
        for (i in inputString.withIndex()) {
            if (i.value == '<' || i.value == '[' || i.value == '(') {
                var end: Char = when (i.value) {
                    '<' -> '>'
                    '[' -> ']'
                    '(' -> ')'
                    else -> ' '
                }
                for (i2 in i.index + 1 until inputString.length) {
                    if (inputString[i2] == i.value) nix++
                    if (inputString[i2] == end) {
                        if (nix == 0) {
                            result.add(inputString.substring(i.index + 1 until i2))
                        } else nix--
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}




