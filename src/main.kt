fun main(){
    var y= names(listOf("Grace","Waceke","mary","wangare","simon","akuot","judy", "waweru","john", "jane"))
    println(y)

    var total= metres(listOf(6,7,8,9,))
    println(total)

    var people= person("Grace", 30, 55.3, 60)
    var people1= person("Dylan", 5, 6.3, 12)
    var people2= person("John", 37, 65.3, 70)

    var nameOfPeoples= listOf(people,people1,people2)
    var descending=nameOfPeoples.sortedByDescending { person-> person.age }
    println(descending)

    var a=person("auntie",34,2.3,65)
    var b=person("grandma",78,5.3,95)
    var new= mutableListOf(a,b)
    println(new.plus(nameOfPeoples))

    var cruise=Cars("KBS297H", 34)
    var audi=Cars("Kcd342s", 16)
    var range=Cars("kde212c", 25)
    var subaru=Cars("Kbf345u", 20)
    var cayene=Cars("Kcs897s", 22)
    var allcars= listOf(cruise,audi,range,subaru,cayene)
    println(car(allcars))





}
fun names(names:List<String>):List<String>{
    var name= mutableListOf<String>()
    names.forEachIndexed { index, x ->
        if (index%2==0){
            name.add(x)
}
}
    return(name)
}
fun metres(height:List<Int>):String{
    var x= height.sum()
    var y= height.average()
    var total= "$x, $y "
    return total

}

fun Car(gari:List<Cars>):Int{
    var motors=0
    gari.forEach { x -> x.mileage
        motors+=x.mileage
    }
    var totals=motors/gari.count()
    return totals

}
data class person(var name:String, var age:Int, var height:Double, var weight:Int)

data class Cars(var registration:String, var mileage:Int)

fun twoPeople(add:List<Any>):List<Any>{
    return listOf()
}
fun car(gari:List<Cars>):Int{
    var motors=0
    gari.forEach { x -> x.mileage
        motors+=x.mileage
    }
    var totals=motors/gari.count()
    return totals

}



//Given a list of 10 strings, write a function that returns a list of the strings at even indices i.e index 2,4,6 etc
// Given a list of people's height, in metres. Write a function that returns the average height and the total height
// Given a list of person objects, each with the attributes,name,age,height and weight,sort the list in order of descending age
//Given a list similar to the one above, write a function in which you will create 2 more people objects and add them to the list at one go.
//Write a function that takes in a list of car objects each with a registration and mileage attribute and returns the average mileage of all the vehicles in the list
