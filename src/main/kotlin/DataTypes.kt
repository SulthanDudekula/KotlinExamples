/** DataTypes
 * In Kotlin No need to Specify the Data Type Explicity while declaring the variable
 * Kotlin figured out the types for us, based onhow we used them.
 * This is Known as "Type Interface"
 */
fun main(args: Array<String>) {
    //Declaring a variable by giving Datatype Explicitly
    //Integers
    val i: Int = 10
    //strings
    val s: String = "hello"
    //Double
    val d: Double = 17.1
    //while Declaring a Float variable we need to Specify the F at the end of the value as Shown below
    //Float
    val f: Float = 17.1F
    //Char
    val c: Char = 'c'
    //Boolean
    val b: Boolean = true

    println("Print the integer value i:$i")
    println("Print the string value s:$s")
    println("Print the Double value d:$d")
    println("Print the Float value f:$f")
    println("Print the Char value c:$c")
    println("Print the boolean value b:$b")

    //if you don't specify the F at the end of the Decimal value Kotlin will Consider as Double
    //In KOtlin the default data type for Decimal Values(Floatpoints) is Double.

    //Declaring a variable with out giving Datatype Explicitly
    val f1 = 111.22F
    val d1 = 111.22
    if (f1 is Float) {
        println("$f1 This is Float")
    } else {
        println("$f1 Unknown Datatype")
    }
    if (d1 is Double) {
        println("$d1 This is Double")
    } else {
        println(" $d1 Unknown Datatype")
    }
}