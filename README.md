# Kotlin Heroes Practice #7

https://codeforces.com/contest/1532

To submit, make an account and paste main function into text box or upload file. For a spotlight, please send screenshot proof to @jzucker on slack that you successfully completed two problems.

### Helpful Hints

Most the problems require reading from STDIN and writing to STDOUT. Kotlin provides a `readLine` method for reading from STDIN and `println` for writing to STDOUT.

Simple example:
```kotlin
fun main() {
    // read number of tests from first line
    val numTests = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("cannot read num test cases")
    // iterate for each test
    repeat(numTests) {
        // read individual test values
        val (a, b) = readLine()?.split(" ") ?: throw IllegalArgumentException("cannot read test case #$it")
    }
}
```

Simple test cases have been set up for each challenge.
