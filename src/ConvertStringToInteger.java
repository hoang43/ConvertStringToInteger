import java.util.Scanner;

public class ConvertStringToInteger {
    private final int MIN = (int) -Math.pow(2, 31);
    private final int MAX = (int) (Math.pow(2, 31) - 1);

    public long myAtoi(String s) {
        int index = 0;
        boolean positive = true;
        long numberResult = 0;
        if (s.length() <= 0 || s.length() >= 200) {
            return 0;
        }
        while (s.charAt(index) == ' ') {
            index++;
        }
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            positive = (s.charAt(index) == '+') ? true : false;
            index++;
        }
        if (s.charAt(index) - '0' < 0 || s.charAt(index) - '0' > 9) {
            return 0;
        }
        while (index < s.length() && (s.charAt(index) - '0' >= 0) && (s.charAt(index) - '0' <= 9)) {
            numberResult = numberResult * 10 + (s.charAt(index) - '0');
            index++;
        }

        numberResult = positive ? numberResult : (-1) * numberResult;
        if (numberResult > MAX) {
            return MAX;
        } else if (numberResult < MIN) {
            return MIN;
        }
        return numberResult;
    }
    public void greeting(){
        System.out.println("Test new branch");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ConvertStringToInteger solution = new ConvertStringToInteger();
        long result = solution.myAtoi(s);
        System.out.println(result);

    }
}
