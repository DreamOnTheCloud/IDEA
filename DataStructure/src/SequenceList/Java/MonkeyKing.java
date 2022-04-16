package SequenceList.Java;
public class    MonkeyKing {
    public static void main(String[] args) throws Exception {
        SequenceList ring1 = new SequenceList();
        ring1.append(4);
        ring1.append(100);
        System.out.println(ring1.toString());
        ring1.insterFirst(33);
        System.out.println(ring1.toString());
        ring1.remove(2);
        System.out.println(ring1.toString());
        ring1.removeFirst();
        System.out.println(ring1.toString());

    }
}

//顺序表类
class SequenceList{
    private int []array; //声明array数组
    private int size;    //声明size长度

    //创建构造方法将数组赋予容量与初始长度
    public SequenceList(int capacity){
        this.array = new int[capacity]; //数组的容量
        this.size = 0; //数组的长度
    }

    //第二个构造方法定死数组长度
    public SequenceList(){
        this(3);
    }

    /**
     * 追加数组元素方法
     * @param x 要追加的数据
     * @throws Exception 定死数组长度长处数组长度报错
     */
    public void append(int x) throws Exception{
        if (size > array.length){               //array.length的值就是上面的capacity
            throw new Exception("超出数组异常");  //数组长度能写死,size不是死的只是一个变量
        }
        array[size] = x;
        size++;
    }

    /**
     * 数组头插入元素方法
     * @param value 要插入的数据
     * @throws Exception 抛出的异常
     */
    public void insterFirst(int value) throws Exception{
        if (size > array.length-1){
            throw new Exception("超出数组长度异常");
        }
        for (int i = size - 1; i >= 0; i--){
            array[i+1] = array[i];
        }
        array[0] = value;
        size++;
    }

    //判断顺序表是否为空与是否为满
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == array.length;
    }

    /**
     *删除顺序表的第一个元素
     * @return 返回被删除的元素
     * @throws Exception
     */
    public int removeFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("空数组");
        }

        int result = array[0];
        for (int i = 1; i < size; i++){
            array[i - 1] = array[i];
            size--;
            return result;
        }
        return result;
    }

    /**
     *
     * @param index
     * @retur 返回删除的元素
     * @throws Exception
     */
    public int remove(int index) throws Exception{
        if (size == 0){
            throw new Exception("数组元素为空,无法删除元素");
        }
        if(index < 0 || index > size -1){
            throw new Exception("索引index(" + index + ")不在范围内");
        }
        int result = array[index];
//        for (int i = index; i < size; i++){
//            array[i] = array[i+1];
//        }
        for (int i = index + 1; i < size; i++){
            array[i-1] = array[i];
        }
        size--;
        return result;
    }

    /**
     * 根据元素e查找其所在顺序表中的索引
     * @param e
     * @return
     */
    public int indexOf(int e){
        for (int i = 0; i < size; i++){
            if (e == array[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据索引位置返回相应的值
     * @param index
     * @return
     * @throws Exception
     */
    public  int get(int index) throws Exception{
        if (size == 0){
            throw new  Exception("顺序表为空,没有元素删除");
        }
        if (index < 0 || index > size-1){
            throw new Exception("索引index(" + index +")不在范围内!");
        }
        return array[index];
    }


    public String toString(){
        StringBuilder resule = new StringBuilder("[");
        for(int i = 0 ; i < size ; i++){
            resule.append(array[i]);
            resule.append(",");
        }
        resule.deleteCharAt(resule.length() - 1);
        resule.append("]");
        return resule.toString();
    }
}























