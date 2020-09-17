package nrahmatd.hackerrank.simplearraysum

import java.util.Scanner

/*
 * Complete the simpleArraySum function below.
 * Reference : https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
fun simpleArraySum(ar: Array<Int>): Int {
    /*
     * Write your code here.
     */
    var sum = 0
    for(element in ar)
        sum += element
    return sum
}

fun main() {
    val scan = Scanner(System.`in`)

    println("Sample Input\n" +
            "6\n" +
            "1 2 3 4 10 11")
    println("Input :")
    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
