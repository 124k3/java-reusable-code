
import java.util.Scanner;

class PercentOfValue{

    private Scanner scanner;

    PercentOfValue(){
        this.scanner = new Scanner(System.in);
    }
    

    double getDoubleInput(String prompt){
        double input= 0;
        boolean invalidInput = true;

        while (invalidInput){
            try{
            System.out.print(prompt);
            input = Integer.parseInt(scanner.nextLine());
            invalidInput = false;
            }catch(Exception e){
                System.out.println("Invalid Input, Try AGAIN!");
                scanner.nextLine();
            }
        }
        return input;
    }

    double getPercentDouble(double value, double percent){
        double calculatedPercentage;
        calculatedPercentage = (percent/100) * value;
        return calculatedPercentage;
    }



    public static void main(String[] args){

        PercentOfValue pov = new PercentOfValue();
        // Scanner scanner = new Scanner(System.in);

        double value = pov.getDoubleInput("Enter the 'value' to find percentage of : ");
        double percent = pov.getDoubleInput( "Enter the 'percentage' you want to calculate : ");
        pov.scanner.close();

        System.out.println(percent+ " Percent of " +value+" is : "+ +pov.getPercentDouble(value, percent));

    }
}
