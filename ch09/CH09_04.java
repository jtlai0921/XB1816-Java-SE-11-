/*�ɮ�:CH09_04.java 
 *����:��������*/
//����SetLoginData
interface SetLoginData{
    //�ŧi��H������k
    abstract void set(String acc, String pass);
}

//����ConnectDatabase
interface ConnectDatabase{
    //�إ����ұ`��
    String ACCOUNT = "root";
    String PASSWORD = "123456";
    //�ŧi��H������k
    abstract void connect();
}

//����ShowResult
interface ShowResult{
    //�ŧi��H������k
    abstract void show();
}

//�ŧi��@���O
class UserDB implements SetLoginData, ConnectDatabase, ShowResult{
    //�ŧi���O�������
    String userAccount;
    String userPassword;
    String resultMessage;
    //������H������k
    public void set(String acc, String pass){
        userAccount = acc;
        userPassword = pass;
}
    public void connect(){
        if(userAccount == ACCOUNT && userPassword == PASSWORD){
            resultMessage = "���\�s��User��Ʈw!!";
        }
        else{
            resultMessage = "User��Ʈw�s������,���ˬd�n�J���b���P�K�X!!";
        }
    }
    public void show(){
        System.out.println(resultMessage);
    }
}
		
//�D�n���O
public class CH09_04{
    //�D�{���϶�
    public static void main(String args[]){
        //��@�l�����O����
        UserDB myObject = new UserDB();
        //�I�s����������������k
        myObject.set("root", "123456");
        System.out.println("�ϥΪ̿�J��Ʀp�U�G\n" +
		           "�n�J�b���G root \n" +
		           "�n�J�K�X�G 123456 \n");
        myObject.connect();
        myObject.show();
    }
}