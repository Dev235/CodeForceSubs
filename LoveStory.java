import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            int count = 0;

            for (int j = 0; j < 10; j++) {
                if (s.charAt(j) != "codeforces".charAt(j)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
