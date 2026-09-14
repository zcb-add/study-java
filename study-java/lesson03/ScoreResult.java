public class ScoreResult {
    // 图纸上声明三个隔间（字段）：装不同类型
    int minScore;   // 最低分，装 int
    int failCount;  // 不及格人数，装 int
    double avg;     // 平均分，装 double

    public static void main(String[] args) {
        int[] class1 = {85, 61, 92, 78, 45, 60};

        // 喊一个"会同时算出三个结果"的方法，它还回来一个盒子
        ScoreResult box = calc(class1);

        // 打开盒子的隔间，用 . 取东西
        System.out.println("最低分：" + box.minScore);
        System.out.println("不及格：" + box.failCount + "人");
        System.out.println("平均分：" + box.avg);
    }

    // 返回类型不再是 int，而是"ScoreResult 这种盒子"
    static ScoreResult calc(int[] arr) {
        ScoreResult box = new ScoreResult();  // new = 按图纸造盒子
        box.minScore = arr[0];                // 往隔间里放东西
        box.failCount = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < box.minScore) {
                box.minScore = arr[i];
            }
            if (arr[i] < 60) {
                box.failCount++;
            }
        }
        box.avg = sum / arr.length;
        return box;  // 把装满的盒子还回去
    }
}
