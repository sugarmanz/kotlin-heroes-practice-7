package e

import org.junit.jupiter.api.Test
import setupTestCase

fun main() {
    val numElements = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num elements")
    `good array`(numElements).let(::println)
}

private fun `good array`(n: Int): Int = TODO()

private class E {
    @Test
    fun `test case 1`() {
        setupTestCase("e/1", block = ::main)
    }
}
