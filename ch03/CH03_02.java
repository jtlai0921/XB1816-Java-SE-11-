/*檔案:CH03_02.java
 *說明:if-else條件控制
 */

public class CH03_02{
    public static void main(String[] ages) {
		
        //if-else條例判斷式
        int Tim=27,Tracy=23;
        System.out.println("Tim年齡="+Tim+",Tracy年齡="+Tracy);
		
        if (Tim<Tracy) {
            System.out.println("Tim年齡比Tracy小"+'\n');
        }else {
            System.out.println("Tim年齡比Tracy大");
        }
    }
}