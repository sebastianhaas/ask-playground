package ask.playground

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = HelloWorldStreamHandler()
        assertNotNull(classUnderTest, "stream handler should exist")
    }
}
