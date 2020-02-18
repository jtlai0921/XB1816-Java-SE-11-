/*檔案:CH03_01.java
 *說明:if條件控制
 */

public class CH03_01 {
    public static void main(String[] ages) {
		
        //if條例判斷式
        int Tim=20,Tracy=23;
        System.out.println("Tim年齡="+Tim+",Tracy年齡="+Tracy);
		
        if (Tim<Tracy){
        System.out.println("Tim年齡比Tracy小"+'\n');
        }
		
        Tim=25;
        System.out.println("Tim年齡="+Tim+",Tracy年齡="+Tracy);
        if (Tim>Tracy){
            System.out.println("Tim年齡比Tracy大"+'\n');
        }
		
        Tim=23;
        System.out.println("Tim年齡="+Tim+",Tracy年齡="+Tracy);
        if (Tim==Tracy){
            System.out.println("Tim年齡和Tracy一樣");
        }	 
    }
}