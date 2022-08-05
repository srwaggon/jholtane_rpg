# What is this?
This is an adventure game that jholtane and I are building incrementally for learning.

## Requirements
- [x] When the game is started, then player gets a gameover message (immediately).
- [x] The player can enter their name, then they get a gameover (with a customized message that includes their name).
- [x] The player is prompted for their name.
- [x] After the player enters their name, they are then prompted for a word that describes their character. The game then praises their attribute. (then they lose).
- [x] The game describes a challenge that the character faces, and how they use their attribute (description word) to overcome it.
- [x] The character faces a _challenge of strength_ (stone blocking their path?). If the character is "strong" then they pass and receive a message (but not a gameover). If they are not "strong", they get a gameover.
- [x] When the character fails the challenge of strength, they get a failure message, but no longer a game over upon failure. The game always results in a gameover (like before).
- [x] The character also faces a _challenge of speed_ (running across a log??). Similar to the challenge of strength, have a success message and a failure message.
- [x] The character does not face both trials. Instead, only one is chosen (at random, 50% chance each).
- [x] There exists a 3rd type of challenge (stamina/wit/intelligence/charm) that is faced if the character does not face either of the previous challenges.
- [x] The character faces 5 trials, randomly selected from the pool of various (3-6 or so) trials we've created.
- [ ] The challenges are proportionally equally likely to occur.

[//]: # (- [ ] At the beginning of the game, the character has 5 health. When they fail a challenge, they lose 1 health. After the 10 challenges, if the character has any health remaining, they get the happy ending. If they have no health remaining, they get the bad ending.)
[//]: # (abstract out the challenges)
[//]: # (character class?)
[//]: # (challenge class?)