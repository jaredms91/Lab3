import java.util.Scanner;

public class HexAndBinaryDecoder {
    public static void main(String args[]) {
        //Adding comment for testing

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Decode a hex string.");
            System.out.println("2. Decode a binary string.");
            System.out.println("3. Convert binary to hex.");
            System.out.println("4. Quit.");

            int option = input.nextInt();

            if (option == 1) {
                System.out.println("Please enter the hex string:");
                String inputHexString = input.next();
                System.out.println("Result: " + hexStringDecode(inputHexString));
            } else if (option == 2) {
                System.out.println("Please enter the binary string:");
                String inputBinString = input.next();
                System.out.println("Result: " + binaryStringDecode(inputBinString));
            } else if (option == 4) {
                System.out.println("Quitting program.");
                System.exit(0);
            }
        }
    }

    public static long hexStringDecode(String hex) {
        int powCounter = 0;
        double sum = 0;

        if (hex.charAt(0) == '0' && hex.charAt(1) == 'x') {
            hex = hex.substring(2);
        }

        char[] hexCharArray = hex.toCharArray();
        int[] hexIntArray = new int[hexCharArray.length];


        for (int i = 0; i < hexCharArray.length; ++i) {
            if (hexCharArray[i] == 'A' || hexCharArray[i] == 'a') {
                hexIntArray[i] = 10;
            } else if (hexCharArray[i] == 'B' || hexCharArray[i] == 'b') {
                hexIntArray[i] = 11;
            } else if (hexCharArray[i] == 'C' || hexCharArray[i] == 'c') {
                hexIntArray[i] = 12;
            } else if (hexCharArray[i] == 'D' || hexCharArray[i] == 'd') {
                hexIntArray[i] = 13;
            } else if (hexCharArray[i] == 'E' || hexCharArray[i] == 'e') {
                hexIntArray[i] = 14;
            } else if (hexCharArray[i] == 'F' || hexCharArray[i] == 'f') {
                hexIntArray[i] = 15;
            } else {
                hexIntArray[i] = Character.getNumericValue(hexCharArray[i]);
            }
        }


        for (int i = hexIntArray.length - 1; i >= 0; --i) {
            double hexPow = Math.pow(16, powCounter);
            double sumValue = hexIntArray[i] * hexPow;
            sum = sum + sumValue;
            powCounter = powCounter + 1;
        }

        long longSum = (long) sum;
        return longSum;
    }

    public static long binaryStringDecode(String bin) {
        int powCounter = 0;
        double sum = 0;

        if (bin.charAt(0) == '0' && bin.charAt(1) == 'b') {
            bin = bin.substring(2);
        }

        char[] binCharArray = bin.toCharArray();
        int[] binIntArray = new int[binCharArray.length];

        for (int i = 0; i < binCharArray.length; ++i) {
            binIntArray[i] = Character.getNumericValue(binCharArray[i]);
        }

        for (int i = binIntArray.length - 1; i >= 0; --i) {
            double binPow = Math.pow(2, powCounter);
            double sumValue = binIntArray[i] * binPow;
            sum = sum + sumValue;
            powCounter = powCounter + 1;
        }

        long longSum = (long) sum;
        return longSum;
    }

    public static short hexCharDecode(char hexChar) {
        if (hexChar == 'A' || hexChar == 'a') {
            hexChar = 10;
        } else if (hexChar == 'B' || hexChar == 'b') {
            hexChar = 11;
        } else if (hexChar == 'C' || hexChar == 'c') {
            hexChar = 12;
        } else if (hexChar == 'D' || hexChar == 'd') {
            hexChar = 13;
        } else if (hexChar == 'E' || hexChar == 'e') {
            hexChar = 14;
        } else if (hexChar == 'F' || hexChar == 'f') {
            hexChar = 15;
        } else if (hexChar == '1'){
            hexChar = 1;
        } else if (hexChar == '2'){
            hexChar = 2;
        } else if (hexChar == '3'){
            hexChar = 3;
        } else if (hexChar == '4'){
            hexChar = 4;
        } else if (hexChar == '5'){
            hexChar = 5;
        } else if (hexChar == '6'){
            hexChar = 6;
        } else if (hexChar == '7'){
            hexChar = 7;
        } else if (hexChar == '8'){
            hexChar = 8;
        } else if (hexChar == '9'){
            hexChar = 9;
        } else if (hexChar == '0'){
            hexChar = 0;
        }
        short shortHexChar = (short) hexChar;
        return shortHexChar;
    }
}