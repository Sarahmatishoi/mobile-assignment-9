fun main() {
    println(counties(listOf("Nairobi","Nakuru","Mombasa","Eldoret","Kiambu","Machakos","Meru","Nyeri","Kisumu","Kajiado")))
    println(height(listOf(12.4,23.9,32.90,14.00,35.8,27.32)))
    var personList= listOf(
        Person("sarah",20,45.15,56.70),
        Person("veronicah",24,32.35,46.23),
        Person("Diana",19,47.32,60.65),
        Person("Mary",28,25.65,59.53)
    )
        var sortedPerson=personList.sortedByDescending { Person->Person.age }
   println(sortedPerson)
    people()
    println(car(listOf(200,320,360)))

}



fun counties(countyNames:List<String>):List<String>{
    var countyList= mutableListOf<String>()
        for (county in countyNames){
            if (countyNames.indexOf(county)%2==0){
                countyList.add(county)



        }
    }
return countyList
}

data class PeopleHeight(var average:Double,var total:Double)
fun height(height:List<Double>):PeopleHeight{
   var total= height.sum()
  var average= height.average()
  var sum=PeopleHeight(total,average)
    return sum
}

data class Person(var name:String,var age:Int,var height:Double, var weight:Double)
fun people(){
    var peopleList= mutableListOf(
        Person("Jane",34,1.4,56.45),
        Person("Ian",22,1.2,60.07),
        Person("Damaris",25,2.0,48.2)
    )
    peopleList.addAll(listOf(
     Person("Shady",24,2.3,61.3),
     Person("purity",34,2.1,58.34)
    ))
println(peopleList)

}
data class Car ( var regestration:String, var mileage:Double)

fun car(mileage:List<Int>):Int{
    var totalMileage=mileage.average().toInt()
    return totalMileage
}


