package Tree;

public class BiTreeTest {
    public Bitree createbitree(){ //造树
        BiTreeNode d = new BiTreeNode('d');
        BiTreeNode g = new BiTreeNode('g');
        BiTreeNode h = new BiTreeNode('h');
        BiTreeNode e = new BiTreeNode('e',g,null);
        BiTreeNode b = new BiTreeNode('b',d,e);
        BiTreeNode f = new BiTreeNode('f',null,h);
        BiTreeNode c = new BiTreeNode('c',f,null);
        BiTreeNode a = new BiTreeNode('a',b,c);
        return new Bitree(a);   //创建根节点为a的二叉树
    }
    public static void main(String[] args){
        BiTreeTest s = new BiTreeTest();
        Bitree b = s.createbitree();
        BiTreeNode root = b.root; //取得树的根节点
        System.out.print("先根遍历");
        b.FirstTree(root);
        System.out.println();
        System.out.print("中根遍历");
        b.MiddleTree(root);
        System.out.println();
        System.out.print("后根遍历");
        b.LastTree(root);
    }
}
