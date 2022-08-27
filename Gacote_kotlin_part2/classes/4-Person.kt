// Write your class below 
class Person(val name: String, val age: Int, val favoriteColor: String)

fun main() {
  // Create your instances below 

  val me = Person("Maggie", 26, "Green")
  val myFriend = Person("Jose", 25, "Red")

  println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}.")

  println("${myFriend.name} is ${myFriend.age} years old and their favorite color is ${myFriend.favoriteColor}.")

}