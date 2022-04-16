import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookWithArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String newStudent;

        System.out.println("Enter your students (or Enter to finsh):");
        do{
            newStudent = input.nextLine();
            if (!newStudent.equals((""))){
                students.add(newStudent);
            }
        }while(!newStudent.equals(""));
        for (String student : students){
            System.out.println("Grade for "+student+":");
            Double grade = input.nextDouble();
            grades.add(grade);
        }
        System.out.println("\nClass roster:");
        double sum = 0.0;
        for (int i = 0; i<students.size(); i++){
            System.out.println(students.get(i) +"("+grades.get(i)+")");
            sum += grades.get(i);
        }
        double avg = sum / students.size();
        System.out.println("Average grade:" +avg);
        }
    }

