package nrahmatd.hackerrank.plusminus

import java.text.DecimalFormat
import java.util.Scanner

/*
 * Complete the plusMinus function below.
 * Reference: https://www.hackerrank.com/challenges/plus-minus/problem
 */
fun plusMinus(arr: Array<Int>): Unit {
    var positive: Double = 0.0
    var negative: Double = 0.0
    var zero: Double = 0.0
    val decimalFormat = DecimalFormat("#.######")
    val n = arr.size
    for (i in arr.indices) {
        when {
            arr[i] > 0 -> positive++
            arr[i] < 0 -> negative++
            else -> zero++
        }
    }

    println(decimalFormat.format(positive / n))
    println(decimalFormat.format(negative / n))
    println(decimalFormat.format(zero / n))
}

fun main() {
    val scan = Scanner(System.`in`)

    println("Sample Input\n" +
            "\n" +
            "6\n" +
            "-4 3 -9 0 4 1")
    println("Input data :")
    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}