/*�{���G�ɦW�L�o����@*/
//���JIO�M��
import java.io.*;
public class CH15_16 implements FilenameFilter{
    private String myFilename;
    //���O�غc�l
    public CH15_16(String myStr){
        this.myFilename = myStr;
    }
    //����������accept��k
    public boolean accept(File dir, String filename){
        boolean isMatch = true;
        if(myFilename != null)
            isMatch &= filename.startsWith(myFilename);
        return isMatch;
    }
    //�D�{���϶�
    public static void main(String args[]){
        //�Q�ΥD�{���϶��Ѽƫإ�File����
        File myFile = new File(args[0]);
        //�إߥD���O����
        CH15_16 myObject = new CH15_16(args[1]);
        System.out.println("�b�ؼи��|�G " + args[0] + " ���j�M�ŦX " + 
		            args[1] + "����r���ɮ�\n");
        System.out.println("�j�M���G�p�U�ҥܡG");
        //�C�X�ɮײM��
        String fileList[] = myFile.list(myObject);
        for(int i = 0; i < fileList.length; i++)
            System.out.println(fileList[i]);
    }
}
