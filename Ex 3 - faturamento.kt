fun main(){

    val faturamentoMensal : HashMap<Int, Double> = HashMap()
        faturamentoMensal[1] = 22174.1664
        faturamentoMensal[2] = 24537.6698
        faturamentoMensal[3] = 26139.6134
        faturamentoMensal[4] = 0.0
        faturamentoMensal[5] = 0.0
        faturamentoMensal[6] = 26742.6612
        faturamentoMensal[7] = 0.0

    var lowestValue = faturamentoMensal.values.elementAt(0) 
    var highestValue =  faturamentoMensal.values.elementAt(0)
    var sum = 0.0
    var average : Double
    var aboveAverageDays = 0

    for(i in 0 until faturamentoMensal.size -1) {
        
        if(faturamentoMensal.values.elementAt(i) != 0.0) {
            if(faturamentoMensal.values.elementAt(i) > highestValue) {
                highestValue = faturamentoMensal.values.elementAt(i)
            } else {
                lowestValue = faturamentoMensal.values.elementAt(i)
            }
        }

        sum += faturamentoMensal.values.elementAt(i)

    }

    average = sum / faturamentoMensal.size

    for (i in 0 until faturamentoMensal.size -1) {
        if(faturamentoMensal.values.elementAt(i) > average)
           aboveAverageDays += 1
    }

    println("O menor valor de faturamento ocorrido em um dia do mês: " + lowestValue)
    println("O maior valor de faturamento ocorrido em um dia do mês: " + highestValue)
    println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + aboveAverageDays)

}