package outpostState

import java.io.File

class StateStorage {
    private val outpost = "outpost_state.txt"
    fun save(resources: List<ObservableResource>) {
        val file = File(outpost)
        file.writeText(
            resources.joinToString("\n") {
                "${it.name};${it.amount}"
            }
        )
        println("Состояние сохранено")
    }
    fun load(): List<ObservableResource> {
        val file = File(outpost)
        if (!file.exists()) return emptyList()
        return file.readLines().map { line ->
            val (name, amount) = line.split(";")
            ObservableResource(name, amount.toInt())
        }
    }
}