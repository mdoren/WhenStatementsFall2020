fun main(args: Array<String>){
    //Print a statement that asks the user for a number 1-10
    //Assign user's number to variable, and create a string variable for what each number is called in the loop
    //Create when statement for when user's number is between 1-10, create variable for the string of each answer
    //Have the program print the string of the translated number
    println("Number translator! Enter a number between 1 and 10:")
    var number = readLine()!!.toInt()
    var numberString = "x"

    when (number){
        1 -> numberString = "One in Japanese is Ichi"
        2 -> numberString = "Two in Japanese is Ni"
        3 -> numberString = "Three in Japanese is San"
        4 -> numberString = "Four in Japanese is Shi"
        5 -> numberString = "Five in Japanese is Go"
        6 -> numberString = "Six in Japanese is Roku"
        7 -> numberString = "Seven in Japanese is Shichi"
        8 -> numberString = "Eight in Japanese is Hachi"
        9 -> numberString = "Nine in Japanese is Ku"
        10 -> numberString = "Ten in Japanese is Juu"
        !in 1..10 -> numberString = "Out of Range"
        else -> numberString = "Unknown"
    }
    println("$numberString.")
}
