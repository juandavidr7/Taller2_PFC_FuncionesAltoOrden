import Derivacion._

val cte1 = (x:Double) => 10.0
derivada(cte1)(5) // 0
val cte2 = (x:Double) => 6.0
derivada(cte2)(2) // 0
val cte3 = (x:Double) => 23.0
derivada(cte3)(3) // 0

val derLineal1 = (x:Double) => (x)
derivada(derLineal1)(1) // 1
val derLineal2 = (x:Double) => ((-10)*x)
derivada(derLineal2)(4) // -10
val derLineal3 = (x:Double) => (23*x)
derivada(derLineal3)(2) // 23

val derPoli1 = (x:Double) => (3*(x*x*x) + 5*(x*x) - 3.0)
derivada(derPoli1)(3) // 111
val derPoli2 = (x:Double) => (2*(x*x*x*x*x) + 5*(x) - 17*(x*x))
derivada(derPoli2)(2) // 97
val derPoli3 = (x:Double) =>  (4*x + 3*(x-1)*(x-1))
derivada(derPoli3)(1) // 4

val suma1 = (x: Double) => derPoli1(x) + derLineal2(x)
derivada(suma1)(2) // 46
val derSuma = derivadaSuma(derPoli1, derLineal2)
derSuma(2) // 46
val suma2 = (x: Double) => derPoli2(x) + derPoli3(x)
derivada(suma2)(3) // 729
val suma3 = (x: Double) => derLineal1(x) + derLineal3(x)
derivada(suma3)(1) // 24

val resta1 = (x: Double) => derPoli1(x) - derLineal2(x)
derivada(resta1)(2) // 66
val derResta = derivadaResta(derPoli1, derLineal2)
derResta(2) // 66
val resta2 = (x: Double) => derPoli2(x) - derPoli3(x)
derivada(resta2)(3) // 697
val resta3 = (x: Double) => derLineal1(x) - derLineal3(x)
derivada(resta3)(1) // -22

val mult1 = (x: Double) => derPoli1(x) * derLineal2(x)
derivada(mult1)(2) // -1530
val DerPropMult = DerivadaMult(derPoli1, derLineal2)
DerPropMult(2) // -1530
val mult2 = (x: Double) => derPoli2(x) * derPoli3(x)
derivada(mult2)(3) // 22679.57
val mult3 = (x: Double) => derLineal1(x) * derLineal3(x)
derivada(mult3)(1) // 46

val div1 = (x: Double) => derPoli1(x) / derLineal2(x)
derivada(div1)(2) // -1.775
val DerPropDiv1 = DerivadaDiv(derPoli1, derLineal2)
DerPropDiv1(2) // -1.775

val div2 = (x: Double) => derPoli2(x) / derPoli3(x)
derivada(div2)(3) // 20.04
val DerPropDiv2 = DerivadaDiv(derPoli2, derPoli3)
DerPropDiv2(3) // 20.04

val expFunction = (x: Double) => math.exp(x)
derivada(expFunction)(1) // e
val trigFunction = (x: Double) => math.sin(x)
derivada(trigFunction)(math.Pi) // -1
