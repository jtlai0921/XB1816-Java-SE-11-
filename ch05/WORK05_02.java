// �ǲή�w�ƧǪk
public class WORK05_02 extends Object {
    public static void main(String args[]) {
        int i,j,tmp;
        int data[]={6,5,9,7,2,8};	//��l���
		
        System.out.println("��w�ƧǪk�G");
        System.out.print("��l��Ƭ��G");
        for(i=0;i<6;i++) {
            System.out.print(data[i]+" ");
        }
        System.out.print("\n");
		
        for (i=5;i>0;i--) //���˦���
	{
	    for (j=0;j<i;j++)   	//����B�洫����
	    {
		// ����۾F��ơA�p�Ĥ@�Ƹ��j�h�洫 
		if (data[j]>data[j+1])
		{
	            tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
	        }
            }
		    
            //��U�����y�᪺���G�L�X
            System.out.print("��"+(6-i)+"���Ƨǫ᪺���G�O�G"); 
            for (j=0;j<6;j++)
            {
                System.out.print(data[j]+" ");
            }		    
            System.out.print("\n");
        }
		 
        System.out.print("�Ƨǫᵲ�G���G");
        for (i=0;i<6;i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.print("\n");
    }
}