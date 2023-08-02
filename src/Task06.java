
class Task06 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 99999; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("13")) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}

