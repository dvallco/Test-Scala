class Customer(var fullName: String,orderValue: Double) {
  def this(fullName: String) {
    this(fullName, 1850)
  }

  println("Inside de primary constructor")
  private val address = "Bcn"
  var age = 0

  override def toString = s"$fullName has orded value of $orderValue"

  def printAddress {
    println(s"Address =  $address")
  }

  def calculateOrderTaxValue(overValue: Double) = {
    var tax = orderValue * .05
  }

  printAddress


  println("still in the constructor")
}

var customer =  new Customer("Paco",1850)
customer.fullName = "changing property"
customer.age = 44
println("age changed " + customer.age)



println(customer.calculateOrderTaxValue(1850))
