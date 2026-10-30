import java.util.Scanner;
public class IT26102441Lab7Q1A{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter marks for subjects:");
		double sum = 0;
		double avg = 0;
		int i;
		
		for( i = 1; i<=4 ; i++){
			double mark_i = obj.nextDouble();
			
			if (mark_i<100 || mark_i>0){
				
				System.out.println("Enter subject marks: " +i+ " "+mark_i);
				sum = sum + mark_i;
				
			}else{
				System.out.println("Invalid marks");
				i--;
			}
		}
		
			
		
		avg = sum / 4.0;
		System.out.println("Average is : " + avg);
		
		if (avg>74){
			System.out.println("Overall grade is : distinction");
		}else if(avg>49){
			System.out.println("Overall grade is : credit");
		}else {
			System.out.println("Overall grade is : fail");
			}
	}
}