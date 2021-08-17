package a

import org.junit.jupiter.api.Test
import setupTestCase

fun main() {
    val numTests = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num test cases")
    repeat(numTests) {
        val (a, b) = readLine()?.split(" ") ?: throw IllegalArgumentException("cannot read test case #$it")
        println(`a + b`(a.toInt(), b.toInt()))
    }
}

private fun `a + b`(a: Int, b: Int): Int = a + b

private class A {
    @Test
    fun `test case 1`() {
        setupTestCase("a/1", block = ::main)
    }
}
