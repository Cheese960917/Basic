import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum_1 {
    public static class Solution {

        /**
         * 存放可以求得最终结果的两个数
         * 官方答案见：
         * https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
         * 这能力还是太菜了，优化空间很大啊，一遍循环就可以跑完了，何苦跑两次……
         */
        private HashMap<Integer, Integer> valueMap = new HashMap<>();

        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                // 差值，相当于是两数和的其中一个
                int curr = nums[i];
                int diff = target - curr;
                // 角标放进去
                valueMap.put(diff, i);
            }
            for (int i = 0; i < len; i++) {
                // 差值，相当于是两数和的其中一个
                int curr = nums[i];
                // 找那个可以达成两数和的两个数是否存在
                Integer diffIfExist = valueMap.get(curr);
                if (null != diffIfExist && diffIfExist != i) {
                    // 这里按顺序
                    res[0] = Math.min(diffIfExist, i);
                    res[1] = Math.max(diffIfExist, i);
                    break;
                }
            }
            return res;
        }

        /**
         * 这个是看了眼官方的代码，整理思路重写了一下（可不是照抄哦），哎呀，代码真是博大精深
         */
        public int[] twoSum2(int[] nums, int target) {
            int[] res = new int[2];
            Map<Integer, Integer> tmpMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (tmpMap.containsKey(nums[i])) {
                    res[0] = tmpMap.get(nums[i]);
                    res[1] = i;
                    return res;
                }
                tmpMap.put(target - nums[i], i);
            }
            return res;
        }
    }

    public static void main(String[] args) {

    }
}
