fun main() {
  val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")

  println("-- Room Search --")
  for (room in rooms) {
    print("$room: ")
    // Write your code below
    if (room == "Living Room") {
      println("Found It!")
      break
    }
    println("Found Nothing.")
  }

  println("\n-- Divide By Zero --")
  for (number in 12 downTo -12 step 4) {
    // Write your code below
    if (number == 0) {
      continue
    }
    println("120/number = ${120/number}")
  }
}
/* bonus activity */
fun main() {
  // Write your code below
  for (i in 1..6) {
    for (j in 'A'..'F') {
      // Write your code below
      
      print("$j$i ")
    }
    println()
  }
}