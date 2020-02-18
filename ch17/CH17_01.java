/*�ɮ�:CH17_01.java �w�ɱƵ{����ܽd*/
//�פJ�����M��
import java.util.Timer;
import java.util.TimerTask;
//�D���O
public class CH17_01{
    //�ŧi�����ܼ�
    Timer myTimer;
    //�ŧi���O�غc�l
    public CH17_01(){
        //�إ�Timer����
        myTimer = new Timer();
        //�إ�Task����
        Task1 myTask1 = new Task1();
        Task2 myTask2 = new Task2();
        //�Ʃw�Ĥ@���u�@
        myTimer.schedule(myTask1, 1000, 1000);
        //�w�ƲĤG���u�@
        myTimer.schedule(myTask2, 2000, 2000);
    }
    //�D�{��
    public static void main(String[] args){
        System.out.println("�}�l����Timer�Ƶ{�u�@");
        new CH17_01();
    }
    //��@TimerTask���l�����O,Task1�t�d�Ĥ@���u�@
    class Task1 extends TimerTask{
        //�إ߬����ܼ�
        int ascending = 1;
        //overloading run()��k
        public void run(){
            if(ascending <= 3){
                System.out.println("�Ĥ@���u�@");
                System.out.println("ascending�ܼƻ��[�B��G"+ascending);
                ascending ++;
            }
            else{
                System.out.println("��ascending�ܼƭȬ�3��,����Ĥ@���u�@");
                //�I�scancel()��k�פ�u�@
                cancel();
            }
        }
    }
    //��@TimerTask���l�����O,Task2�t�d�ĤG���u�@
    class Task2 extends TimerTask{
        //�إ߬����ܼ�
        int descending = 10;
        //overloading run()��k
        public void run(){
            if(descending >= 6){    			
                System.out.println("�ĤG���u�@");
                System.out.println("descending�ܼƻ���B��"+descending);
                descending --;
            }
            else{
                System.out.println("��descending�ܵ���6��,����ĤG���u�@");
                //�Q��Timer����I�scancel()��k�פ�Ƶ{
                myTimer.cancel();
            }
        }
    }
}