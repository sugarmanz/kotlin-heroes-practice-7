package d

import org.junit.jupiter.api.Test
import setupTestCase

fun main() {
    val numStudents = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num students")
    `teams forming`(numStudents).let(::println)
}

private fun `teams forming`(n: Int): Int = TODO()

private class D {
    @Test
    fun `test case 1`() {
        setupTestCase("d/1", block = ::main)
    }

    @Test
    fun `test case 2`() {
        setupTestCase("d/2", block = ::main)
    }

    @Test
    fun `test case 3`() {
        setupTestCase("d/3", block = ::main)
    }
}
