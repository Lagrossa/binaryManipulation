public class testing {

    public static void main(String[] args){
        /* for(int x = 0; x <=10000; x++){
         for(int y = 0; y<=10000; y++) {
            if(binaryAdd(x,y) != x+y){
                System.out.println("There is an error at..." + x + ", " + y);
                System.out.println("Expected output: " + (x+y) + "\nCurrent output: " + binaryAdd(x,y));
            }
         }
     }*/ //Used to test all values.

        System.out.println(binaryAdd(-1,-5));
    }
    static int getAnd(int n1, int n2){
        return (n1&n2) << 1;
    }

    static int getXor(int n1, int n2){
        return (n1^n2);
    }

    static int binaryAdd(int number1, int number2){
     int sum;
     int and1 = 0, xor1 = 0;
     int num1 = number1;
     int num2 = number2;
     for(int x = 0; x<40; x++){ //There is a performance issue with this, perhaps I should optimize based off of the value of the largest number?
         and1 = getAnd(num1, num2);
         xor1 = getXor(num1, num2);
         num1 = and1;
         num2 = xor1;
     }
     sum = (xor1|and1);
     return sum;
    }
}
