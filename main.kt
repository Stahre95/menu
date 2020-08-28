fun main() {
    greeting()
    menu()
    Aisays("Vad vill du att jag ska hjälpa dig med?")
    var input = readLine() ?: ""
    when(input) {
        "1" -> { //addera två tal
            add()
            main()
        }
        "2" -> {//Räkna en bokstav i en sträng
            countOccurences()
            main()
        }
        "3" -> {//spegel vänd en sträng
            reversed()
            main()
        }
        "4" -> {
             //summera alla tal i en sträng
            sumOfString()
            main()
        }
        "5" -> {
            Aisays("Hej då!")
        }
        else -> {
            println("Alternativet du valde är inte giltigt! Försök igen")
            main()
        }

    }
}

fun menu(){
    println("1. Addera två tal")
    println("2. Räkna bokstäver i en sträng")
    println("3. Spegelvänd en sträng")
    println("4. summera alla tal i en sträng")
    println("5. Avsluta")
}

fun Aisays(text: String){
    println("Datorn:" + text)
}
fun add() {
    Aisays("Skriv in ditt första tal")
    var x = readLine()!!.toInt()
    Aisays("Skriv in ditt andra tal")
    var y = readLine()!!.toInt()

    var sum = x + y

    Aisays("Summan av de 2 tal du gav mig är: $sum")
}

fun countOccurences(){
    Aisays("Skriv in ordet du vill leta i:")
    val input = readLine()?:""
    Aisays("Skriv in bokstaven du vill räkna:")
    val letter = readLine()?: ""
    var counter = 0

    for (i in 0..input.length - 1) {
        if (input[i].toString() == letter) {
            counter++
        }
    }
    Aisays("Bokstaven $letter förekommer $counter antal gånger i strängen $input")
}

fun sumOfString() {
    var sum : Int = 0
    Aisays("Mata in alla tal du vill addera:")
    var input = readLine()?: ""

    var stringAsInt = input.filter { it.isDigit() }

    for (i in 0..stringAsInt.length - 1) {
        var numbers : Int = input[i].toInt()
        sum += numbers.toInt()
    }
    Aisays("totalvärdet av alla sifrror i strängen är $sum")

}


fun reversed(){
    Aisays("Skriv in din sträng")
    val input = readLine()?: ""
    val reversedInput = input.reversed()

    Aisays("Din sträng spegelvänd är $reversedInput")
}

fun greeting() {
    Aisays("Hej och välkommen till detta program! Nedan ser du en lista på olika saker jag kan utföra åt dig!")
}


