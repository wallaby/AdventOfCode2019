package onl.toth.dev.app

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource


class Day1Tests {

    @ParameterizedTest
    @CsvSource("2, 12", "2, 14", "654, 1969", "33583, 100756")
    fun testNormal1(expectedFuel : Int, mass : Int) {
        assertEquals(expectedFuel, Day1(listOf(mass)).calculateFuelRequirement())
    }

    @ParameterizedTest
    @CsvSource("2, 14", "966, 1969", "50346, 100756")
    fun testClosure1(expectedFuel : Int, mass : Int) {
        assertEquals(expectedFuel, Day1(listOf(mass)).calculateFuelRequirementClosure())
    }

    @ParameterizedTest
    @CsvSource("2, 14", "966, 1969", "50346, 100756")
    fun testClosureB1(expectedFuel : Int, mass : Int) {
        assertEquals(expectedFuel, Day1(listOf(mass)).calculateFuelRequirementClosureB())
    }
}