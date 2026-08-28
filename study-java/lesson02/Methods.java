public class Methods {
    public static void main(String[] args) {
        // 模拟 5 个班（简化成 3 个班演示）
        int[] class1 = {85, 61, 92, 78, 45, 60};
        int[] class2 = {90, 88, 55, 70, 66};
        int[] class3 = {58, 77, 83, 49, 91, 72, 64};

        // 不用重复写代码，喊方法名字就行
        System.out.println("一班  最低分：" + getMin(class1) + "  不及格：" + countFail(class1) + "人");
        System.out.println("二班  最低分：" + getMin(class2) + "  不及格：" + countFail(class2) + "人");
        System.out.println("三班  最低分：" + getMin(class3) + "  不及格：" + countFail(class3) + "人");
    }

    // 方法1：找最低分。int[] arr 是参数，int 是返回值类型
    static int getMin(int[] arr) {



    }

    // 方法2：统计不及格个数
    static int countFail(int[] arr) {
        int count = 0;
        for (int score : arr) {
            if (score < 60) {
                count++;
            }
        }
        return count;
    }
}
