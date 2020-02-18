/*檔案:CH03_03.java
 *說明:if-else-if條件控制(1)
 */

public class CH03_03 {
    public static void main(String[] ages) {
		
        //if-else-if條例判斷式
        int Tim=27,Tracy=23;
        System.out.println("Tim年齡="+Tim+",Tracy年齡="+Tracy);
		
        if (Tim<Tracy){
            System.out.println("Tim年齡比Tracy小"+'\n');
        }else if (Tim>Tracy){
            System.out.println("Tim年齡比Tracy大"+'\n');
        }else{
            System.out.println("Tim和Tracy年齡相同");
        }
		
        Tim=23;
        System.out.println("Tim年齡="+Tim+",Tracy年齡="+Tracy);
        if (Tim<Tracy){
            System.out.println("Tim年齡比Tracy小"+'\n');
        }else if (Tim>Tracy){
            System.out.println("Tim年齡比Tracy大"+'\n');
        }else{
            System.out.println("Tim和Tracy年齡相同");
        }
    }
}