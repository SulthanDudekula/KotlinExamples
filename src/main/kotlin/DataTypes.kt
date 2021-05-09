/** DataTypes
In Kotlin No need to Specify the Data Type Explicity while declaring the variable
Kotlin figured out the types for us, based onhow we used them.
This is Known as "Type Interface"

 */
fun main(args:Array<String>)
{
    //Declaring a variable by giving Datatype Explicitly
    val i:Int=10
    val s:String="hello"
    val d:Double=17.1
    //while Declaring a Float variable we need to Specify the F at the end of the value as Shown below
    val f:Float=17.1F
    val c:Char='c'
    println("$i")
    println("$s")
    println("$d")
    println("$f")
    println("$c")

    //Declaring a variable by with out giving Datatype Explicitly
    //if you don't specify the F at the end of the Decimal value Kotlin will Consider as Double
    //In KOtlin the default data type for Decimal Values(Floatpoints) is Double.
    val f1 = 111.22F
    val d1 = 111.22
if(f1 is Float){
    println("$f1 This is Float")
}
    else{
        println("$f1 Unknown Datatype")
}
    if(d1 is Double){
        println("$d1 This is Double")
    }
    else{
        println(" $d1 Unknown Datatype")
    }
}