import java.util.Scanner;
class Task02 {
    public static void main(String[] args) {
        String str = new String();
        for (int i = 1; i < 100; i++) {
            str += i;
        }
        System.out.println(str);
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        char symbol = str.charAt(index - 1);
        System.out.println(symbol);
    }
}
