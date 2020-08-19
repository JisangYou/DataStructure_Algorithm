package Chapter4

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent


/**
 * 무명 객체 안에서 로컬 변수 사용하기
 */
class CountClicks {
    fun countClicks(window: Window) {
        var clickCount = 0
        window.addMouseListener(object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) {
                clickCount++
            }
        })
    }
}