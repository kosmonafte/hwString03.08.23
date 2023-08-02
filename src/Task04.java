import java.util.Scanner;
class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String arrStr[] = str.split(" ");
        String glassn = "aeiouy";
        String soglassn = "bcdfghjklmnpqrstvwxz";
        for (int i = 0; i < arrStr.length; i++) {
            if (glassn.contains(String.valueOf(arrStr[i].charAt(0))) && soglassn.contains(String.valueOf(arrStr[i].charAt(arrStr[i].length() - 1)))) {
                System.out.println(arrStr[i]);
            }
        }
    }
}
