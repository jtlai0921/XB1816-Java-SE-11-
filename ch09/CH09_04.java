/*檔案:CH09_04.java 
 *說明:介面應用*/
//介面SetLoginData
interface SetLoginData{
    //宣告抽象成員方法
    abstract void set(String acc, String pass);
}

//介面ConnectDatabase
interface ConnectDatabase{
    //建立環境常數
    String ACCOUNT = "root";
    String PASSWORD = "123456";
    //宣告抽象成員方法
    abstract void connect();
}

//介面ShowResult
interface ShowResult{
    //宣告抽象成員方法
    abstract void show();
}

//宣告實作類別
class UserDB implements SetLoginData, ConnectDatabase, ShowResult{
    //宣告類別成員資料
    String userAccount;
    String userPassword;
    String resultMessage;
    //重載抽象成員方法
    public void set(String acc, String pass){
        userAccount = acc;
        userPassword = pass;
}
    public void connect(){
        if(userAccount == ACCOUNT && userPassword == PASSWORD){
            resultMessage = "成功連結User資料庫!!";
        }
        else{
            resultMessage = "User資料庫連結失敗,請檢查登入的帳號與密碼!!";
        }
    }
    public void show(){
        System.out.println(resultMessage);
    }
}
		
//主要類別
public class CH09_04{
    //主程式區塊
    public static void main(String args[]){
        //實作衍生類別物件
        UserDB myObject = new UserDB();
        //呼叫重載的介面成員方法
        myObject.set("root", "123456");
        System.out.println("使用者輸入資料如下：\n" +
		           "登入帳號： root \n" +
		           "登入密碼： 123456 \n");
        myObject.connect();
        myObject.show();
    }
}