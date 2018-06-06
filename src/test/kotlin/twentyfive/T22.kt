package twentyfive

import org.junit.Assert
import org.junit.Test
import java.util.*

class T22 {
    @Test fun testCalculateNameScores() {
        val names = Scanner(javaClass.getResourceAsStream("names.txt"))
                .use { it.nextLine().split(',') }
        Assert.assertEquals(871198282, calculateNameScores(names))
    }
}