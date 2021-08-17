package b

import org.junit.jupiter.api.Test
import setupTestCase
import java.math.BigInteger
import kotlin.math.abs

fun main() {
    val numTests = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num test cases")
    repeat(numTests) {
        val (a, b, k) = readLine()?.split(" ") ?: throw IllegalArgumentException("cannot read test case #$it")
        `frog jumping`(a.toInt(), b.toInt(), k.toInt()).let(::println)
    }
}

private fun `frog jumping`(a: Int, b: Int, k: Int): BigInteger = (0 until k).fold(0.toBigInteger()) { acc, i ->
    (acc + (if (abs(i) % 2 == 0) a else -b).toBigInteger())
}

private class B {
    @Test
    fun `test case 1`() {
        setupTestCase("b/1", block = ::main)
    }
}
