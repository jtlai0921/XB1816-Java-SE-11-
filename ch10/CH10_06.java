/*�ɮ�:CH10_06.java
 *����:Vector���O���ϥΤ�k
 */ 
import java.util.Vector;
public class CH10_06{
    public static void main(String[] args){
        Vector<Comparable> ve=new Vector<Comparable>();//�إߤ@�Ӫ�Vector����
        int I=5;
        float F=(float) 12.23;
        //�s�W����
        ve.addElement("Java");
        ve.add(I);
        ve.addElement(F);
        ve.addElement(45.68);
        System.out.println("Vector�ثe�����e= "+ve);
        System.out.println("Vector�ثe���e�q= "+ve.capacity());
        System.out.println("Vectour�ثe���j�p= "+ve.size());
        System.out.println("Vector����3�ӯ��ޭȪ�����= "+ve.elementAt(3));
        System.out.println("��������F�����G��: "+ve.removeElement(F));
        System.out.println("Vector�ثe�����e= "+ve);
        ve.insertElementAt("Hello",2);//���J����
        System.out.println("Vector�ثe�����e= "+ve);
        ve.trimToSize();//��X�e�q�P�j�p
        System.out.println("Vector�ثe���e�q= "+ve.capacity());
        System.out.println("Vectour�ثe���j�p= "+ve.size());
        System.out.println("Vector���̫�@�Ӥ���= "+ve.lastElement());
        String str=ve.toString();
        System.out.println("�r�ꪺ���e= "+str);
    } 	
}