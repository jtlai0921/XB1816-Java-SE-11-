/*�{���GCH15_03 �򥻿�J�d��*/
//���JIO�M��
import java.io.*;
public class CH15_03{
    public static void main(String args[])throws IOException{
        //�ŧi�ܼ�
        int ASCIIcode;
        char myChar;
        System.out.println("[��L����ASCII�X�ഫ�{��]");
        System.out.print("�п�J���ഫ�����s�G  ");
        ASCIIcode = System.in.read();
        myChar = (char)ASCIIcode;
        if(ASCIIcode == 13)
            System.out.println("��L Enter �䪺ASCII�Ȭ� " + ASCIIcode);
        else
            System.out.println("��L " + myChar + "�䪺ASCII�Ȭ� " + ASCIIcode);
    }
}