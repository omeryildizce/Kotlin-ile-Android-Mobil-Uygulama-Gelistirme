package Visibility

open class Ulus{
    private var a = 1
    protected var  b = 2
    internal var c = 3
    public var d =4
    open fun test(){
        println(a)
        println(b)
        println(c)
        println(d)
    }
}
class Turk : Ulus(){
    override fun test()
    {
        // println(a)
        println(b)
        println(c)
        println(d)
    }
}
class TestClass{
    fun testing(){
       var referans:Ulus = Ulus()
        println(referans.c)
        println(referans.d)
    }
}

fun main() {

}