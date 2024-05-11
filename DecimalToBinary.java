import java.util.Scanner;

class DecimalToBinary {
    
    // constructors
    DecimalToBinary(){}
    
    // methods
    int takeInput(Scanner scanner){
        int intInput = 0;
        String programFunction = "DECIMAL TO BINARY";
        boolean notValidInput = true;

        System.out.println(programFunction);
        for (int i = 0; i < programFunction.length(); i++){
            System.out.print("-");
        } 
        System.out.println();
        while (notValidInput){
            try{
                System.out.print("Enter Decimal Number : ");
                intInput = scanner.nextInt();
                notValidInput = false;
            } catch(Exception e){
                System.out.println("\t\t ENTER A VALID INTEGER, TRY AGAIN.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return intInput;
    }

    String decimalToBinary(int decimal){
        StringBuilder binaryBuilder = new StringBuilder();

        // Handle the case of the input being 0 separately
        if(decimal == 0)
            return "0";

        while(decimal != 0){
            binaryBuilder.append(decimal % 2);
            decimal /= 2;
        }

        // Reverse the binary representation
        binaryBuilder.reverse();

        return binaryBuilder.toString();
    }

    public static void main(String[] args){
        DecimalToBinary dtb = new DecimalToBinary();
        Scanner scanner = new Scanner(System.in);
        int input = dtb.takeInput(scanner);
        scanner.close(); // Close scanner after you're done with user input
        System.out.println("In Binary : " + dtb.decimalToBinary(input));
    } 
}
