/*�{��:CH14_05.java
 *����:throws����@
 *�ϥΤ�k�B�z�ҥ~���D(�@) */
class CH14_05{
    static double count(int x,int y){
        double c=(x+y)/(y-x-1);
        return c;
    }
    public static void main(String[] args) throws ArithmeticException{
        int a=15;
        int b=16;
        try{
            System.out.println("�ҥ~���~������"+count(a,b));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}