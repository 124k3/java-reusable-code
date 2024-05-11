
import java.util.Scanner;

class RemoveWhiteSpace{
    RemoveWhiteSpace(){}

    String takeStringInput(Scanner scanner){
        System.out.print("Enter String : ");
        String stringInput = scanner.nextLine();
        scanner.close();
        return stringInput;
    }


    String removeSpaces(String string){
        String noWhiteSpace = "";
        for (int i = 0; i< string.length(); i++){
            if(string.charAt(i) != ' '){
                noWhiteSpace += string.charAt(i);
            }
        }
        return noWhiteSpace;
    }


    void printResult(String string){
        System.out.println("Without Spaces : "+ string);
    }

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       RemoveWhiteSpace rws = new RemoveWhiteSpace();

//       String consoleInput;
//       consoleInput = rws.takeStringInput(scanner);
//       String processedInput = rws.removeSpaces(consoleInput);
//       rws.printResult(processedInput); 
       


       rws.printResult(rws.removeSpaces(rws.takeStringInput(scanner)));
    }
}
