package lang.print.gaps.task6;

public class FloatTypeCasting {

    public void roundNumber(float numberToBeRounded) {
        int result;
        if (numberToBeRounded >= 0) {
            if (numberToBeRounded < 2147483647.5) {
                result = (int) numberToBeRounded;
                double dif = numberToBeRounded - result;
                if (dif > 0.5 || dif == 0.5 && (result & 1) != 0) {
                    result++;
                }
                System.out.println(result);
            }
        } else {
            if (numberToBeRounded >= -2147483648.5) {
                result = (int) numberToBeRounded;
                double dif = numberToBeRounded - result;
                if (dif < -0.5 || dif == -0.5 && (result & 1) != 0) {
                    result--;
                }
                System.out.println(result);
            }
        }
    }
}
