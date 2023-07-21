package com.example.personalproject1

fun main(){
    var calc = Calculator()
    calc.caluclator()

}

class Calculator{
    fun caluclator(){
        println("===== welcome to my calculator machine! =====")

        println("step 1. please enter number ")
        val num1 = readLine()?.toInt() ?:0

        println("step 2. choose operator( [ + ], [ - ], [ * ], [ / ], [ % ] )")
        val operator = readLine()
        // 코딩은 예외처리가 중요

        println("step 3. enter last number")
        val num2 = readLine()?.toInt() ?:0

        val result = when(operator){
            "+" -> {
                AddOperation(num1, num2).operate()
            }
            "-" -> {
                SubstractOperation(num1, num2).operate()
            }
            "*" -> {
                MultiplyOperation(num1, num2).operate()
            }
            "/" -> {
                DivideOperation(num1, num2).operate()
            }
            "%" -> {
                ModuloOperation(num1, num2).operate()
            }

            else->{
                -1
            }
        }


        println("caluclating.    [10%]")
        println("caluclating..   [25%]")
        println("caluclating...  [55%]")
        println("caluclating.... [80%]")
        println("caluclating.....[100%]")

        println("thank you for wait!")

        println("\nresult is [ ${result} ] ")

    }

}