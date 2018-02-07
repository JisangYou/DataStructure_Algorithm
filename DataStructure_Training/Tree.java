package DataStructure_Training;

public class Tree {
    // 부모 노드에 자식 노드 추가
    public static void add(Tree_Node parent, Tree_Node child) {
        // 부모 노드의 자식 노드가 없다면
        if(parent.getLeftChild() == null)
            parent.setLeftChild(child);
        // 부모 노드의 자식 노드가 있다면
        else {
            // 자식 노드의 형제로 노드로 추가
        	Tree_Node temp = parent.getLeftChild();
            while(temp.getRightSibling() != null)
                temp = temp.getRightSibling();
             
            temp.setRightSibling(child);
        }
    }
     
    // 레벨 출력
    public static void printLevel(Tree_Node node, int level) {
        int depth = 0;
        Tree_Node tempChild = node;
        Tree_Node tempParent = node;
         
        // 레벨에 도달할 때까지 반복
        while(depth <= level) {
            if(depth == level) {
                // 해당 레벨의 노드가 존재한다면
                while(tempChild != null) {
                    // 데이터를 출력하고 형제노드로 이동한다.
                    System.out.print(tempChild.getData() + " ");
                    tempChild = tempChild.getRightSibling();
                }
                 
                // 부모 노드의 형제노드가 존재한다면
                // 그 노드의 자식 노드들도 출력해줘야 한다.
                if(tempParent.getRightSibling() != null) {
                    tempParent = tempParent.getRightSibling();
                    tempChild = tempParent.getLeftChild();
                } else
                    break;
            } else {
                // 깊이와 레벨이 맞지 않으면 부모 노드를 저장하고
                // 한단계 아래로 내려간다.
                tempParent = tempChild;
                tempChild = tempChild.getLeftChild();
                depth++;
            }
        }
    }
     
    // 모두 출력
    public static void printTree(Tree_Node node, int depth) {
        for(int i = 0; i < depth; i++)
            System.out.print(" ");
         
        // 데이터 출력
        System.out.println(node.getData());
         
        // 자식 노드가 존재한다면
        if(node.getLeftChild() != null)
            printTree(node.getLeftChild(), depth + 1);
         
        // 형제 노드가 존재한다면
        if(node.getRightSibling() != null)
            printTree(node.getRightSibling(), depth);
    }
}
//[출처] JAVA tree 예제|작성자 sysganda