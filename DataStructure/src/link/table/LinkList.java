package link.table;

public class LinkList<E> {
    private Node<E> head;
    private int size;

    public LinkList(){
        head = null;
        size = 0;
    }

    public void addFirst(E e){
        Node<E> node = new Node(e,null);
        node.setNext(head);
        head = node;
        size++;
    }

    public String toString(){
        //遍历链表,一个一个的来
        StringBuilder sb = new StringBuilder();
        Node cur = head;
        while (cur != null){
            sb.append(cur.getData().toString() + ";");
            cur = cur.getNext();
        }
        return sb.toString();
    }
}
