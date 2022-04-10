fun main(){
  var y= names(listOf("school","home","party","clear","play","group","sweet","color","spear","crown"))
  println(y)

  var t=averageHeight(listOf(2,3,4,2,5,1))
  println(t)

  var people =Person("Manu",23,1,45)
  var chuo = Person("Chuo",13,3,38)
  var brad = Person("Brad",9,2,48)
  var chor = Person("Chor",21,4,50)
  var p = listOf(people,chuo,brad,chor)

   var s = p.sortedByDescending { c-> c.age }
  println(s)


  var pack = Person("Pack",23,2,59)
  var cndy = Person("Cndy",20,1,57)
    //var addPerson= mutableListOf(pack,cndy)
      //  println(p.plus(addPerson))
 var addPerson=(Person2(listOf(pack,cndy)))
     println(p.plus(addPerson))


    var n = Car("ABCD",457)
    var m = Car("EFGH",358)
     var d = listOf(n,m)
    println (Mileage(d))


}
fun names(name:List<String>):List<String>{

  var b = mutableListOf<String>()
  name.forEachIndexed() { index, a ->
    if (index % 2 == 0)

      b.add(a)
  }
  return b
}
fun averageHeight(height:List<Int>):String {
  var x = height.sum()
  var a = height.average()
  var total = "The height is $x meters,and the avaerage is $a"
  return total
}
data class Person(var name:String, var age:Int, var height:Int, var weight:Int)

fun Person2(add:List<Any>):List<Any>{
  return listOf()
}
data class  Car(var registration:String,var mileage:Int)

fun Mileage(x:List<Car>):Int{
  var f = 0
  x.forEach{ l -> l.mileage
    f += l.mileage
  }
  var averageMileage=f/x.count()
  return averageMileage
}

//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)
//
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)
//
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
//
//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)
