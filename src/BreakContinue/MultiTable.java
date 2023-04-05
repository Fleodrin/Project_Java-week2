package BreakContinue;

class MultiTable {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            if (i == 5) {
                break; //continue
            }
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println(" ");
        }
    }
}
