package Tree;

public class Bitree {
    public BiTreeNode root;   //树的根节点

    public Bitree(){    //构造一棵空树
        this.root = null;
    }

    public Bitree(BiTreeNode root){ //构造一棵树
        this.root = root;
    }

    public void FirstTree(BiTreeNode t){  //递归先根遍历
        if(t != null){
            System.out.print(t.getData());   //访问根节点
            FirstTree(t.getLchild());  //先根遍历左子树
            FirstTree(t.getRchild());  //先根遍历右子树
        }
    }
    public void MiddleTree(BiTreeNode t){   //递归中根遍历
        if(t != null){
            MiddleTree(t.getLchild());   //中根遍历左子树
            System.out.print(t.getData());   //访问根节点
            MiddleTree(t.getRchild());  //中根遍历右子树
        }
    }
    public void LastTree(BiTreeNode t){    //递归后根遍历
        if(t !=  null){
            LastTree(t.getLchild());  //后根遍历左子树
            LastTree(t.getRchild());   //后根遍历右子树
            System.out.print(t.getData());  //访问根节点
        }
    }
}