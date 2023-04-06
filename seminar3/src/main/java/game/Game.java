package game;

public interface Game {
    void start(Integer sizeWord, Integer attempts);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
