package chap3

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import scala.collection.mutable.Buffer
import scala.collection.JavaConversions.asScalaBuffer

/**
 * Created by Tracy on 2015-12-08.
 */
object chap3_10 {
    def main(args: Array[String]) {
        val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
        val buf: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
        buf.foreach(println)
    }
}
