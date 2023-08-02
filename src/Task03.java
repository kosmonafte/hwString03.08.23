import java.util.Scanner;
class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strArr[] = str.split(" ");
        //int intArr[] = new int[strArr.length];
        int summ = 0;
        for (int i = 0; i < strArr.length; i++) {
            summ += strArr[i].length();
        }
        System.out.println(summ / strArr.length);
    }
}
