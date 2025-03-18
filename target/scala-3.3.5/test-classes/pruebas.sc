import Derivacion._

val cte = (x:Double) => 2.0
val f = (x:Double) => (x*x)
val g = (x:Double) => (x*x*x)
val h = (x:Double) => f(x) / g(x)
val j = (x:Double) => g(x) / f(x)

val h1 = DerivadaDiv(f ,g)
val h2 = derivadaDiv1(f ,g)
val h3 = derivadaDiv(g, f)
val h4 = derivadaDiv1(g, f)