package nrahmatd.hackerrank.`11_big_sort`

/*
 * Complete the 'bigSorting' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts STRING_ARRAY unsorted as parameter.
 */

fun bigSorting(unsorted: Array<String>): Array<String> {
    // Write your code here

    /** Own Code **/

    /**
    val ints = unsorted.map { it.toBigInteger() }.toTypedArray()

    ints.sort()

    val strs = ints.map { it.toString() }.toTypedArray()

    return strs
    **/

    /** Update for effective runtime **/
    unsorted.sortWith(Comparator { a, b ->
        if (a.length == b.length) {
            a.compareTo(b)
        } else {
            a.length - b.length
        }
    })

    return unsorted
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val unsorted = Array<String>(n, { "" })
    for (i in 0 until n) {
        val unsortedItem = readLine()!!
        unsorted[i] = unsortedItem
    }

    val result = bigSorting(unsorted)

    println(result.joinToString("\n"))
}
