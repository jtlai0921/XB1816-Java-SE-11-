/*檔案:CH08_06.java 
 *說明:存取外部類別private成員範例*/
//宣告主程式類別並向上繼承於外部類別SetStr
public class CH08_06 extends SetStr{
    //主程式
    public static void main(String[] args){
        String myStr = "主程式類別所定義的字串!!";
        new CH08_06();
        //呼叫繼承的public成員方法以間接存取private成員
        SetStr.setPrivateData(myStr);
        SetStr.showPrivateData();
    }
}