package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Referee referee = new Referee();

        boolean isContinue = true;
        while (isContinue) {
            playGame(scanner, referee);
            isContinue = askTry(scanner);
        }
    }

    private static void playGame(Scanner scanner, Referee referee) {
        RandomNumbers computerNumbers = new RandomNumbers();
        boolean isSolved = false;

        while (!isSolved) {
            System.out.print("숫자를 입력해 주세요 : ");
            String input = scanner.next();
            validateInput(input);

            List<Integer> userNumbers = convertToNumbers(input);
            int strikes = referee.countStrike(computerNumbers.getNumbers(), userNumbers);
            int balls = referee.countBall(computerNumbers.getNumbers(), userNumbers);

            printResult(balls, strikes);
            isSolved = (strikes == 3);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private static void printResult(int balls, int strikes) {
        if (balls == 0 && strikes == 0) {
            System.out.println("낫싱");
            return;
        }

        String result = "";
        if (balls > 0) {
            result += balls + "볼 ";
        }
        if (strikes > 0) {
            result += strikes + "스트라이크";
        }
        System.out.println(result.trim());
    }

    private static boolean askTry(Scanner scanner) {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String command = scanner.next();
        return command.equals("1");
    }

    private static List<Integer> convertToNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        for (char c : input.toCharArray()) {
            numbers.add(Character.getNumericValue(c));
        }
        return numbers;
    }

    public static void validateInput(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자를 입력해야 합니다.");
        }
    }
}