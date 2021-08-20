class Rational(x:Int,y:Int){
    def numer = x;
    def denom = y;
    def +(r:Rational) = new Rational(this.numer *r.denom +r.numer * this.denom, denom * r.denom)
    def neg = new Rational(-this.numer,this.denom)
    def -(r:Rational) = this+r.neg 
    override def toString: String = s"$numer/$denom"

}
object Question_2 extends App{
    var r1 = new Rational(1,2)
    var r2 = new Rational(4,5)
    var x = r1-r2
    println(x)
}