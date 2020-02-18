//ㄏノ兵ン痹瓃秈︽σ罿蝶ゑ
class WORK03_01 {
    public static void main(String args[]) {
        int score = 88;
        int level = 0;
        //盻if..else痹瓃
        System.out.println("ノif..else北痹瓃耞");
        if (score >= 60) {  
            if(score >= 75) {  
                if(score >= 90) {             
                    System.out.println("Θ罿" + score + " 琌ヒ单!!");
                    level = 1;
                }
                else {   
                    System.out.println("Θ罿" + score + " 琌单!!");
                    level = 2;
                }
            }
            else {
                System.out.println("Θ罿" + score + " 琌单!!");
                level = 3;
            }
        }
        else
            System.out.println("Θ罿" + score + " ぃの!!");        
        // switch..case痹瓃
        System.out.println("ノswitch..case北痹瓃耞");
        switch(level) {
            case 1:System.out.println("Θ罿" + score + " 琌ヒ单!!");break;
            case 2:System.out.println("Θ罿" + score + " 琌单!!");break;
            case 3:System.out.println("Θ罿" + score + " 琌单!!");break;
            default:System.out.println("Θ罿" + score + " 琌单!!");break;
        }
    }
}
