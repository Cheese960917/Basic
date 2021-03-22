/**
 * 题目：https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class NumOfOneBits_191 {
    /**
     * 思路：见到二进制就可以想到位运算了，按照 0101 & 0001 = 1 这个起点走下去就好了
     * 但是移位的操作我还真是没想到，学艺不精啊。
     * 最佳答案看这里
     * https://leetcode-cn.com/problems/number-of-1-bits/solution/yi-ti-san-jie-wei-shu-jian-cha-you-yi-to-av1r/
     */
    public static class MySolution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int maxCount = 32;
            int compareFlag = 1;
            int count = 0;
            for (int i = 1; i <= maxCount; i++) {
                if ((compareFlag & n) != 0) {
                    count ++;
                }
                compareFlag = compareFlag * 2;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(new MySolution().hammingWeight(0b00000000000000000000000000001011));
    }
}