

import java.util.HashMap;
import java.util.Scanner;


class CountDublicates{
    private String inputString;
    CountDublicates(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter to find re-occuring characters: ");
        this.inputString = scanner.nextLine();
        scanner.close();
    }

    static HashMap<Character, Integer> getDublicateCount(String string){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = string.toCharArray();
        for(char c: charArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        return map;
    }
    public static void main(String[] args){
       CountDublicates countChr = new CountDublicates();
HashMap<Character, Integer> occurances = countChr.getDublicateCount(countChr.inputString);
       System.out.println("Original String: "+countChr.inputString);
       System.out.println("COUNT: "+occurances);
    }

}
