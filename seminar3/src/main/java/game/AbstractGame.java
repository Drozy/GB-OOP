package game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;


    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWorld();
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
        }
        if (--attempts < 1) this.gameStatus = GameStatus.LOSE;
        if (bulls == 4 && cows == 4) this.gameStatus = GameStatus.WIN;
        return new Answer(value, cows, bulls);
    }

    @Override
    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    private String generateWorld() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWord = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWord = resWord.concat(charList.get(randomIndex));
            charList.remove(randomIndex); //убирает повторы символов для упрощения игры
        }
        return resWord;
    }

    abstract List<String> generateCharList();
}
