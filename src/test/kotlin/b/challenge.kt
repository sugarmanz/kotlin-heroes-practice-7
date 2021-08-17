package b

import org.junit.jupiter.api.Test
import setupTestCase
import java.math.BigInteger

fun main() {
    val numTests = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num test cases")
    repeat(numTests) {
        val (a, b, k) = readLine()?.split(" ") ?: throw IllegalArgumentException("cannot read test case #$it")
        `frog jumping`(a.toInt(), b.toInt(), k.toInt()).let(::println)
    }
}

private fun `frog jumping`(a: Int, b: Int, k: Int): BigInteger = TODO()

private class B {
    @Test
    fun `test case 1`() {
        setupTestCase("b/1", block = ::main)
    }
}
