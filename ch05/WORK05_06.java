// =============== Program Description ===============
// �{���W�١G WORK05_06.java                               
// �{���ت��G �N��ӳ̰�����۵����h�����ۥ[���X���G
// ===================================================

import java.io.*;
public    class WORK05_06
{
    final static int ITEMS=6;
    public static void main(String args[]) throws IOException
    {  
        int [] PolyA={4,3,7,0,6,2};  //�ŧi�h����A
	int [] PolyB={4,1,5,2,0,9};  //�ŧi�h����B
	System.out.print("�h����A=> ");
	PrintPoly(PolyA,ITEMS);	     //�L�X�h����A
	System.out.print("�h����B=> ");
	PrintPoly(PolyB,ITEMS);	     //�L�X�h����B
	System.out.print("A+B => ");
	PolySum(PolyA,PolyB);	     //�h����A+�h����B
    }
    public static void PrintPoly(int Poly[],int items)
    {  
	int i,MaxExp;
	MaxExp=Poly[0];
	for(i=1;i<=Poly[0]+1;i++)
	{  
            MaxExp--;
	    if(Poly[i]!=0)	//�p�G�Ӷ���0�N���L
	    {  
                if((MaxExp+1)!=0)
                    System.out.print(Poly[i]+"X^"+(MaxExp+1));
                else
                    System.out.print(Poly[i]);
                if(MaxExp>=0)
		    System.out.print('+');      
            }
	}
        System.out.println();
    }
    public static void PolySum(int Poly1[],int Poly2[])
    {  
	int i;
	int result[]= new int [ITEMS];
	result[0] = Poly1[0];
	for(i=1;i<=Poly1[0]+1;i++)
            result[i]=Poly1[i]+Poly2[i]; //��򻪺�Y�Ƭۥ[
	PrintPoly(result,ITEMS);
    }
}