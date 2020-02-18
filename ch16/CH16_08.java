import java.util.Arrays;
class Employee { 
   private String employee_ID;
   public Employee(String employee_ID) {
       this.employee_ID = employee_ID; 
   }
   public String getID() { 
       return employee_ID; 
   }
}

public class  CH16_08 {
    public static void main(String[] args) {
    Employee[] RD = {new Employee("RD2018090801"),
                     new Employee("RD2015061201"),
                     new Employee("RD2017120701"),
                     new Employee("RD2017120702"),
                     new Employee("RD2017120703")};

    // �ϥ�Lambda�B�⦡
    Arrays.sort(RD,(person1,person2) -> 
                    person1.getID().compareTo(person2.getID()));
    // ���RD���������uID�C��
    System.out.println("�̭��u�s���i�Ӥ��q�����ᶶ�ǱƦC: ");
    for (Employee person : RD) 
        System.out.println("���u�s��="+person.getID());
   }
}