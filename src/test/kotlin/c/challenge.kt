package c

import org.junit.jupiter.api.Test
import setupTestCase

fun main() {
    val numTests = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num test cases")
    repeat(numTests) {
        val (n, k) = readLine()?.split(" ") ?: throw IllegalArgumentException("cannot read test case #$it")
        `uniform spring`(n.toInt(), k.toInt()).let(::println)
    }
}

private fun `uniform spring`(n: Int, k: Int): String = TODO()

private class C {
    @Test
    fun `test case 1`() {
        setupTestCase("c/1", block = ::main)
    }
}
