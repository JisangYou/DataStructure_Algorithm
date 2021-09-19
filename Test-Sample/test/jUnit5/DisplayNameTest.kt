package jUnit5

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Display Name Test")
internal class DisplayNameTest {

    @Test
    @DisplayName("Custom test name containing spaces")
    fun testWithDisplayNameContainingSpaces() {

    }

    @Test
    @DisplayName("╯°□°）╯")
    fun testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("😱")
    fun testWithDisplayNameContainingEmoji() {
    }

    @Test
    @DisplayName("한국어로 테스트")
    fun testWithKorean() {
    }

}