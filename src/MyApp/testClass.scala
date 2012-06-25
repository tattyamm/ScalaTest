package MyApp

/**
 * Created with IntelliJ IDEA.
 * User: tattyamm
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
    println("====")

    //階乗
    val factorial = new Factorial
    val result = factorial.calcFactorial(4)
    println(result)
    println("====")

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

/*
 * Fizzbuzz
 * mapとかcaseとか
 */
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

/*
 * 階乗計算class
 * 再帰
 * 
 * 『常に戻り値の型を省略できるとは限りません。例えば、再帰呼び出しされるメソッドでは戻り値の型を省略できません。』
 * http://d.hatena.ne.jp/seratch2/20111103/1320334000
 */
class Factorial{
  def calcFactorial(i:Int,result:Int=1):Int = {
    if (i == 0) result
    else calcFactorial(i-1 , i*result)
  }
}