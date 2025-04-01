package Function_Methods;

public class BinarytoDecimal {

    public static void BinToDec(int BinNum){
        int myNum = BinNum;
        int pow = 0;
        int decNum = 0;

        while(BinNum > 0){
            int lastdigit = BinNum % 10;
            decNum = decNum + (lastdigit *(int) Math.pow(2, pow));
            pow++;
            BinNum =  BinNum/10;
        }
        System.out.println("Decimal equivalent of binary number " + myNum+ " is: " + decNum);
    }
    public static void main(String[] args){
        BinToDec(1101);
    }
}
