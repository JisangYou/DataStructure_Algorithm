package mm_functions

// unclean 증복된 조건문
fun unclean() {
    for (user in users) {
        if (user.subscriptions != null) {
            if (user.subscriptions.size > 0) {
                var isYoungerThan30 = user.isYoungerThan30()
                if (isYoungerThan30) {
                    countUsers++
                }
            }
        }
    }
}

// clean
fun clean() {
    // A long descriptive name is better than a short enigmatic name -> 길지만 명확한게 짧지만 모호한 것 보다 낫다.
    var countUsersYoungerThan30WithSubscriptions = 0
    for (user in users) {
        if (user.isYoungerThan30WithSubscriptions) {
            countUsersYoungerThan30WithSubscriptions++;
        }
    }
}