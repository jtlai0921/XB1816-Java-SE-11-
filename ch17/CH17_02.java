/*�{��:CH17_02.Java Thread���O���ϥ�*/
public class CH17_02
{
    //�]�w�����ܼ�
    static boolean isRunning1 = true;  
    static boolean isRunning2 = true;
    //�D�{���϶�
    public static void main(String args[]){
        //�إ�Thread����
        myThread1 myThread1 = new myThread1();
        myThread2 myThread2 = new myThread2();
        //�]�w������ѧO�W��
        myThread1.setName("�Ĥ@���u�@");
        myThread2.setName("�ĤG���u�@");
        //�Ұʰ����
        myThread1.start();
        myThread2.start();
        //�]�w�L���j��
        while(true){
            //�]�w�j��פ����
            if(!isRunning1 && !isRunning2)
                break;
        }
    }
}

class myThread1 extends Thread{
    //�إ߬����ܼ�
    int ascending = 1;
    //override run()��k
    public void run(){
        while(CH17_02.isRunning1){
            //��ascending�Ȥ��W�L�d���,����B��ÿ�X���G
            if(ascending <= 3){
                System.out.println("�Ĥ@���u�@");
                System.out.println("ascending�ܼƻ��[�B��"+ascending);
                ascending ++;
                try{
                    Thread.currentThread();
                    //�]�w�ɶ����j��1000�@��(1����)
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){}
            }
            //��ascending�W�X�d���,���_�������
            else {
                //�Q��isRunning1�ܼƲפ����{��
                CH17_02.isRunning1 = false;
                System.out.println("\n��ascending�Ȭ�3��");
                System.out.println(Thread.currentThread() + "���_����\n");				
            }
        }
    }
}

class myThread2 extends Thread{
    //�إ߬����ܼ�
    int descending = 10;
    //override run()��k
    public void run(){
        while(CH17_02.isRunning2){
            //��descending�Ȥj����w�ƭȮ�,����B��ÿ�X���G
            if(descending >= 6){
                System.out.println("�ĤG���u�@");
                System.out.println("descending�ܼƻ���B��"+descending);
                descending --;
                try{
                    Thread.currentThread();
                    //�]�w�ɶ����j��2000�@��(2����)
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){}
            }
            //��descending�p����w�ƭȮ�,���_�������
            else{
                //�Q��isRunning2�ܼƲפ����{��
                CH17_02.isRunning2 = false;
                System.out.println("\n��descending�Ȭ�6��");
                System.out.println(Thread.currentThread() + "���_����\n");
            }
        }
    }
}