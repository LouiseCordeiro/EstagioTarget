fun main(){
    
    var total = 0.0
    val state: HashMap<String, Double> = HashMap()
    state["SP"] = 67836.43
    state["RJ"] = 36678.66
    state["MG"] = 29229.88
    state["ES"] = 27165.48
    state["Outros"] = 19849.53

      state.values.forEach{
            total += it
        }
        for (i in 0 until state.size) {  
        println(state.keys.elementAt(i) + " " + (state.values.elementAt(i) * 100 / total).toInt() + "%")
    } 
}