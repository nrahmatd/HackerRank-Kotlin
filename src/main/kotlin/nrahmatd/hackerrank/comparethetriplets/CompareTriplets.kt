package nrahmatd.hackerrank.comparethetriplets

/*
 * Complete the compareTriplets function below.
 * Reference : https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var compare: MutableList<Int> = mutableListOf()
    var alice = 0
    var bob = 0
    for (i in a.indices) {
        if (a[i] > b[i])
            alice++
        else if (a[i] < b[i])
            bob++
    }
    compare.add(alice)
    compare.add(bob)
    return compare.toTypedArray()
}

fun main() {

    println("Sample Input 0\n" +
            "\n" +
            "5 6 7\n" +
            "3 6 10")
    println("Input : ")

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}