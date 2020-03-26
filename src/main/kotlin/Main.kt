import org.dom4j.DocumentHelper
import org.dom4j.io.OutputFormat
import org.dom4j.io.SAXReader
import org.dom4j.io.XMLWriter
import java.io.File
import java.io.FileWriter

fun main() {
    val reader = SAXReader()
    val input = File("src/main/resources/input.xml")
    val document = reader.read(input)
    val root = document.rootElement.createCopy()
    val childNodes = root.elements()
    childNodes.forEach {
        root.add(it.createCopy())
        root.add(it.createCopy())
    }
    val outputDocument = DocumentHelper.createDocument()
    outputDocument.add(root)
    FileWriter("src/main/resources/output.xml").use {
        val format = OutputFormat.createPrettyPrint()
        val writer = XMLWriter(it, format)
        writer.write(root)
    }
}