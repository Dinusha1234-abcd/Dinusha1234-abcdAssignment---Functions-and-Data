class Rational(x:Int,y:Int){
   def numer = x;
   def denom = y;

   def neg(r:Rational) = new Rational(-this.numer,this.denom)
   override def toString: String = s"$numer/$denom"
}
object Question_1 extends App{
    var r1 = new Rational(1,2)
    var x = r1;
    println(x.neg(x))
}