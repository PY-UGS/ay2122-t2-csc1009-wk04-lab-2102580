import java.util.Scanner;

public class BMIMAIN {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        BMI person = new BMI(weight, height);

        double bmi = BMI.getBmi(person);
        String result = BMI.getInterpretation(bmi);

        System.out.println("BMI is " + bmi);
        System.out.println(result);

        input.close();

        

    }
}
