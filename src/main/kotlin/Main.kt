fun main(args: Array<String>) {
    val amount = 1000
    val commission = if (amount/100*0.75>35) amount/100*0.75 else 35
    println("Сумма перевода $amount руб")
    println("Сумма комиссии $commission руб")
}