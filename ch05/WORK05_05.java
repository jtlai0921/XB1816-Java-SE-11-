/*�ɮ�:WORK05_05.java
 *����:Arrays���O���ϥΤ�k
 */ 
import java.util.Arrays;
public class WORK05_05{
    public static void main(String[] args){
        //�إߤ@�r��}�C
        String[] name={"���إ�","�����W","���A��","���l��",
 		       "ù���","�J���s","���`��","�^�F�{"};
        String[] copyname=new String[name.length];
        System.out.println("��l�}�C= ");
        for(int i=0; i<name.length; i++)
            System.out.print("["+name[i]+"] ");
        System.out.println();
 		
        System.out.println("\n[�ƻs�}�C]....");
        System.arraycopy(name,0,copyname,0,8);//�ƻs�}�C
        System.out.println("\n�����}�C");
        //����}�C
        if(Arrays.equals(name,copyname))
            System.out.println("��l�P�ƻs�}�C�۵�");
        else 
            System.out.println("��l�P�ƻs�}�C����");
        Arrays.sort(name);//�}�C�Ƨ�
        System.out.println("\n��l�}�C�Ƨǫ�= ");
        for(int i=0; i<name.length; i++)
            System.out.print("["+name[i]+"] ");
        System.out.println();
        if(Arrays.equals(name,copyname))
            System.out.println("��l�P�ƻs�}�C�۵�");
        else 
            System.out.println("��l�P�ƻs�}�C����");
        //�}�C�j�M
        int index=Arrays.binarySearch(name,"������");
        if(index>0) System.out.println("\n�b�}�C����"+(index+1)+"�Ӥ������[������]");
        System.out.println("\n�N������J�}�C");
        Arrays.fill(name,4,5,"�¨ν�");//�N�r���Jname�}�C������4�ӯ��ޭ�
        for(int i=0; i<name.length; i++)
            System.out.print("["+name[i]+"] ");
        System.out.println();
    } 	
}