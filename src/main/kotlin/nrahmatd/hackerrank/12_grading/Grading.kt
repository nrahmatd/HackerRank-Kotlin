package nrahmatd.hackerrank.`12_grading`

import kotlin.math.ceil

/*
 * Complete the 'bigSorting' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts STRING_ARRAY unsorted as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    val result = ArrayList<Int>()
    for (i in grades) {
        val diff = Math.ceil(i.toDouble() / 5) * 5 - i

        if (diff < 3 && i >= 38) {
            result.add((Math.ceil(i.toDouble() / 5.0) * 5).toInt())
        } else
            result.add(i)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
