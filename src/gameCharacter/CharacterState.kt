package gameCharacter

sealed class CharacterState{
    object Inactive: CharacterState()
    object Run: CharacterState()
    data class Fight(val damage: Int): CharacterState()
    data class Die(val cause: String): CharacterState()
}