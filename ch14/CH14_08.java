/*�{��:CH14_08.java
 *����:throws����@
 *�hcatch�϶� */
class CH14_08{
    public static void main(String[] args) throws ArithmeticException,IndexOutOfBoundsException{
        int a=15;
        int b=16;
        double c[]=new double[2];
        try{
            double d=(a+b)/(b-a-1);
        }catch(ArithmeticException e){
            System.out.println("������0���ҥ~���~�G"+e);
        }catch(IndexOutOfBoundsException e){
            System.out.println("�W�X�}�C�d�򪺨ҥ~���~�G"+e);
        }
        
        try{
            double d=(a+b)/(b-a);
            c[3]=d;
        }catch(ArithmeticException e){
            System.out.println("������0���ҥ~���~�G"+e);
        }catch(IndexOutOfBoundsException e){
            System.out.println("�W�X�}�C�d�򪺨ҥ~���~�G"+e);
        }          
    }
}