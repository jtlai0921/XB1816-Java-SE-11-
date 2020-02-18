/*檔案:CH03_09.java
 *說明:巢狀for迴圈應用
 */

public class CH03_09{
    public static void main(String[] ages){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){
                System.out.print(i+"*"+j+"="+i*j+'\t');
            }
            System.out.print('\n');
        }
    }
}