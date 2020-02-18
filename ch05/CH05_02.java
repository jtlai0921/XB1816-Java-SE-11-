/*檔案:CH05_02.java
 *說明:陣列的基本使用方法
 */ 

public class CH05_02{
    public static void main(String[] ages){
		
        //陣列宣告
        int age[] =new int[5];
        //給定陣列元素值
        age[0]=18;
        age[1]=25;
        age[2]=33;
        age[3]=48;
        age[4]=50;
		
        for(int i=0;i<=5;i++){
            if(i<age.length){
                System.out.println("第"+(i+1)+"位員工的年齡="+age[i]+"歲。"+'\n');
            }else{
                System.out.println("抱歉！找不到第"+(i+1)+"位員工年齡的資料");
            }
        }
    }
}