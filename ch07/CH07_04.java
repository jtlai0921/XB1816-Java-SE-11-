/*檔案:CH07_04.java
 *說明:物件的建立方法(三)
 */ 

//自行定義類別:student類別
class Student{
    //建構子
    public Student(){ 
        name="麵包超人";
        score='A';	
    }
	
    public static String name;
    public static char score;

    public static void show(){
        System.out.println("姓名="+name);
        System.out.print("成績=");
        System.out.println("["+score+"] "+'\n');
    }
    public static void setdata(String name1, char score1){
        name=name1;
        score=score1;
    }
}
//主程式
public class CH07_04{
    public static void main(String[] args){
        new Student();    
        Student.name="細菌人";
        Student.score='B';
        Student.show();
        Student.setdata("小病毒",'C');
        Student.show();
    }	
}