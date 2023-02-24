import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementFromArray {


    // Function to return max time occurred element from array using collection
    static int majorityElementUsingCollection(int[] num) {
        int maxCount, majorityElement = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer ele : num) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }
        maxCount = Collections.max(map.values());
        majorityElement = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//        System.out.println(majorityElement + " has occurred " + maxCount + " times");
        return majorityElement;
    }

    // Function to return max time occurred element from array using array traversing
    static int majorityElementUsingArrayTraverse(int[] num) {
        int maxCount = 0, majorityElement = 0;
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count = count + 1;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majorityElement = num[i];
            }
        }
//        System.out.println(majorityElement + " has occurred " + maxCount + " times");
        return majorityElement;
    }

    public static void main(String[] ar) {
        int[] num1 = {4,2,4};
        int[] num2 = {3,3,1,1,1,3,3};
        System.out.println(MajorityElementFromArray.majorityElementUsingCollection(num1));
        System.out.println(MajorityElementFromArray.majorityElementUsingArrayTraverse(num2));
    }
}
