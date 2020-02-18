/*檔案:呼叫外部類別public成員範例*/
//宣告程式主要類別
public class CH08_04{
    //宣告主類別的成員方法
    public void showData(){
        //呼叫外部類別public成員方法
        String myStr = setData.setStr();
        System.out.println(myStr);
        //存取外部類別public成員資料
        setData.myStr = "於主類別中重新定義的public成員資料!!";
        myStr = setData.setStr();
        System.out.println("呼叫被主類別重新定義的外部類別public成員資料\n" + 
		            myStr);
    }
    //主程式
    public static void main(String[] args){
        //建立主類別物件
        CH08_04 myObject = new CH08_04();
        myObject.showData();
    }
}

//宣告外部類別
class setData{
    //宣告public成員資料
    public static String myStr = "這是由外部類別public成員方法所傳回的字串資料\n";
    //宣告public成員方法
    public static String setStr(){
        return myStr;
    }
}