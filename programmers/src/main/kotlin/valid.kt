import java.util.*
import kotlin.collections.ArrayList

fun isValid(s: String): Boolean {
    val openedStack = Stack<Char>()
    val closedQueue = LinkedList<Char>()
    var result = false
    s.map {
        when (it) {
            '(', '{', '[' -> openedStack.push(it)
            else -> {
                closedQueue.offer(it)
            }
        }
    }

    if (openedStack.size != closedQueue.size) result = false

    while (openedStack.isNotEmpty()) {
        when (openedStack.pop()) {
            '(' -> result = closedQueue.poll() == ')'
            '{' -> result = closedQueue.poll() == '}'
            '[' -> result = closedQueue.poll() == ']'
        }
    }

    return result
}