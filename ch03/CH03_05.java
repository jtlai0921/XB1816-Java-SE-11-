/*�ɮ�:CH03_05.java
 *����:�_��if�ԭz
 */

public class CH03_05{
    public static void main(String[] ages){
		
        //�ܼƫŧi
        int a=0,b=0;
        System.out.println("AND�޿�h=("+a+","+b+")");
        if (a==1){
            if (b==1){
                System.out.println(a+"(AND)"+b+"="+"1"+'\n');
            }
            else{
                System.out.println(a+"(AND)"+b+"="+"0"+'\n');
            }
        }
        else{
            System.out.println(a+"(AND)"+b+"="+"0"+'\n');
        }
        a=1;
        System.out.println("AND�޿�h=("+a+","+b+")");
        if (a==1){
            if (b==1){
                System.out.println(a+"(AND)"+b+"="+"1"+'\n');
            }
            else{
                System.out.println(a+"(AND)"+b+"="+"0"+'\n');
            }
        }
        else{
            System.out.println(a+"(AND)"+b+"="+"0"+'\n');
        }
        a=1;
        b=1;
        System.out.println("AND�޿�h=("+a+","+b+")");
        if (a==1){
            if (b==1){
                System.out.println(a+"(AND)"+b+"="+"1"+'\n');
            }
            else{
                System.out.println(a+"(AND)"+b+"="+"0"+'\n');
            }
        }
        else{
            System.out.println(a+"(AND)"+b+"="+"0"+'\n');
        }
    }
}