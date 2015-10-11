
object MyObject {
  def tryfactorial(n: BigInt): BigInt = {
    if (n <= 1) {
      1
    }
    else {
      n * tryfactorial(n - 1)
    }
  }
}


MyObject.tryfactorial(5)