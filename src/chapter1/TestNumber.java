package chapter1;

import java.util.ArrayList;
import java.util.List;

public class TestNumber {
    public static double sum(List<Number> num) {
        double sum = 0.0;
        for (Number n: num) {
            sum += n.doubleValue();
        }

        return sum;
    }
    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        nums.add(new Byte((byte)10));
        nums.add(new Integer(10));
        nums.add(new Float(10f));
        nums.add(new Double(10d));
        System.out.println(sum(nums));
    }
}
