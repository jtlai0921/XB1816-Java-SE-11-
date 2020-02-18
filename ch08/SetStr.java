/*檔案:SetStr.java 
 *說明:存取基本類別的private成員,
*/
public class SetStr{
    //建立private成員資料	
    private static String privateString = "";
    //建立private成員方法
    private static void privateData( ){
        System.out.println("外部類別private成員方法，用以顯示外部類別的" + 
		           "private字串變數為\n" + privateString);
    }
    //建立public成員方法用以呼叫與存取private成員
    public static void setPrivateData(String myStr){
        privateString = myStr;
    }
    public static void showPrivateData( ){
        privateData();
    }
}