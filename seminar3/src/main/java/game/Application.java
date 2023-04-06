package game;

import java.util.Scanner;

//1) доделать вариации с игрой на английском/русском языке, сигнатуры уже приведены в прикрепленном файле
//2) улучшить интерфейсную часть игры
//3) доработать статусную модель и выход из игры (в абстрактном классе тк функционал общий)
//4) * создать историю ходов и по окончании игры вывести её, в зависимости от ответа пользователя (y-вывести, n-выводить не следует)
//5) * сделать рестарт игры

public class Application {
    public static void main(String[] args) {
        int sizeWord = 4;
        int attempts = 20;
        Scanner scanner = new Scanner(System.in);
        String answer;
        while (true) {
            String moveHistory = newGame(sizeWord, attempts, scanner);
            System.out.println("Вывести историю ходов? (Y/N)");
            answer = scanner.nextLine();
            if (answer.toLowerCase().charAt(0) == 'y')
                System.out.println(moveHistory);
            System.out.println("Желаете сыграть еще партию? (Y/N)");
            answer = scanner.nextLine();
            if (answer.toLowerCase().charAt(0) == 'n') break;
        }
        scanner.close();
    }

    private static String newGame(int sizeWord, int attempts, Scanner scanner) {
        StringBuilder moveHistory = new StringBuilder();
        int moveNumber = 0;
        System.out.println("1 - цифры\n" +
                "2 - английские буквы\n" +
                "3 - русские буквы");
        System.out.println("Выберите игру: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                moveHistory.append("Игра с цифрами\n");
                break;
            case 2:
                game = new EnGame();
                moveHistory.append("Игра с английскими буквами\n");
                break;
            case 3:
                game = new RuGame();
                moveHistory.append("Игра с русскими буквами\n");
                break;
            default:
                System.out.println("Такая игра еще не добавлена!");
        }
        game.start(sizeWord, attempts);
        while (game.getGameStatus().equals(GameStatus.START)) {
            String output = ++moveNumber + " ход: ";
            System.out.println(output);
            moveHistory.append(output);
            String answer = scanner.nextLine();
            moveHistory.append(answer).append("\n");
            Answer answerGame = game.inputValue(answer);
            output = "коров - " + answerGame.getCow() + " , быков - " + answerGame.getBull();
            System.out.println(output);
            moveHistory.append(output).append("\n");
        }
        if (game.getGameStatus().equals(GameStatus.WIN)) {
            System.out.println("Вы выиграли!");
            moveHistory.append("Вы выиграли!\n");
        }
        else {
            System.out.println("Попытки кончились. Вы проиграли.");
            moveHistory.append("Попытки кончились. Вы проиграли.\n");
        }
        return moveHistory.toString();
    }
}
