package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float afterDot = numberToBeRounded - (long)numberToBeRounded;
        long roundedValue = (long)numberToBeRounded;
        if(afterDot >= 0.5)
            roundedValue++;
        System.out.println(roundedValue);
    }
}
