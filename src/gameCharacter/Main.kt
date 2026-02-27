package gameCharacter

fun handle(state: CharacterState){
    when(state){
        CharacterState.Inactive -> println("Персонаж бездействует")
        CharacterState.Run -> println("Персонаж бежит")
        is CharacterState.Fight -> println("Персонаж атакует с уроном ${state.damage}")
        is CharacterState.Die -> println("Персонаж погиб: ${state.cause}")
    }
}
fun main() {
    val person = GameCharacter("Жанна Гафк")
    println(person.name)
    handle(person.state)
    person.change(CharacterState.Run)
    handle(person.state)
    person.change(CharacterState.Fight(2))
    handle(person.state)
    person.change(CharacterState.Die("несчастный случай"))
    handle(person.state)
}