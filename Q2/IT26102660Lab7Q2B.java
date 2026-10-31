public class IT26102660Lab7Q2B {
    public static void main(String[] args) {
        for (int Num = 1; Num <= 5; Num++) {
            System.out.print(Num + " - ");

            for (int star = 1; star <= Num; star++) {
                System.out.print("*");
                if (star < Num) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}