public class testing {

    public static void main(String[] args){
     for(int x = 0; x <=100; x++){
         for(int y = 0; y<=100; y++) {
            if(binaryAdd(x,y) != x+y){
                System.out.println("There is an error at..." + x + ", " + y);
                System.out.println("Expected output: " + (x+y) + "\nCurrent output: " + binaryAdd(x,y));
            }
         }
     }
    }

    static int binaryAdd(int number1, int number2){
     int sum;
     int and1, and2, xor1, xor2, xor3, and3, xor4, and4, xor5, and5, xor6, and6, xor7, and7;
         and1 = (number1 & number2) << 1;
         xor1 = (number1 ^ number2);
         and2 = (xor1 & and1) << 1;
         xor2 = (xor1 ^ and1);
         and3 = (xor2 & and2) << 1;
         xor3 = (xor2 ^ and2);
         and4 = (xor3 & and3) << 1;
         xor4 = (xor3 ^ and3);
         and5 = (xor4 & and4) << 1;
         xor5 = (xor4 ^ and4);
         and6 = (xor5 & and5) << 1;
         xor6 = (xor5 ^ and5);
         and7 = (xor6 & and6) << 1;
         xor7 = (xor6 ^ and6);
     sum = (xor7|and7);
     return sum;
    }
}
