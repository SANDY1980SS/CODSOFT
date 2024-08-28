import java.util.*;
public class StudentGradeCal {
    public void GradeCal(int[] marks){
        float total=0,avgPercentage=0,sum=0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
        }
        total = sum/500;
        avgPercentage = total*100;
        System.out.println(avgPercentage);
        while(avgPercentage>0 && avgPercentage<100){
        if(avgPercentage > 90){
            System.out.println(avgPercentage + " Grade A");
            break;
        }
        else if(avgPercentage < 90 && avgPercentage > 75){
            System.out.println(avgPercentage + " Grade B");
            break;
        }
        else if(avgPercentage < 75 && avgPercentage > 55){
            System.out.println(avgPercentage + " Grade C");
            break;
        }
        else if(avgPercentage < 55 && avgPercentage > 33){
            System.out.println(avgPercentage + " Grade D");
            break;
        }
        else if(avgPercentage < 33 && avgPercentage > 0){
            System.out.println(avgPercentage + " Grade Fail");
            break;
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentGradeCal ob = new StudentGradeCal();
        System.out.println("<------------Welcome Student-------------->");
        System.out.println("Enter the marks of your subjects");
        System.out.println("DSA , ENGINEERING MATHEMATICS, COA, DISCRETE STRUCTURE, PYTHON PROGRAMMING");
        int[] marks = new int[5];
        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
        }
        ob.GradeCal(marks);
        
    }
}
