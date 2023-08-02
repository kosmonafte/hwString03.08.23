import java.util.Scanner;
class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String nStr = new String();
        for (int i = 0; i < str.length() + 1; i++) {
            nStr = "";
            for (int j = 0; j < str.length() - i; j++) {
                nStr += " ";
            }
            nStr += str.substring(0, i);
            System.out.println(nStr);
        }
        for (int i = 1; i < str.length() + 1; i++) {
            nStr = "";
            nStr += str.substring(i, str.length());
            for (int j = 0; j < 0 + i; j++) {
                nStr += " ";
            }
            System.out.println(nStr);
        }
    }
}
