object printArgs {
    def main(args: Array[String]): Unit = {
        printArgs3(args)
    }

    def printArgs2(args: Array[String]): Unit = {
        for (arg <- args) {
            println(arg)
        }
    }

    def printArgs3(args: Array[String]) = {
        args.foreach(arg => println(arg))
    }

    def printArgs4(args: Array[String]) = {
        args.foreach(println)
    }

    def printArgs(args: Array[String]): Unit = {
        var i = 0
        while (i < args.length) {
            if (i != 0) print(" ")
            print(args(i))
            i += 1
        }
    }

}
