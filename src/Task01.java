import java.util.Scanner;class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        str = scan.nextLine();
        String symbolStr = new String();
        symbolStr = scan.nextLine();
        char smb = symbolStr.charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (smb == str.charAt(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count > 0) {
            System.out.println();
            System.out.println(count);
        } else {
            System.out.println("Совпадения не найдены");
        }
    }
}
