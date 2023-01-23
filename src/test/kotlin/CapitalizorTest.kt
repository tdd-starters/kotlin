import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

internal class CapitalizorTest {

    @TestFactory
    fun `phrases are capitalized correctly`() =
        listOf(
            "" to "",
            "a" to "A",
            "hello" to "Hello",
            "èlo" to "Èlo",
            "Hello" to "Hello",
            "hello world!" to "Hello World!",
            "world èlo" to "World Èlo",
        ).map { (source, expected) ->
            dynamicTest(
                "\"$source\""
            ) {
                // when the phrase is capitalized
                val capitalized = Capitalizor.capitalize(source)

                // then it should equal the expected phrase
                assertEquals(expected, capitalized)

            }
        }
}