// 計算圓面積的類別實作
class Circle
{
    double pi=3.14;
    double radius;
   
    double area()
    {
        return (3.14159*radius*radius);
    }
}

public class WORK07_01
{
    public static void main(String args[])
    {
        Circle obj=new Circle();
      
        obj.radius=3.0;
   
        System.out.println("半徑="+obj.radius);
        System.out.println("圓面積="+obj.area());
    }
}