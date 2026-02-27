package outpostState

class OutpostManager {
    val resources = mutableListOf<ObservableResource>()
    init {
        println("Менеджер создан")
    }
    fun add(resource: ObservableResource){
        resources.add(resource)
    }
}
val manager: OutpostManager by lazy { OutpostManager() }