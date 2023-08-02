import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        String str = "123451234512345qweqweqweyuyuyuiogfffvfgtuipopopohjkmnasdasdasdrtyhnjrtyurtyurtyuiqwertyqwertyqwerty";
        for (int j = 1; j < str.length()/3+1; j++) {
            //System.out.println(j);
            for (int i = 0; i < str.length() - 3*j+1; i++) {
                if (str.substring(i, i+j).equals(str.substring(i+j, i+j+j)) && str.substring(i, i+j).equals(str.substring(i+j+j, i+j+j+j))) {
                    System.out.println(str.substring(i, i+j));
                    System.out.println(str.substring(i+j, i+j+j));
                    System.out.println(str.substring(i+j+j, i+j+j+j));
                }
            }
        }
    }
}
