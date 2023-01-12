package AbstractveInterface
interface Hayvan{
    fun avlan()
    fun interfaceTest(){
        println("Test ")
    }
}

abstract class Kedigiller : Hayvan {
    abstract fun takipEt()

}

open class Kedi:Kedigiller(){
    override fun takipEt() {
        println("Kedi takip et")
    }

    override fun avlan() {
        println("Kedi avlanır")
    }
}
class Kaplan:Kedi(){
    override fun takipEt() {
        println("Kaplan takip et")
    }

    override fun avlan() {
        println("Kaplan avlanır")
    }
}