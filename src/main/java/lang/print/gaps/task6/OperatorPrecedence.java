package lang.print.gaps.task6;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int eight = (3 + first) * second;
        System.out.println(eight);//eight is expected to be 8
        boolean firstBool = false;
        boolean secondBool = false;
        boolean thirdBool = 1 == 1;
        boolean fourthBool = 4 <= 101;
        int varSix = 17;

        System.out.println((firstBool && (secondBool || thirdBool)) && fourthBool || (varSix = 5) < 0);
        System.out.println(varSix);
    }
}
