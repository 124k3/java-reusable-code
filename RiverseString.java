
import java.util.Scanner;

class RiverseString{
    static String takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    static String riverseInput(String string){
        String riversed= "";
        for(int index  = string.length()-1; index >=  0;index--){
           riversed += string.charAt(index); 
        }
        riversed += " ";
        return riversed;
    }
    public static void main(String[] args){
        RiverseString rs = new RiverseString();
        String inputString = rs.takeInput();
        String riversedString = rs.riverseInput(inputString);
        System.out.println("Original String : "+inputString);
        System.out.println("Riversed String : "+riversedString);
    }
}
