import java.util.Scanner;
class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String nStr = new String();
        if (str.contains("_")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '_') {
                    nStr += String.valueOf((char)(str.charAt(i+1)-32));
                    i++;
                } else {
                    nStr += String.valueOf(str.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 91) {
                    nStr += "_" + String.valueOf((char)(str.charAt(i) + 32));
                } else {
                    nStr += String.valueOf(str.charAt(i));
                }
            }
        }
        System.out.println(nStr);
    }
}
