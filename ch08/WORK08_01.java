// 計算某一本書的銷售金額
class Book
{
    protected int price;   
    protected int number;
   
    public Book(int p,int n)
    {
        price=p;
        number=n;
    }    
    protected void total_money()
    {
        System.out.println("書籍單價="+price+", 銷售數量="+number);
    }     
}

class BookSales extends Book
{
    public BookSales(int p,int n)
    {
        super(p,n);
    }
    public void calculate()
    {
        total_money();
        System.out.println("銷售總金額="+price*number);
    }
}

public class WORK08_01
{
    public static void main(String args[])
    {
        BookSales photoshop=new BookSales(620,40);
        photoshop.calculate();
    }
}