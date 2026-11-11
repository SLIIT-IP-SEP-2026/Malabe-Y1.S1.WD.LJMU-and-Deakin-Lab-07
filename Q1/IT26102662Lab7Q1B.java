import java.util.Scanner;

public class IT26102662Lab7Q1B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		for (int s = 1; s <= 3; s++){
		
		
			System.out.println("Student " + s);
			System.out.print("Enter marks: ");
			int subjectMark1 = input.nextInt();
			int subjectMark2 = input.nextInt();
			int subjectMark3 = input.nextInt();
			int subjectMark4 = input.nextInt();

			double avg = (subjectMark1 + subjectMark2 + subjectMark3 + subjectMark4) / 4.0;
			System.out.println("Average is : " + avg);

			if (avg >= 75 && avg <= 100){
				System.out.println("Overall Grade is : Distinction");
			} 
			else if (avg >= 50 && avg <= 74){
				System.out.println("Overall Grade is : Credit");
			} 
			else{
				System.out.println("Overall Grade is : Fail");
			}
			
			System.out.println();
		}
	}
}