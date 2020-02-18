/*檔案:CH07_03.java
 *說明:物件的建立方法
 */ 

//自行定義類別:student類別
class Student{
    //建構子
    public Student(){ 
        name="麵包超人";
        score='A';	
    }
	
    public String name;
    public char score;

    public void show(){
        System.out.println("姓名="+name);
        System.out.print("成績=");
        System.out.println("["+score+"] "+'\n');
    }
    public void setdata(String name1, char score1){
        name=name1;
        score=score1;
    }
}
//主程式
public class CH07_03{
    public static void main(String[] args){
        Student s1=new Student();   //建立物件s1
        Student s2=new Student();
        Student s3;              //宣告物件s3
        s3=new Student();   //建立物件s3
        s1.show();
        s2.setdata("細菌人",'B');
        s2.show();
        s3.name="小病毒";
        s3.score='C';
        s3.show();
    }	
}
