import java.util.Scanner;

public class BMIMAIN {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble()*0.45359237;

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble()*0.0254;

        BMI person = new BMI(weight, height);

        System.out.println("BMI is " + person.getBmi());

        input.close();

        if (person.getBmi() < 18.5){
            System.out.println("Underweight");
        }
        else if (person.getBmi() >= 18.5 && person.getBmi() < 25.0){
            System.out.println("Normal");
        }
        else if (person.getBmi() >= 25.0 && person.getBmi() < 30.0){
            System.out.println("Overweight");
        }
        else if (person.getBmi() >= 30.0){
            System.out.println("Obese");
        }

    }
}
