/*�{���GDir���O��@*/
//���JIO�M��
import java.io.*;
public class CH15_15{
    //�D�{���϶�
    public static void main(String args[]){
        try{
            //�Q�ΥD�{���϶��Ѽƫإ�File����
            File myFile = new File(args[0]);
            //File����O�_���ؿ����A
            if(myFile.isDirectory()){
                //�N�ؿ����Ҧ����������s���r��}�C
                String list[] = myFile.list();
                for(int i = 0; i < list.length; i++){
                    //��@�ؿ�����������File����
                    File mySubFile = new File(args[0] + "/" + list[i]);
                    //�P�_mySubFile����O�_���ɮ�
                    if(mySubFile.isFile())
                        System.out.println(list[i] + "\t����" + mySubFile.length());
                    else
                        System.out.println("�ؿ�\t" + "[" + list[i] + "]");
                }
            }
            else
                //��X�ۭq���~
                throw new Exception("���w���|���~");
        }
	catch(ArrayIndexOutOfBoundsException e){
            System.out.println("�S�����w���|");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
