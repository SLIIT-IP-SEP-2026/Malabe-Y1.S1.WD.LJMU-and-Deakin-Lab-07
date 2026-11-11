import java.util.Scanner;
 
public class IT26102566Lab7Q1B{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
    for(int i=1; i<=3; i++){
      System.out.println("Student "+i);
      System.out.print("Enter marks: ");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      double d = sc.nextDouble();
 
      double avg = (a+b+c+d)/4;
      System.out.println("Average is : "+avg);
 
      if(avg>=75){
        System.out.println("Overall Grade is : Distinction");
      }
      else if(avg>=50){
        System.out.println("Overall Grade is : Credit");
      }
      else{
        System.out.println("Overall Grade is : Fail");
      }
      System.out.println();
    }
  }
}