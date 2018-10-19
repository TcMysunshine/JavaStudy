package com.chenhao.Generic;

public class ObjectTest {

    public static void main(String[] args) {
        MemoryCell memorycell = new MemoryCell();
        memorycell.writeObjectValue("12");
        System.out.println(memorycell.readObejctValue());
        memorycell.writeObjectValue(12);
        System.out.println(memorycell.readObejctValue());
        GenericTest<Integer> genericTest = new GenericTest<>();
//        genericTest.setValue(12);

    }
}
class MemoryCell{
    public Object value;
    public void writeObjectValue(Object value){
        this.value = value;
    }
    public Object readObejctValue(){
        return this.value.toString();
    }
}
class GenericTest<T>  {
    private T A;
    private T B;
    public void setA(T A){
        this.A = A;
    }
    public T getA(){
        return this.A;
    }
    public void setB(T B){
        this.B = B;
    }
    public T getB(){
        return this.B;
    }
//    public T getMax(){
//        if(this.A > this.B){
//
//        }
//    }
}
//Comparable接口中的compareTo方法源码
//    private final char value[];//String的底层是字符数组  a.compareTo(b)
//    public int compareTo(String anotherString) {
//        int len1 = value.length;//获取调用该方法的字符串的长度a
//        int len2 = anotherString.value.length;//获取比较字符串的长度b
//        int lim = Math.min(len1, len2);//(a <= b) ? a : b;  min底层代码  这句代码是为了获取较短的字符串的长度
//        char v1[] = value;  //创建两个字符数组,分别指向这两个字符串的所在
//        char v2[] = anotherString.value;
//        //循环比较,循环次数,是较短的字符串的长度,如果用较长的字符串的长度,那么会出现nullPointException
//        int k = 0;
//        while (k < lim) {
//            char c1 = v1[k];
//            char c2 = v2[k];
//            //比较相对应索引的元素,如果元素不同则比较返回中间差距的顺序,如果相等,那么就继续循环比较
//            if (c1 != c2) {
//                return c1 - c2;//字符对应的Unicode码表中的数字,这也就是为什么说String是按照字典书序比较的,如a比b靠前,那么a对应的数字比b小,相减返回负数,差多少顺序,就返回多少
//            }
//            k++;
//        }
//        //如果两个字符串的长度不同,其它都相同,那么返回的就是长度的差距了
//        return len1 - len2;
//    }
//Integer的compareTo方法,底层依据的是compare方法,这个方法是Comparator接口的一个方法
//public int compareTo(Integer anotherInteger) {
//    //实际上Integer的比较是通过Integer中包括的整数来比较的
//    return compare(this.value, anotherInteger.value);
//}
//    public static int compare(int x, int y) {//a.compateTo(b)
//        //如果a比b小,那么返回-1,相等就是0,否则就是1
//        return (x < y) ? -1 : ((x == y) ? 0 : 1);
//    }