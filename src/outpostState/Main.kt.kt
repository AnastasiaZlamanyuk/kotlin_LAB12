package outpostState

fun main() {
    println("Доступ к менеджеру...")
    val minerals = ObservableResource("Алмазы", 100)
    val gas = ObservableResource("Серебро", 50)
    manager.add(minerals)
    manager.add(gas)
    println("\nИзменяем количество ресурсов:")
    minerals.amount = 150
    gas.amount = 75
    val storage = StateStorage()
    storage.save(manager.resources)
    println("\nПроверка загруженных данных:")
    val loadedResources = storage.load()
    loadedResources.forEach { resource ->
        println("Ресурс: ${resource.name} - ${resource.amount}")
    }
    ResourceObserver().observe(manager.resources[0])
}