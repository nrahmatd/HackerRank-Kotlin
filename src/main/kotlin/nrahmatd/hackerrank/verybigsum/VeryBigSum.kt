package nrahmatd.hackerrank.verybigsum

import java.util.Scanner

/*
 * Complete the aVeryBigSum function below.
 * Reference : https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sum()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    println("===Sample Input===\n" +
            "5\n" +
            "1000000001 1000000002 1000000003 1000000004 1000000005")
    println("Input number : ")
    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}