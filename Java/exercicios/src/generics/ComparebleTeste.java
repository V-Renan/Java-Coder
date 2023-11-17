package generics;

import java.util.TreeSet;

/**
 * @author Victor$
 * @date 11/17/2023$
 * Description:
 */
public class ComparebleTeste {

    public static void main(String[] args) {

        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(123);
        nums.add(-13);

        for (Integer n : nums) {
            System.out.println(n);
        }
    }
}
