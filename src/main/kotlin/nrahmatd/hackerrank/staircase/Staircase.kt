package nrahmatd.hackerrank.staircase

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Input data: ")
    val n = scan.nextLine().trim().toInt()

    staircase(n)
}

// Complete the staircase function below.
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