package nrahmatd.hackerrank.`1_solvemefirst`

import java.util.Scanner

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val sc = Scanner(System.`in`)
    println("Sample Input\n" +
            "a = 2\n" +
            "b = 3")
    print("Input a : ")
    val num1 = sc.nextInt()
    println()
    print("Input b : ")
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}
