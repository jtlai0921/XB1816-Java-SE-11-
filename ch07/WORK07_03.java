// =============== Program Description ===============
// �{���W�١G WORK07_03.java
// �{���ت��G �H�쵲��C��@�G����
// ===================================================

import java.io.*;
//�G����`�I���O�ŧi

class TreeNode {
    int value;
    TreeNode left_Node;
    TreeNode right_Node;
    // TreeNode�غc�l
    public TreeNode(int value) {
        this.value=value;
        this.left_Node=null;
        this.right_Node=null;
    }
}
//�G�������O�ŧi
class BinaryTree {
    public TreeNode rootNode; //�G���𪺮ڸ`�I
    //�غc�l:�Q�ζǤJ�@�Ӱ}�C���ѼƨӫإߤG����
    public BinaryTree(int[] data) {
        for(int i=0;i<data.length;i++)
            Add_Node_To_Tree(data[i]);
    }
    //�N���w���ȥ[�J��G���𤤾A�����`�I
    void Add_Node_To_Tree(int value) {
        TreeNode currentNode=rootNode;
        if(rootNode==null) { //�إ߾��
            rootNode=new TreeNode(value);
            return;
        }
        //�إߤG����
        while(true) {
           if (value<currentNode.value) { //�b���l��
              if(currentNode.left_Node==null) {
                  currentNode.left_Node=new TreeNode(value);
                  return;
              }
              else currentNode=currentNode.left_Node;
           }
           else { //�b�k�l��
              if(currentNode.right_Node==null) {
                  currentNode.right_Node=new TreeNode(value);
                  return;
              }
              else currentNode=currentNode.right_Node;
           }
       }
   }
}
public class WORK07_03 {
    //�D�禡
    public static void main(String args[]) throws IOException {
        int ArraySize=10;
        int tempdata;
        int[] content=new int[ArraySize];
        BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�гs���J"+ArraySize+"�����");
        for(int i=0;i<ArraySize;i++) {
            System.out.print("�п�J��"+(i+1)+"�����: ");
            tempdata=Integer.parseInt(keyin.readLine());
             content[i]=tempdata;
        }
        new BinaryTree(content);
        System.out.println("===�H�쵲��C�覡�إߤG����,���\!!!===");
    }
}