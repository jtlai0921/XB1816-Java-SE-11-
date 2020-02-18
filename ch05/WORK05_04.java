//初始化陣列及計算學生成績分佈圖
public class WORK05_04{
    public static void main(String[] args){
        //資料宣告
        int score[]={99,98,91,88,65,69,97,57,77,63};//宣告並初始化陣列
        int degree[]=new int[10]; //宣告並初始化陣列
        int i,j,sum=0;
        double avg=0.0;

        //利用迴圈計算總分，並遞增對應的分數級距人數
        for (i=0; i<10; i++)
        {
            sum += score[i]; //計算總分
            if (score[i]/10 == 10)
                degree[9]++; //成績為100，則將索引值9的元素加1
            else
                degree[score[i]/10]++;  //遞增對應的分數級距人數 
        }
        avg = (double)sum /(double)10; //計算平均

        System.out.println("總分="+sum+" ,平均="+avg);
        System.out.println("人數分佈圖如下：");
        System.out.print("分數級距\t人數\n");
        for (i=0; i<10; i++)
        {
            System.out.print(i*10+" ~ "+(i*10+9)+" \t"); //設定分數級距的輸出文字
            for (j=0;j<degree[i];j++)
                System.out.print("*"); //以星號代表該級距的人數
            System.out.print("\n");
        }
    }
}