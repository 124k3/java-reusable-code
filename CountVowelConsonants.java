
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
   

    int[] countConsVowel(String inputString){
        int[] consVow = new int[2];
        consVow[0] = 0;
        consVow[1] = 0;

        for(int i=0; i< inputString.length(); i++){
            if(inputString.charAt(i) == 'a' | inputString.charAt(i) =='e' | inputString.charAt(i) == 'i' | inputString.charAt(i) == 'o' | inputString.charAt(i) =='u'){
               consVow[1] +=1; 
            }
            else{
               consVow[0] +=1; 
            }
        }
    return consVow;    
    }
    


    void showResult(int[] consonantVowels){
        int consonant = consonantVowels[0];
        int vowel = consonantVowels[1];
        System.out.println("- The number of Consonant's : " +consonant);
        System.out.println("- The number of Vowel's : " +vowel);

    } 



    public static void main(String[] args){

    CountVowelConsonants cvc = new CountVowelConsonants();
    Scanner scanner = new Scanner(System.in);

    cvc.showResult(cvc.countConsVowel(cvc.getInput(scanner)));

    }
}
