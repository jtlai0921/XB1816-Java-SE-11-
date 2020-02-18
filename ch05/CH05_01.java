/*檔案:CH05_01.java
 *說明:陣列的基本使用方法
 */ 
public class CH05_01{
    public static void main(String[] args){
        String[] course=new String[5];//宣告並建立一個字串物件陣列
        //設定初始值
        course[0]="姓名";
        course[1]="國文";
        course[2]="數學";
        course[3]="社會";
        course[4]="自然";
        //輸出各項目名稱
        for(int i=0; i<course.length;i++){
            System.out.print(course[i]+"\t");
        }
        System.out.println();
        System.out.print("吳勁律\t");
        int[] score=new int[]{100,96,97,86};//宣告建立和設定初始值整數陣列
        int sum=0;
        for(int i=0; i<score.length;i++){
            System.out.print(score[i]+"\t");
            sum+=score[i];
        }
        System.out.println();
        System.out.println("總分="+sum);
        System.out.println("平均="+(float)sum/score.length);
    }	
}