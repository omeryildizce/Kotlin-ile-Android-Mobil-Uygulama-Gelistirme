package ExceptionKavrami

class Person {
    var yas: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                var istisna = IllegalArgumentException("Personel yaşı negatif olamaz.")
                throw istisna
            } else {
                field = value
            }
        }

}

fun main(args: Array<String>) {
    var person: Person = Person()
    println(person.yas)
    try {

        person.yas = -10
    } catch (e: Exception) {
        println(e.toString())
        println(e.message)
    } finally {
        println(person.yas)

    }
}