package outpostState

class ResourceObserver() {
    fun observe(resource: ObservableResource) {
        println("Наблюдатель: отслеживаем ресурс ${resource.name}")
    }
}