/*檔案:CH07_02.java
 *說明:物件的建立方法
 */ 

//自行定義類別:student類別
class student{
    //建構子
    public student(){ 
        name="麵包超人";
        score='A';	
    }
	
    public String name;
    public char score;

    public void show(){
        System.out.println("姓名="+name);
        System.out.print("成績=");
        System.out.println("["+score+"] ");
    }
    public void setdata(String name1, char score1){
        name=name1;
        score=score1;
    }
}
//主程式
public class CH07_02{
    public static void main(String[] args){
        System.out.println("沒有使用到student類別的成員變數或方法");
    }	
}