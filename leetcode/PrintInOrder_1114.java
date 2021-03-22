/**
 * 题目信息见这里
 * https://leetcode-cn.com/problems/print-in-order/
 */
public class PrintInOrder_1114 {

    /**
     * 我的解决方案：
     * 设置两个boolean屏障，分别代表两个任务的完成
     * volatile关键字是需要的，不然成员变量值的修改没法第一时间映射到内存
     * （我其实一开始试了试 Thread.sleep，结果果然超时了）
     * 我看官方答案里用的是 AtomicInteger，其实都是原子操作，个人认为用boolean就可以了
     * 性能：约15~16ms，内存消耗不计
     * <p>
     * 性能更好的答案请看
     * 耗时约12ms
     * https://leetcode-cn.com/problems/print-in-order/solution/gou-zao-zhi-xing-ping-zhang-shi-xian-by-pulsaryu/
     * 个人分析可能过度的while循环终究还是损耗了性能
     */
    static class MySolution {

        private volatile boolean step1 = false;
        private volatile boolean step2 = false;

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            step1 = true;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (!step1) {
                ;
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            step2 = true;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (!step2) {
                ;
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}