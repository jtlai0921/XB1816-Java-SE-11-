//�ϥα���ԭz�i����Z����
class WORK03_01 {
    public static void main(String args[]) {
        int score = 88;
        int level = 0;
        //�_��if..else�ԭz
        System.out.println("�Q��if..else����ԭz�P�_");
        if (score >= 60) {  
            if(score >= 75) {  
                if(score >= 90) {             
                    System.out.println("���Z" + score + " �O�ҵ�!!");
                    level = 1;
                }
                else {   
                    System.out.println("���Z" + score + " �O�A��!!");
                    level = 2;
                }
            }
            else {
                System.out.println("���Z" + score + " �O����!!");
                level = 3;
            }
        }
        else
            System.out.println("���Z" + score + " ���ή�!!");        
        // switch..case�ԭz
        System.out.println("�Q��switch..case����ԭz�P�_");
        switch(level) {
            case 1:System.out.println("���Z" + score + " �O�ҵ�!!");break;
            case 2:System.out.println("���Z" + score + " �O�A��!!");break;
            case 3:System.out.println("���Z" + score + " �O����!!");break;
            default:System.out.println("���Z" + score + " �O�B��!!");break;
        }
    }
}
