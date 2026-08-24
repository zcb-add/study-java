// 第一课：数组 + 循环
// 目标：理解"把一堆数据装在一起"（数组）和"重复干活"（循环）

public class ArrayLoop {

    public static void main(String[] args) {
        // ---------- 1. 数组：一组同学的考试成绩 ----------
        int[] scores = {85, 92, 78, 61, 95};   // 花括号里直接放数据

        System.out.println("成绩个数: " + scores.length);

        // ---------- 2. for 循环：求和 ----------
        // 写法：for (从哪开始; 什么时候停; 每次怎么变)
        //   int i = 0     -> 从第 0 个开始
        //   i < length    -> 只要还没到末尾就继续
        //   i++           -> 每次 +1，走到下一个
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];          // scores[i] 取第 i 个成绩
        }
        System.out.println("总分: " + total);
        System.out.println("平均分: " + ((double) total / scores.length));

        // ---------- 3. for-each 循环：找最高分 ----------
        // 不需要下标，直接"把每个成绩拿出来看看"
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("最高分: " + max);

        // ---------- 4. while 循环：把成绩一个个打出来 ----------
        int index = 0;
        while (index < scores.length) {
            System.out.println("  第" + (index + 1) + "个: " + scores[index]);
            index++;
        }
    }
}
