import java.lang.StringBuilder
import java.util.*

fun main() {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val start = "0000"
        if (start == target) {
            return 0
        }

        val deadendSet = deadends.toSet()
        if (start in deadendSet) {
            return -1
        }

        val queue: Queue<String> = LinkedList()
        queue.offer(start)

        val visited = mutableSetOf(start)
        var level = 0

        while (queue.isNotEmpty()) {
            val size = queue.size

            repeat(size) {
                val current = queue.poll()

                if (current == target) {
                    return level
                }

                for (i in 0 until 4) {
                    for (j in listOf(-1, 1)) {
                        val digit = ((current[i] - '0') + j + 10) % 10
                        val newLock = current.substring(0, i) + digit + current.substring(i + 1)

                        if (newLock !in deadendSet && newLock !in visited) {
                            visited.add(newLock)
                            queue.offer(newLock)
                        }
                    }
                }
            }

            level++
        }
    }
}
