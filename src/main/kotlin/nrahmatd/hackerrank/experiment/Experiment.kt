package nrahmatd.hackerrank.experiment

import java.util.*
import kotlin.math.pow

fun StringCalculate(str: String): Int {
    val operatorStack = Stack<Char>()
    val operandStack = Stack<Int>()

    fun applyOperator(op: Char) {
        val b = operandStack.pop()
        val a = operandStack.pop()
        when (op) {
            '+' -> operandStack.push(a + b)
            '-' -> operandStack.push(a - b)
            '*' -> operandStack.push(a * b)
            '/' -> operandStack.push(a / b)
            '^' -> operandStack.push(a.toDouble().pow(b.toDouble()).toInt())
        }
    }

    var i = 0
    while (i < str.length) {
        val c = str[i]
        when {
            c.isDigit() -> {
                var num = ""
                while (i < str.length && str[i].isDigit()) {
                    num += str[i]
                    i++
                }
                operandStack.push(num.toInt())
            }
            c == '+' || c == '-' || c == '*' || c == '/' || c == '^' -> {
                while (operatorStack.isNotEmpty() && operatorStack.peek() != '(' && precedence(operatorStack.peek()) >= precedence(c)) {
                    applyOperator(operatorStack.pop())
                }
                operatorStack.push(c)
                i++
            }
            c == '(' -> {
                operatorStack.push(c)
                i++
            }
            c == ')' -> {
                while (operatorStack.isNotEmpty() && operatorStack.peek() != '(') {
                    applyOperator(operatorStack.pop())
                }
                if (operatorStack.isNotEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop() // Pop the '('
                }
                i++
            }
            else -> {
                // Ignore whitespace and other characters
                i++
            }
        }
    }

    while (operatorStack.isNotEmpty()) {
        applyOperator(operatorStack.pop())
    }

    return operandStack.pop()
}

fun precedence(op: Char): Int {
    return when (op) {
        '+', '-' -> 1
        '*', '/' -> 2
        '^' -> 3
        else -> 0
    }
}

fun main(args: Array<String>) {
    val str1 = "(2+(3-1)*3)**3"
    val result1 = StringCalculate(str1)
    println("Input: $str1")
    println("Output: $result1")

    val str2 = "(2-0)(6/2)"
    val result2 = StringCalculate(str2)
    println("\nInput: $str2")
    println("Output: $result2")
}

