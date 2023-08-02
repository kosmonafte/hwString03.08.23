import java.util.Scanner;
class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String arrStr[] = str.split(":");
        int count = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length()%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
