package DataStructure_Training;

public class Test_Tree {
    public static void main(String[] args) {
        // 루트 생성
    	Tree_Node root = new Tree_Node('A');
         
        // 노드 생성
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
 
        // 데이터 추가
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
         
        // 모두 출력
        Tree.printTree(root, 0);
         
        // 레벨별 출력
        for(int i = 0; i < 4; i++) {
            System.out.println("\nLevel : " + i);
            Tree.printLevel(root, i);
        }
    }
}
/*
 
 트리 구조(tree 構造, 문화어: 나무구조)란 그래프의 일종으로, 여러 노드가 한 노드를 가리킬 수 없는 구조이다. 간단하게는 회로가 없고, 서로 다른 두 노드를 잇는 길이 하나뿐인 그래프를 트리라고 부른다.
트리에서 최상위 노드를 루트 노드(root node 뿌리 노드[*])라고 한다. 또한 노드 A가 노드 B를 가리킬 때 A를 B의 부모 노드(parent node), B를 A의 자식 노드(child node)라고 한다. 자식 노드가 없는 노드를 잎 노드(leaf node 리프 노드[*])라고 한다. 잎 노드가 아닌 노드를 내부 노드(internal node)라고 한다.


*/






//[출처] JAVA tree 예제|작성자 sysganda
