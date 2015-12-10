package chap9.chap9_9

import java.io.File

/**
 * Created by Tracy on 2015-12-10.
 * 盘点给定目录及其子目录中总够有多少个以.class为扩展名的文件
 */
object chap9_9 extends App {
    //subdir(new File("./out"))

    for(file <- subdir2(new File("./out"))) println(file.getName)

    def subdir(dir: File): Unit = {
        for (file <- dir.listFiles) {
            if (file.isDirectory) {
                subdir(file)
            } else {
                if (file.getName.endsWith(".class"))
                    println(file.getName)
            }
        }
    }

    def subdir2(dir: File): Iterator[File] = {
        val children = dir.listFiles.filter(_.getName.endsWith(".class"))
        children.iterator ++ dir.listFiles.filter(_.isDirectory).toIterator.flatMap(subdir2(_))
    }

}
