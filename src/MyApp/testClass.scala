package MyApp

/**
 * Created with IntelliJ IDEA.
 * User: Endo
 * Date: 12/06/24
 * Time: 1:50
 * To change this template use File | Settings | File Templates.
 */



object FirstApp{
  def main (args:Array[String]){
    println ("hello world")

    //四則演算class
    val calc = new Calc
    val num = calc.add(1,2)
    val num2= calc.dif(1,2)
    println(num)
    println(num2)
    println("====")

    //fizzbuzz
    val fizzbuzz = new Fizzbuzz
    fizzbuzz.fb2

  }
}

/*
 * 四則演算class
 */
class Calc{
  def add(m:Int , n:Int):Int = m+n
  def dif(m:Int , n:Int):Int = {
    return m-n
  }
}

class Fizzbuzz{
  def fb1 {
    1 to 20 map{
      case i if i%15==0=>"FizzBuzz"
      case i if i%5==0=>"Buzz"
      case i if i%3==0=>"Fizz"
      case i=>i
    }foreach println
  }
  def fb2 {
    1 to 20 map{
      case i if i%15==0=>"FizzBuzz"
      case i if i%5==0=>"Buzz"
      case i if i%3==0=>"Fizz"
      case i=>i
    }foreach  { e =>
      println(e)
    }
  }



}
