package AbstractveInterface

/*
abstract class Sporcu{
    abstract fun sporYap()
}

class BuzPateni : Sporcu(){
    override fun sporYap() {
        println("Buz pateni yapıyor")
    }
}

class Basketbol : Sporcu(){
    override fun sporYap() {
        println("Basketbol oynuuyor")
    }

}

class Sportmenler : BuzPateni(), Basketbol(){

}*/

interface BuzUstundeKayabilme{
    fun buzUstundeKay()
}
interface BasketAtabilme{
    fun basketAt()
}

class Sportmenler : BuzUstundeKayabilme, BasketAtabilme{
    override fun buzUstundeKay() {

    }

    override fun basketAt() {

    }

}