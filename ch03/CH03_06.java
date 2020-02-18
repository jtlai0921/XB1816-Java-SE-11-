/*檔案:CH03_06.java
 *說明:switch條件敘述
 */

public class CH03_06{
    public static void main(String[] ages){
		
        //變數宣告
        char math_score='A';
        System.out.println("Michael數學成績："+math_score);
        switch(math_score){
            case'A':
                System.out.println("師長評語：非常好！真是優秀"+'\n');
                break;  // break的用意是跳出switch條件判斷式
            case'B':
                System.out.println("師長評語：師長評語：也不錯，但還可以更好"+'\n');
                break;  // break的用意是跳出switch條件判斷式
            case'C':
                System.out.println("師長評語：真的要多用功"+'\n');
                break;  // break的用意是跳出switch條件判斷式
            default:
                System.out.println("師長評語：不要貪玩，為自己多讀書 "+'\n');
        }
		
        math_score='C';
        System.out.println("Jane數學成績："+math_score);
        switch(math_score){
            case'A':
                System.out.println("師長評語：非常好！真是優秀"+'\n');
                break;  // break的用意是跳出switch條件判斷式
            case'B':
                System.out.println("師長評語：師長評語：也不錯，但還可以更好"+'\n');
                break;  // break的用意是跳出switch條件判斷式
            case'C':
                System.out.println("師長評語：真的要多用功"+'\n');
                break;  // break的用意是跳出switch條件判斷式
            default:
                System.out.println("師長評語：不要貪玩，為自己多讀書 "+'\n');
        }
    }
}