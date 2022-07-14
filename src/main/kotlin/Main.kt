fun main(args: Array<String>) {

    val names = arrayListOf("Henry", "Wilson", "Bruce Wayne", "Kakaroto")

    for(name in names){
        if(name == "Wilson")
            break
        println(name)
    }
}