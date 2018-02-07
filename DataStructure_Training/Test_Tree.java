package DataStructure_Training;

public class Test_Tree {
    public static void main(String[] args) {
        // ��Ʈ ����
    	Tree_Node root = new Tree_Node('A');
         
        // ��� ����
    	Tree_Node B = new Tree_Node('B');
    	Tree_Node C = new Tree_Node('C');
    	Tree_Node D = new Tree_Node('D');
    	Tree_Node E = new Tree_Node('E');
    	Tree_Node F = new Tree_Node('F');
    	Tree_Node G = new Tree_Node('G');
    	Tree_Node H = new Tree_Node('H');
    	Tree_Node I = new Tree_Node('I');
    	Tree_Node J = new Tree_Node('J');
    	Tree_Node K = new Tree_Node('K');
 
        // ������ �߰�
        Tree.add(root, B);
        Tree.add(B, C);
        Tree.add(B, D);
        Tree.add(D, E);
        Tree.add(D, F);
         
        Tree.add(root, G);
        Tree.add(G, H);
         
        Tree.add(root, I);
        Tree.add(I, J);
        Tree.add(J, K);
         
        // ��� ���
        Tree.printTree(root, 0);
         
        // ������ ���
        for(int i = 0; i < 4; i++) {
            System.out.println("\nLevel : " + i);
            Tree.printLevel(root, i);
        }
    }
}
/*
 
 Ʈ�� ����(tree ϰ��, ��ȭ��: ��������)�� �׷����� ��������, ���� ��尡 �� ��带 ����ų �� ���� �����̴�. �����ϰԴ� ȸ�ΰ� ����, ���� �ٸ� �� ��带 �մ� ���� �ϳ����� �׷����� Ʈ����� �θ���.
Ʈ������ �ֻ��� ��带 ��Ʈ ���(root node �Ѹ� ���[*])��� �Ѵ�. ���� ��� A�� ��� B�� ����ų �� A�� B�� �θ� ���(parent node), B�� A�� �ڽ� ���(child node)��� �Ѵ�. �ڽ� ��尡 ���� ��带 �� ���(leaf node ���� ���[*])��� �Ѵ�. �� ��尡 �ƴ� ��带 ���� ���(internal node)��� �Ѵ�.


*/






//[��ó] JAVA tree ����|�ۼ��� sysganda
