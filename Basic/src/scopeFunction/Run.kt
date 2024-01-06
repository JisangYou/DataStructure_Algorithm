package scopeFunction

// 확장함수이기 때문에 safe call(.?)을 붙여 non-null 일 때에만 실행
// 어떤 값을 계산할 필요가 있거나 여러 개의 지역변수 범위를 제한할 때 사용
fun main() {
    val head = ListNode(7)
    head.next = ListNode(1)
    head.next?.next = ListNode(2)
    head.next?.next?.next = ListNode(7)
    var current = removeElements(head, 7)
    while(current != null) {
//        println(current.`val`)
        current = current.next!!
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

// 링크드 리스트에서 특정 값을 가진 모든 노드를 삭제하는 함수
fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var current = head
    var prev: ListNode? = null
    var newHead: ListNode? = head

    while (current != null) {
        if (current.`val` == `val`) {
            if (prev == null) {
                // 삭제하려는 노드가 헤드 노드인 경우
                println("여기 :" +newHead!!.`val`)
                newHead = current.next
            } else {
                // 삭제하려는 노드가 헤드 노드가 아닌 경우
                println("저기 2:" + prev.next!!.`val`)
                println("저기 3:" + current.next!!.`val`)
                prev.next = current.next
            }
        } else {
            // 이전 노드를 업데이트하여 다음 노드로 이동
            prev = current
        }
        println("어때 :" + current.`val`)
        // 현재 노드를 다음 노드로 이동
        current = current.next
    }

    // 새로운 헤드 노드를 반환
    return newHead
}