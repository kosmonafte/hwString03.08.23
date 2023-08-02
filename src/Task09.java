import java.util.Scanner;
import java.util.Arrays;
class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.nextLine().toLowerCase();
        String secondStr = scanner.nextLine().toLowerCase();
        int arr[] = new int[26];
        int arr2[] = new int[26];
        for (int i = 0; i < firstStr.length(); i++) {
            if (firstStr.charAt(i) > 96 && firstStr.charAt(i) < 123) {
                arr[firstStr.charAt(i) - 97]++;
            }
        }
        for (int i = 0; i < secondStr.length(); i++) {
            if (secondStr.charAt(i) > 96 && secondStr.charAt(i) < 123) {
                arr2[secondStr.charAt(i) - 97]++;
            }
        }
        if (Arrays.equals(arr, arr2)) {
            System.out.println("Строки анаграммы");
        } else {
            System.out.println("Строки не анаграммы");
        }
    }
}
