package nrahmatd.hackerrank.`10_time_conversion`

import java.text.SimpleDateFormat


/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    var hour = s.substring(0, 2).toInt()
    val timeOfDay = s.substring(8, 10)

    if (timeOfDay == "AM") {
        if (hour == 12)
            hour = 0
    } else if (timeOfDay == "PM") {
        if (hour != 12)
            hour += 12
    }
    return String.format("%02d%s", hour, s.substring(2, 8))
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
