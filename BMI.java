import java.lang.Math;

public class BMI {
    private double weight;
    private double height;
 
    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;

    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double getBmi(BMI person){
        double weight = person.getWeight()*0.45359237;
        double height = person.getHeight()*0.0254;
        double BMI = (weight / (Math.pow(height,2)));
        return BMI;
    }

    public static String getInterpretation(double bmi){
        String BMIStatus = "";
        if (bmi < 18.5) {
            BMIStatus = "Underweight";
        }
        else if(bmi < 25.0){
            BMIStatus = "Normal";
        }
        else if(bmi < 30.0){
            BMIStatus = "Overweight";
        }
        else{
            BMIStatus = "Obese";
        }
        return BMIStatus;
    }

}