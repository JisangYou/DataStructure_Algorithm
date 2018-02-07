package DataStructure_Training;

public class Tree_Node {
    private char data;
    private Tree_Node leftChild;
    private Tree_Node rightSibling;
 
    public Tree_Node(char data) {
        this.data = data;
    }
 
    public void setData(char data) {
        this.data = data;
    }
 
    public char getData() {
        return data;
    }
 
    public void setLeftChild(Tree_Node leftChild) {
        this.leftChild = leftChild;
    }
 
    public Tree_Node getLeftChild() {
        return leftChild;
    }
 
    public void setRightSibling(Tree_Node rightSibling) {
        this.rightSibling = rightSibling;
    }
 
    public Tree_Node getRightSibling() {
        return rightSibling;
    }
}
//[출처] JAVA tree 예제|작성자 sysganda