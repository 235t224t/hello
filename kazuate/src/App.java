import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int targetNumber = 42;  // 設定する数（例として42を使用）
        int maxGuesses = 5;    // ユーザが入力できる回数
        int guessesRemaining = maxGuesses;

        Scanner scanner = new Scanner(System.in);

        System.out.println("2桁の正の整数を予想して入力してください。");

        while (guessesRemaining > 0) {
            System.out.print("予想: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                if (Math.abs(userGuess - targetNumber) >= 20) {
                    System.out.println("20以上差があります。");
                } else {
                    if (userGuess > targetNumber) {
                        System.out.println("入力した数は設定された数より大きいです。");
                    } else {
                        System.out.println("入力した数は設定された数より小さいです。");
                    }
                }

                guessesRemaining--;
                System.out.println("残りの予想回数: " + guessesRemaining);
            }
        }

        if (guessesRemaining == 0) {
            System.out.println("予想回数を使い切りました。ゲームオーバー！");
        }

        scanner.close();
    }
}
