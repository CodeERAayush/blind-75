import java.util.HashMap;
import java.util.Map;

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        cnt.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (cnt.containsKey(nums[i]))
                return true;
            cnt.put(nums[i], i);

        }
        return false;

    }
}
