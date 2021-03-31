public class ReverseBits_190 {

    public static class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int res = 0;
            for (int i = 0; i < 32; i ++) {
                // 是0得0 是1得1
                int valueAt = (n >> i) & 1;
                res += valueAt << (31 - i);
            }
            return res;
        }
    }

    /**
     * 官方解答
     * 比我的快，可能是因为n每次变小导致运算量下来了吧
     */
    public static class Solution2 {
        public int reverseBits(int n) {
            //    作者：LeetCode-Solution
            //    链接：https://leetcode-cn.com/problems/reverse-bits/solution/dian-dao-er-jin-zhi-wei-by-leetcode-solu-yhxz/
            //    来源：力扣（LeetCode）
            //    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
            int rev = 0;
            for (int i = 0; i < 32 && n != 0; ++i) {
                rev |= (n & 1) << (31 - i);
                n >>>= 1;
            }
            return rev;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseBits(0b00000010100101000001111010011100));
    }
}
