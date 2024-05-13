
import java.util.Scanner;

class BinaryToDecimal{

    BinaryToDecimal(){}

    int getInput(Scanner scanner){
        boolean invalidInput = true;
        int binaryInput= 0;

        while(invalidInput){
        try{
            final String PROGRAM_TITLE = "BINARY TO DECIMAL";
            System.out.println(PROGRAM_TITLE);
            System.out.print("Enter in Binary : ");
            binaryInput = scanner.nextInt();
            invalidInput = false;
        }catch(Exception e){
            System.out.println("\n\t\t Dawg, enter a Valid Input!\n");
        }finally{
            scanner.nextLine();
        }
    }
    return binaryInput;
    }

    int[] toArray(int number){
        String numString = Integer.toString(number);
        int[] intArray = new int[Integer.toString(number).length()];
        for(int i=0; i<intArray.length;i++){
            intArray[i] = Character.getNumericValue(numString.charAt(i));
        }
        return intArray;
    }

    int getDecimal(int[] binaryArray){
        int decimal = 0;
        for (int i=0; i<= binaryArray.length -1; i++){

            int exponent = binaryArray.length - (i+1);
            if(binaryArray[i] ==1){
            decimal += (int)Math.pow(2, exponent);
            }
        }

        return decimal;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        BinaryToDecimal btd = new BinaryToDecimal();

        // getting binary input from the user.
        int binaryInput = btd.getInput(scanner);
        scanner.close();

        // converting the binary input into the array.
        int[] binaryArray = btd.toArray(binaryInput);

        // using the array obtained earlier to get the decimal equivalent value
        int decimalValue = btd.getDecimal(binaryArray);

        System.out.println("In Decimal : " + decimalValue);
    }
}
