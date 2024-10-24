//Autoboxing and unboxing
public class prog3 {

    public static void main(String[] args) {
        // Autoboxing: converting primitives to their respective wrapper class objects
        // For all data types
        Integer intObj = 10;        // int to Integer
        Byte byteObj = 20;          // byte to Byte
        Short shortObj = 30;        // short to Short
        Long longObj = 4000L;       // long to Long
        Float floatObj = 5.75f;     // float to Float
        Double doubleObj = 6.45;    // double to Double
        Character charObj = 'A';    // char to Character
        Boolean boolObj = true;     // boolean to Boolean

        // Displaying the objects (Autoboxing)
        System.out.println("Autoboxing:");
        System.out.println("Integer object: " + intObj);
        System.out.println("Byte object: " + byteObj);
        System.out.println("Short object: " + shortObj);
        System.out.println("Long object: " + longObj);
        System.out.println("Float object: " + floatObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);

        // Unboxing: converting wrapper objects back to primitives
        int intValue = intObj;        // Integer to int
        byte byteValue = byteObj;     // Byte to byte
        short shortValue = shortObj;  // Short to short
        long longValue = longObj;     // Long to long
        float floatValue = floatObj;  // Float to float
        double doubleValue = doubleObj;  // Double to double
        char charValue = charObj;     // Character to char
        boolean boolValue = boolObj;  // Boolean to boolean

        // Displaying the primitive values (Unboxing)
        System.out.println("\nUnboxing:");
        System.out.println("int value: " + intValue);
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);
    }
}
