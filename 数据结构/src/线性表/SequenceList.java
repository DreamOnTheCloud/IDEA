package 线性表;

import java.util.Arrays;

public  class SequenceList {
    private int[] table;
    private int size = 0; //当前顺序表已用长度 1开始

    /**
     * 生成默认长度的顺序表
     */
    public SequenceList() {
        this(10);
    }

    /**
     * 初始化顺序表
     *
     * @param length 初始化顺序表的长度
     */
    public SequenceList(int length) {
        this.table = new int[length];
    }

    /**
     * 为顺序表头追加数据
     *
     * @param value 头部(下标0)追加的数据
     * @return 是否完成头部追加数据
     */
    public boolean addAtHead(int value) {
        if (this.isFull()) {
//            System.out.println("顺序表已满,无法添加");
//            return false; //若顺序表已满 无法添加
            this.expandTable();
        }
        for (int i = table.length - 2; i >= 0; i--) {
            this.table[i + 1] = this.table[i];
        }
        this.table[0] = value;
        this.size++;
        return true;
    }

    /**
     * 判断当前顺序表是否已满
     *
     * @return 当前顺序表是否已满
     */
    public boolean isFull() {
        return this.table.length == this.size;
    }

    /**
     * 扩充当前顺序表长度,使之长度变为当前长度的2倍
     */
    public void expandTable() {
        int tableLen = this.table.length;
        int newTable[] = new int[tableLen > 0 ? tableLen * 2 : 1];
        System.arraycopy(this.table, 0, newTable, 0, tableLen);
        this.table = newTable;
    }

    /**
     * 为顺序表指定位置插入元素
     *
     * @param index 指定位置下标
     * @param value 插入目标数据
     * @return 是否完成插入
     */
    public boolean add(int index, int value) throws Exception {
        if (this.isFull()) {
//            System.out.println("顺序表已满,无法添加");
//            return false; //若顺序表已满 无法添加
            this.expandTable();
        }
        if (index == this.size) { //若插入位置为最后一个有效元素之后视为追加
            this.addAtTail(value);
            return true;
        }
        if (!this.isLegitimate(index)) return false;
        System.arraycopy(this.table, index, this.table, index + 1, size - index);
        this.table[index] = value;
        this.size++;
        return true;
    }

    /**
     * 为顺序表尾部追加数据
     *
     * @param value 尾部追加的数据
     * @return 是否完成尾部追加数据
     */
    public boolean addAtTail(int value) {
        if (this.isFull()) {
//            System.out.println("顺序表已满,无法添加");
//            return false; //若顺序表已满 无法添加
            this.expandTable();
        }
        this.table[size] = value;
        this.size++;
        return true;
    }

    /**
     * 判断index作为索引在顺序表中是否合法
     *
     * @param index 待判断的顺序表索引
     * @return index在顺序表中是否合法
     */
    public boolean isLegitimate(int index) throws Exception {
        if (index < 0 || index >= this.size) {
            throw new Exception("索引" + index + "非法,合法范围为[" + 0 + "," + (this.size - 1) + "]");
        }
        return true;
    }

    /**
     * 删除并弹出index位置的元素
     *
     * @param index 待删除元素下标
     * @return 被删除的元素
     */
    public int pop(int index) throws Exception {
        if (this.isEmpty()) return -1; //判空
        if (!this.isLegitimate(index)) return -1; //判index有效
        int deleteVal = this.table[index];
        this.delete(index);
        return deleteVal;
    }

    /**
     * 判断当前顺序表是否为空
     *
     * @return 当前顺序表是否为空
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 删除顺序表中指定元素
     *
     * @param index 待删除元素下标
     * @return 是否完成删除
     */
    public boolean delete(int index) throws Exception {
        if (this.isEmpty()) return false;
        if (!this.isLegitimate(index)) return false;
        for (int i = index; i <= this.table.length - 2; i++) {
            this.table[i] = this.table[i + 1];
        }
        this.size--;
        return true;
    }

    /**
     * 删除当前顺序表第一个有效元素(index = 0)
     *
     * @return 首个元素是否被删除
     */
    public boolean deleteAtHead() throws Exception {
        if (this.isEmpty()) return false;
        this.delete(0);
        return true;
    }

    /**
     * 删除当前顺序表最后一个有效元素(index = size-1)
     *
     * @return 最后一个元素是否被删除
     */
    public boolean deleteAtTail() throws Exception {
        if (this.isEmpty()) return false;
        this.delete(this.size - 1);
        return true;
    }

    /**
     * 清空顺序表内容
     */
    public void clear() {
        Arrays.fill(this.table, 0);
        this.size = 0;
    }

    /**
     * 获取第i个顺序表元素
     *
     * @param index 顺序表索引 从0开始
     * @return 顺序表中的第i个元素
     */
    public int get(int index) throws Exception {
        if (!this.isLegitimate(index) && !this.isEmpty()) return -1;
        return this.table[index];
    }

    /**
     * 修改顺序表第i个元素(不允许添加索引为size的值 也就是添加最后一个元素)
     *
     * @param index 顺序表索引 从0开始
     * @param val   被修改的第i个元素的值
     * @return 是否完成修改
     */
    public boolean set(int index, int val) throws Exception {
        if (!this.isLegitimate(index)) return false;
        this.table[index] = val;
        return true;
    }

    /**
     * 判断当前顺序表中是否包含某元素
     *
     * @param val 待判断该元素是否在顺序表中
     * @return 是否包含某元素
     */
    public boolean contain(int val) {
        for (int i = 0; i <= this.size - 1; i++) {
            if (this.table[i] == val) return true;
        }
        return false;
    }

    /**
     * 返回某元素在顺序表中第一次出现的位置 若未在顺序表中出现返回-1
     *
     * @param val 待判断的值
     * @return val在顺序表中第一次出现的索引, 若不包含返回-1
     */
    public int indexOf(int val) {
        for (int i = 0; i <= this.size - 1; i++) {
            if (this.table[i] == val) return i;
        }
        return -1;
    }

    /**
     * 返回当前顺序表中元素的数量
     *
     * @return 顺序表中元素数量
     */
    public int getSize() {
        return this.size;
    }

    /**
     * 返回顺序表的容量(this.table.length)
     *
     * @return 顺序表的容量
     */
    public int getCapacity() {
        return this.table.length;
    }

    /**
     * 返回顺序表的字符串表示形式 以便输出查看
     *
     * @return 顺序表中有效元素的字符串表示形式
     */
    @Override
    public String toString() {
        if (this.size == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i <= this.size - 1; i++) {
            result.append(this.table[i]);
            result.append(",");
        }
        result.deleteCharAt(result.length() - 1);
        result.append("]");
        return result.toString();
    }
}

class Test{
    public static void main(String[] args) {
        SequenceList list = new SequenceList(3);
        try {
            list.addAtTail(1); //[] -> [1]
            System.out.println(list);
            list.addAtHead(2); //[1] -> [2,1]
            System.out.println(list);
            list.add(1, 3); //[2,1] -> [2,3,1]
            System.out.println(list);
            list.delete(1); //[2,3,1] -> [2,1]
            System.out.println(list);

            System.out.println(list.get(0));
            list.set(1, 666);
            System.out.println(list);
            list.add(2, 9);
            System.out.println(list);

            System.out.println(list.contain(666)); //true
            System.out.println(list.indexOf(666));
            System.out.println(list.contain(557)); //false
            System.out.println(list.getSize());

//        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list.isEmpty());
            System.out.println(list);
//        System.out.println(list.pop(2));
//        System.out.println(list);
//        list.deleteAtHead();
//        list.deleteAtTail();
//        System.out.println(list);
            list.delete(0);
            list.delete(list.getSize() - 1);
            System.out.println(list);

            list.add(0, 111);
            System.out.println(list);
            list.add(list.getSize(), 222); //插入最后一个有效下标后一个视为合法 相当于追加
            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

