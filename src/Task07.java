import java.util.Scanner;
class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = new String();
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                tmp = String.valueOf((char)(str.charAt(i) + 32));
                newStr += tmp;
            } else if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                tmp = String.valueOf((char)(str.charAt(i) - 32));
                newStr += tmp;
            } else {
                newStr += "_";
            }
        }
        System.out.println(newStr);
    }
}
