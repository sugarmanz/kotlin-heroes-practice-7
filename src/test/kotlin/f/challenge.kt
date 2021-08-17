package f

import org.junit.jupiter.api.Test
import setupTestCase

fun main() {
    val numElements = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num elements")
    `prefixes and suffixes`(numElements).let(::println)
}

private fun `prefixes and suffixes`(n: Int): Int = TODO()

private class F {
    @Test
    fun `test case 1`() {
        setupTestCase("f/1", block = ::main)
    }
}
