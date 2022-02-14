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

    public double getBmi(){
        double BMI = (weight / (Math.pow(height,2)));
        return BMI;
    }

}