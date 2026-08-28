public class Practice {

    public static void main(String[] args) {
        // 模拟 5 个班（简化成 3 个班演示）
        int[] class1 = {85, 61, 92, 78, 45, 60};
        int[] class2 = {90, 88, 55, 70, 66};
        int[] class3 = {58, 77, 83, 49, 91, 72, 64};

        // 不用重复写代码，喊方法名字就行
        System.out.println("一班  最低分：" + getMin(class1) + "  不及格：" + countFail(class1) + "人");
        System.out.println("二班  最低分：" + getMin(class2) + "  不及格：" + countFail(class2) + "人");
        System.out.println("三班  最低分：" + getMin(class3) + "  不及格：" + countFail(class3) + "人");
        System.out.print("一班平均分：");
        printAvg(class1);
    }

    // 求最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 统计不及格人数
    public static int countFail(int[] arr) {
        int count = 0;
        for (int score : arr) {
            if (score < 60) {
                count++;
            }
        }
        return count;
    }

    // 输出平均分
    public static void printAvg(int[] arr) {
        double sum = 0;
        for (int score : arr) {
            sum += score;
        }
        double avg = sum / arr.length;
        System.out.println(avg);
    }
}



