/*�{��:CH14_07.java
 *����:throws����@
 *�ϥΦۦ�إߪ����O�B�z�ҥ~���D */
class count{
    private double c;
    double calculate(int x,int y){
        c=(x+y)/(y-x-1);
        return c;
    }
}
class CH14_07{
    public static void main(String[] args) throws ArithmeticException {
        count ct=new count();
        int a=15;
        int b=16;
        try{
            System.out.println("�ҥ~���~������"+ct.calculate(a,b));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}