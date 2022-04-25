package jspSamples.unit5.javaBeanSamples;

import java.io.UnsupportedEncodingException;

public class CharactorEncoding {
    //构造方法
    public CharactorEncoding() {
    }

    /**
     *重写toString用与转换编码
     * @param str 参数为表单传递进来的字符串
     * @return 返回要转换成的编码类型
     */
    public String toString(String str){
        String text = "";
        if (str != null && !"".equals(str)) { //判断参数边界值()不可为空且不能是空格
            try {
                text = new String(str.getBytes("iso-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return  text;
    }
}

