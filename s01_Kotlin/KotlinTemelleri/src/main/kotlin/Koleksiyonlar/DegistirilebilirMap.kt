package Koleksiyonlar

fun main(args: Array<String>) {
    var degistirilebilen = hashMapOf<String,String>("1" to "Ömer")

    degistirilebilen.put("2" , "emre")
    println(degistirilebilen.get("2"))
    println(degistirilebilen["1"])
    degistirilebilen.set("2", "Hamit")

    for (i in degistirilebilen)
        println("${i.key} ${i.value}")
    degistirilebilen.remove("3")
    var d2 : MutableMap<String,String> = degistirilebilen
    for (i in d2)
        println(i.value)
}