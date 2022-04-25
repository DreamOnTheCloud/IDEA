package jspSamples.unit5.javaBeanSamples;

public class Computer {
    private float oneNum;
    private int operator;
    private float twoNum;
    private float resule;

    public float getOneNum() {
        return oneNum;
    }

    public void setOneNum(float oneNum) {
        this.oneNum = oneNum;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public float getTwoNum() {
        return twoNum;
    }

    public void setTwoNum(float twoNum) {
        this.twoNum = twoNum;
    }

    public float getResule() {
        return resule;
    }

    public void setResule(float resule) {
        this.resule = resule;
    }

    public float getResuleMethod() {
        float result1 = 0;
        switch (operator) {
            case 1:
                result1 = oneNum + twoNum;
                break;
            case 2:
                result1 = oneNum - twoNum;
                break;
            case 3:
                result1 = oneNum * twoNum;
                break;
            case 4:
                if (twoNum != 0) {
                    result1 = oneNum / twoNum;
                } else {
                    System.out.println("错误!除数为0");
                    break;
                }
        }
                return result1;
    }
}