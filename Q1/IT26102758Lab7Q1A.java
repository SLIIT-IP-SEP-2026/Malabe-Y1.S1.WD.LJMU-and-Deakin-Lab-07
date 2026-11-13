

public class IT261102758Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;

        System.out.print("Enter mark 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter mark 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter mark 3: ");
        mark3 = input.nextInt();

        System.out.print("Enter mark 4: ");
        mark4 = input.nextInt();

        average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("Average = " + average);

        if (average >= 75) {
            System.out.println("Grade = Distinction");
        }
        else if (average >= 50) {
            System.out.println("Grade = Credit");
        }
        else {
            System.out.println("Grade = Fail");
        }

        input.close();
    }
}
