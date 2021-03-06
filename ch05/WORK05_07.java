// 程式目的： 插入排序法
// ===================================================

import java.io.*;

public class WORK05_07 extends Object
{
    int data[]=new int[6];
    int size=6;
	
    public static void main(String args[])
    {
        WORK05_07 test=new WORK05_07();
        test.inputarr();
        System.out.print("您輸入的原始陣列是：");		
        test.showdata();
        test.insert();
    }

    void inputarr()
    {
        int i;
        for (i=0;i<size;i++)   //利用迴圈輸入陣列資料
        {
            try{
                System.out.print("請輸入第"+(i+1)+"個元素：");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                data[i]=Integer.parseInt(br.readLine());
            }catch(Exception e){}
        }
    }
	
    void showdata()
    {  
        int i;
        for (i=0;i<size;i++)
        {
            System.out.print(data[i]+" ");   //列印陣列資料
        }
        System.out.print("\n");
    }
	
    void insert()
    {  
        int i;     //i為掃描次數
        int j;     //以j來定位比較的元素
        int tmp;   //tmp用來暫存資料
        for (i=1;i<size;i++)  //掃描迴圈次數為SIZE-1
        {  
            tmp=data[i];
            j=i-1;
	    while (j>=0 && tmp<data[j]) //如果第二元素小於第一元素
            {							 
                data[j+1]=data[j]; //就把所有元素往後推一個位置
                j--;
            }
            data[j+1]=tmp;       //最小的元素放到第一個元素
            System.out.print("第"+i+"次掃瞄：");
            showdata();
        }
    }	
}
