package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int) : String {
        // достать все елементы кроме К.
        // сложить их разделить на 2 и сравнить с Б
        val arrayOne = bill
        val summa = arrayOne.sum()
        val K = arrayOne.get(k)
        val summaSecond = summa - K
        val c = summaSecond / 2
        return if (c == b)
            "bon appetit"
        else {
            (b - c).toString()

        }


    }


}




