package Tree;

public class BiTreeNode {
    private Object data; //定义节点的数据区域

    private BiTreeNode lchild , rchild; //定义左右孩子节点
    //构造一个空节点
    public BiTreeNode(){
        this(null,null,null);
    }

    //构造一颗 只有数据区域 左,右孩子为空的二叉树
    public BiTreeNode(Object data) {
        this(data , null , null);
    }

    //构造一颗全家福二叉树
    public BiTreeNode(Object data , BiTreeNode lchild , BiTreeNode rchild){
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    //set && get
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BiTreeNode getLchild() {
        return lchild;
    }

    public void setLchild(BiTreeNode lchild) {
        this.lchild = lchild;
    }

    public BiTreeNode getRchild() {
        return rchild;
    }

    public void setRchild(BiTreeNode rchild) {
        this.rchild = rchild;
    }
}

