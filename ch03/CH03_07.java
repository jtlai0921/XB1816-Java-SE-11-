/*檔案:CH03_07.java
 *說明:條件運算子
 */

public class CH03_07{
    public static void main(String[] ages){
		
        //變數宣告
        int math_score=70;
        System.out.println("Michael數學成績："+math_score);
        String str;
        str=(math_score>80)?"非常好":"多加油";
        System.out.println("師長評語："+str+'\n');
		
        math_score=90;
        System.out.println("Jane數學成績："+math_score);
        str=(math_score>80)?"非常好":"多加油";
        System.out.println("師長評語："+str+'\n');
    }
}