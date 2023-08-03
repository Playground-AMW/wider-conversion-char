public class Demo1 {
    public static void main(String[] args) {
        byte myByte = -10;
        char myChar = (char) myByte;           // sign extended more accuracy 
        int myInt = myChar;
        short myShort = (short)myChar;
        byte myByte2 = (byte) myChar;
        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(myByte2);
        System.out.println(Integer.toBinaryString(myInt));

        System.out.println("............................");

        char myChar2 = (char) (myByte & 0xFF);  // sign not extended less accuracy
        int myInt2 = myChar2;
        short myShort2 = (short) myChar2;
        byte myByte3 = (byte) myChar2;
        System.out.println(myInt2);
        System.out.println(myShort2);
        System.out.println(myByte3);
        System.out.println(Integer.toBinaryString(myInt2));
    }
}