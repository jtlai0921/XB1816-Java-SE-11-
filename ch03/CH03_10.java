/*�ɮ�:CH03_10.java
 *����:while�ԭz����
 */
public class CH03_10{
    public static void main(String args[ ]){
        int n=1,sum=0;//�ŧin���_�l�ȩM�֥[��sum
        //while�j��}�l
        while(n<=10){
            System.out.print("n="+n);
            sum+=n;//�p��n���֥[��
            System.out.println("\t�֥[��="+sum);
            n++;
        }
        System.out.println("�j�鵲��");	
    }	
}