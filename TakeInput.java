
//*****************************************************************************
//    1. create an instance of the clasess(Scanner class, TakeInput class)
//            - Scanner scanner = new Scanner(System.in);
//            - TakeInput takeinput = new TakeInput(scanner);
//    2. now use the object (takeinput) to mainipulate data.
//*****************************************************************************



import java.util.Scanner;

public class TakeInput {
    private boolean boolInput;
    private byte byteInput;
    private short shortInput;
    private int intInput;
    private long longInput;
    private float floatInput;
    private double doubleInput;
    private char charInput;
    private String stringInput;


    public Scanner scanner;

    public TakeInput(Scanner scanner) {
         this.scanner = new Scanner(System.in);
    }

    public boolean boolInputPrompt() {
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline
        return value;
    }

    public byte byteInputPrompt() {
        System.out.print("Enter a byte value (-127 to 128): ");
        byte value = scanner.nextByte();
        scanner.nextLine(); // Consume newline
        return value;
    }

    public short shortInputPrompt(){
        System.out.print("Enter a short value (-32700 to 32700): ");
        short value = scanner.nextShort();
        scanner.nextLine();
        return value; 
    }

    public int intInputPrompt(){
        System.out.print("Enter an integer value : ");
        int value = scanner.nextInt();
        scanner.nextLine(); 
        return value;
    }
    
    public long longInputPrompt(){
        System.out.print("Enter a long integer value : ");
        long value = scanner.nextLong();
        scanner.nextLine();
        return value;
    }

    public float floatInputPrompt(){
        System.out.print("Enter a float value (six decimal digit's) : ");
        float value = scanner.nextFloat();
        scanner.nextLine();
        return value;
    }

    public double doubleInputPrompt(){
        System.out.print("Enter a double value (upto 15 decimal digits's) : ");
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public char charInputPrompt(){
        System.out.print("Enter a character (only one) : ");
        String stringValue = scanner.nextLine();

        char value = stringValue.charAt(0);
        scanner.nextLine();
        return value;
    }

    public String stringInputPrompt(){
        System.out.print("Enter a string : ");
        String value = scanner.nextLine();
        scanner.nextLine();
        return value;
    }


}
