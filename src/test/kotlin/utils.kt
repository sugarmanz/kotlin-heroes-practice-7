import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.OutputStream
import java.io.PrintStream

fun testCase(testCase: String, basePath: String = "src/test/kotlin"): Pair<File, File> =
    File("$basePath/$testCase-input.txt") to File("$basePath/$testCase-output.txt")

fun setupInputStream(filePath: String, basePath: String = "src/test/kotlin") = setupInputStream(File("$basePath/$filePath"))

fun setupInputStream(file: File) = file
    .readText()
    .byteInputStream()
    .let(System::setIn)

fun setupOutputStream(): OutputStream = ByteArrayOutputStream()
    .also { PrintStream(it).let(System::setOut) }

fun setupTestCase(testCase: String, basePath: String = "src/test/kotlin", block: () -> Unit) {
    val (input, expectedOutput) = testCase(testCase, basePath)
    setupInputStream(input)
    val output = setupOutputStream()
    block()
    assertEquals(expectedOutput.readText(), output.toString().trim())
}

