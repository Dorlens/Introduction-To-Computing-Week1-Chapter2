fun max(a: Int, b: Int): Int
{
    return if (a > b) a else b
}

fun main()
{
    val num1 = 10
    val num2 = 20
    val result = max(num1, num2)
    println("The bigger number between $num1 and $num2 is $result")
}