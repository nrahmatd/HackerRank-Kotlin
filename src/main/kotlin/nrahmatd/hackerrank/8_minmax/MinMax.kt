package nrahmatd.hackerrank.`8_minmax`

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    val min: Long = arr.min()!!.toLong()
    val max: Long = arr.max()!!.toLong()
    var sum: Long = 0

    for (i in arr) {
        sum += i
    }

    println("${sum - max} ${sum - min}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
