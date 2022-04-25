package link.table;

public class Node<E> {  //泛型类:使用泛型可以兼容不同的数据类型
    private E data; //数据:节点的数据
    private Node next; //对象:引用下一个节点的对象,在Java中没有指针的概念,叫做引用

    public Node(E data, Node next){
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public String toString(){
        return super.toString();
    }
}
