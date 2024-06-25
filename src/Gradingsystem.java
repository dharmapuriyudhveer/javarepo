import java.util.Scanner;

public class Gradingsystem 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the name :");
        String name=sc.nextLine();

        System.out.println("Enter the age :");
        int age=sc.nextInt();

        System.out.println("ENter the exam Score :");
        int score=sc.nextInt();

        String grade;

        if(score>=90)
            grade="A";
        else if(score >= 80 && score < 90)
            grade="B";
        else if(score >= 70 && score < 80)
            grade="C";
        else if(score >= 60 && score < 70)
            grade="D";
        else
            grade="F";

        System.out.println("Name :" +name);
        System.out.println("Age :" + age);
        System.out.println("Exam score :" + score);
        System.out.println("Grade :" +grade);

        if(age <=25 && grade == "A" || grade == "B") 
            System.out.println("You will get the scholarship");
        else
            System.out.println("You will not get the scholarship");

    }
}
