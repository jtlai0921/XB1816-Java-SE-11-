/*�{��:CH14_06.java
 *����:throws����@
 *�ϥΤ�k�B�z�ҥ~���D(�G) */
class CH14_06{
    static void count(int x,int y) throws ArithmeticException {
        try{
            double c=(x+y)/(y-x-1);
            System.out.println("�ҥ~���~������"+c);
        }catch(ArithmeticException e){
            System.out.println(e);
        } 		
    }
    public static void main(String[] args)  {
        int a=15;
        int b=16;
        count(a,b);  //�I�s��k
    }
}