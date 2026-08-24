public class Practice{

    public static void main(String[] args){
        //. 用数组存 5 个成绩（随便编）
        int[] scores = {85, 92, 78, 61, 95};


//        2. 找出最低分
        int min=scores[0];
        for(int score:scores){
            if (score<min){min=score;}
        }
        System.out.print("最低分"+min);


//        3. 统计有几个不及格（小于 60 分）
        int count=0;
        for(int i=0;i<scores.length;i++){
            if (scores[i]<60){count++;}
        }
        System.out.print("不及格个数"+count);




    }






}

