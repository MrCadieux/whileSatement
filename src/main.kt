fun main() {
    var userOption: Int = 0

    do{
        println("1: Package 1")
        println("2: Package 2")
        println("3: Package 3")
        println("4: Package 4")
        println("5: Package 5")
        println("6: Exit")
        print("Please enter the Package you are interested in: ")
        userOption = readLine()!!.toInt()
        if (userOption <1 || userOption >6)
            println("Please enter a number between 1 and 6")
    }while(userOption <1 || userOption>6)
    if (userOption>=1&&userOption<6)
        println("You have chosen the following Package option: #$userOption")
    else
        println("You have chosen to EXIT")


}