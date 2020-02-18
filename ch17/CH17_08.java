/*�ɮ�:CH17_08.java �s�դư�����d��*/
//�D���O
public class CH17_08{
    //�D�{��
    public static void main(String[] args){
        //�ŧi������s�ժ���myTG1�PmyTG2
        ThreadGroup myTG1 = new ThreadGroup("myThreadGroup1");
        ThreadGroup myTG2 = new ThreadGroup("myThreadGroup2");
        //�إߥ|�Ӱ��������,�å[�J�ܬ۹�s�դ�
        myThread myThread1 = new myThread(myTG1, "myThread1", 5);
        myThread myThread2 = new myThread(myTG2, "myThread2", 9);
        myThread myThread3 = new myThread(myTG1, "myThread3", 8);
        myThread myThread4 = new myThread(myTG2, "myThread4", 2);
        //�]�w�s�ժ��̤j�����v��
        myTG1.setMaxPriority(3);
        myTG2.setMaxPriority(7);
        //�Ұʰ����
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}

//�ŧi������������O
class myThread extends Thread{
    //���O�غc�l
    public myThread(ThreadGroup TG, String name, int priority){
        //�V�W��̩Thread���O�غc�l
        super(TG, name);
        //�]�w��������涶��
        this.setPriority(priority);
    }
    //���s�w�qrun()��k
    public void run(){
        for(int i = 1; i < 3; i++){
            if(i == 1){
                System.out.println("�}�l����"+getName()+"�����");
                System.out.println(getName()+"��"+i+"������\n");
            }
            if(i == 2){
                System.out.println(getName()+"��"+i+"������");
                System.out.println("�����"+getName()+"���槹��\n");
            }
            //�]�w�ɶ�����
            try{
                sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}