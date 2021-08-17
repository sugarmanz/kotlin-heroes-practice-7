package a

import org.junit.jupiter.api.Test
import setupTestCase

fun main() {
    val numTests = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num test cases")
    repeat(numTests) {
        val (a, b) = readLine()?.split(" ") ?: throw IllegalArgumentException("cannot read test case #$it")
        `a + b`(a.toInt(), b.toInt()).let(::println)
    }
}

private fun `a + b`(a: Int, b: Int): Int = TODO()

private class A {
    @Test
    fun `test case 1`() {
        setupTestCase("a/1", block = ::main)
    }
}
