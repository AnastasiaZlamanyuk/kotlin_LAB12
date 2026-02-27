package gameCharacter

class GameCharacter(
    val name: String,
    var state: CharacterState = CharacterState.Inactive
){
    fun change(new: CharacterState){
        state = new
    }
}