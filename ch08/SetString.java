/*檔案:SetString.java 
 *說明:傳回字串*/

public class SetString{
    //建立protected成員資料	
    protected static String protectedString = "外部類別protected字串變數\n";
    //建立protected成員方法
    protected static void protectedData( ){
    System.out.println("外部類別protected成員方法，用以顯示外部類別的" + 
		       "protected字串變數為\n" + protectedString);
    }
}