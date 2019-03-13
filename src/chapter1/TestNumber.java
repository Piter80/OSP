package chapter1;

public class TestNumber {
    public static double sum(Number[] num) {
        double sum = 0.0;
        for (Number n: num) {
            sum += n.doubleValue();
        }

        return sum;
    }
    public static void main(String[] args) {
        Number[] nums = new Number[4];
        nums[0] = new Byte((byte)10);
        nums[1] = new Integer(10);
        nums[2] = new Float(10f);
        nums[3] = new Double(10d);
        System.out.println(sum(nums));
    }
}
