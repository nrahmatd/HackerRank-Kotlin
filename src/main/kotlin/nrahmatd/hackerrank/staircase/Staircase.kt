package nrahmatd.hackerrank.staircase

import java.util.Scanner

/*
 * Complete the staircase function below.
 * References: https://www.hackerrank.com/challenges/staircase/problem
 */
fun staircase(n: Int): Unit {
    for(i in 1..n) {

        for (k in n-i downTo 1) {
            print(" ")
        }

        for (j in 0 until i) {
            print("#")
        }
        println()
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    println(" ===Sample Input===\n" +
            " 6")
    print("Input data: ")
    val n = scan.nextLine().trim().toInt()

    staircase(n)
}