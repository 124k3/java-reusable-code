import java.util.Scanner;

class CheckDigits{
    CheckDigits(){
    }

   int getInput(Scanner scanner){
        System.out.print("Enter the number: ");
        String inputString = scanner.nextLine();
        return Integer.parseInt(inputString);
    }


    public static void main(String[] args){

        CheckDigits checkdigits = new CheckDigits();
        Scanner scanner = new Scanner(System.in);

        boolean notValidInput = true;
        while(notValidInput){
            try{
                int inputInteger =checkdigits.getInput(scanner);
                notValidInput = false;
             }catch(NumberFormatException e){
                 System.out.println("Invalid Input: TRY AGAIN!");
             }
        }
        scanner.close();
        System.out.println("VALID INPUT");
    }
}
