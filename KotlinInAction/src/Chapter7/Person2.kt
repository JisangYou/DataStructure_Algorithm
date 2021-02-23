package Chapter7

import java.beans.PropertyChangeListener


fun main() {
    val p = Person2("Dmitry", 34, 2000)
    p.addPropertyChangeListener(PropertyChangeListener { event -> println("Property ${event.propertyName} changed " + "from ${event.oldValue} to ${event.newValue}") })
    println(p.age)
    p.age = 35 // -> 세팅이 되면서, 이벤트 리스너로 인해 변경된 사항 알려짐.
}

// as-is
class Person2(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange(
                "age", oldValue, newValue
            )
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange(
                "salary", oldValue, newValue
            )
        }
}