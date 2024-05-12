
import java.util.Scanner;

class CountVowelConsonants{
    

    String getInput(Scanner scanner){
        String programTitle ="VOWELS-CONSONANTS COUNTER";
        System.out.println(programTitle);
        for(int i = 0; i < programTitle.length(); i++){
            System.out.print("=");
        }
        System.out.println();
        System.out.print("Enter the String: ");
        String inputString = scanner.nextLine();
        scanner.close();
        return inputString;
    }
   

    int[] countOccurances(String inputString){
        int[] occurances = new int[4];
        // 0 = symbols 
        // 1 = numbers 
        // 2 = vowels 
        // 3 = consonants 

        for (int i = 0; i < occurances.length; i++){
            occurances[i] = 0;

        // fill the array with zero's
        }

        for(int i=0; i< inputString.length(); i++){
           int stringChar = inputString.charAt(i); 

           if ((stringChar >= 32) && (stringChar <= 47) || (stringChar >=59) && (stringChar<= 64) || (stringChar >= 91) && (stringChar<= 96) || (stringChar >= 123) && (stringChar <=127)){
               occurances[0] +=1; // the symbols
           }else if(stringChar >= 48 && stringChar <= 57) {
               occurances[1] +=1; // the numbers
           }else if(stringChar >= 97 && stringChar <= 122){

               if(stringChar == (int)'a' || stringChar == (int)'e' || stringChar == (int)'i' || stringChar == (int)'o' || stringChar == (int)'u'){
                   occurances[2] += 1; // vowels
               }else {
                   occurances[3] +=1; // consonants
               }
           }
        }
    return occurances;    
    }
    
    void showResult(int[] occurances){

        int symbols = occurances[0];
        int numbers = occurances[1];
        int vowel = occurances[2]; 
        int consonant = occurances[3];

        System.out.println("- The number of Consonant's : " +consonant);
        System.out.println("- The number of Vowel's : " +vowel);

        System.out.println("- The number of NUmber's : " + numbers);
        System.out.println("- The number of Symbol's (spaces included) : " + symbols);


    } 



    public static void main(String[] args){

    CountVowelConsonants cvc = new CountVowelConsonants();
    Scanner scanner = new Scanner(System.in);

    cvc.showResult(cvc.countOccurances(cvc.getInput(scanner)));

    }
}
