class Application(val name: String) {

    // write the run method here
    fun run(args: Array<String>) {
        println(this.name)
        for (i in 0..args.size - 1) {
            println(args[i])
        }
    }
}