fun main() {
    println("Please Enter your name!")
    val name: String = readln()
    println("Hello $name!")
    println("How old are you?")
    val potentialAge: String = readln()
    val age: Int = potentialAge.toInt()
    println("Which gender do you identify as?")

    println("Checking whether you are on the guestlist...")

    val guestList = listOf("Maria", "Blub")

    // introduce class person later on

    var isInvited: Boolean = false
    for (guest in guestList) {
        if (guest == name) {
            isInvited = true
        }
    }

    if (!isInvited) { // or you can use !in
        println("You are not invited!")
        return
    }

    println("Welcome")



    println("You are " + age + " old.") //println("You are $age old.")
    if (age < 18) {
        println("You are too young to enter!")
        return
    }

    println("Passed!")
}
