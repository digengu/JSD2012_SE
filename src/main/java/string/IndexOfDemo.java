package string;

/**
 *  int indexOf(String str)
 *  返回给定字符串在当前字符串的位置,如果当前字符串不包含给定内容则返回值为-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";
        int index = str.indexOf("in");//搜素str中第一次出现in的位置
        System.out.println(index);//返回  2

        //重新的indexOf方法可以从指定位置开始检索第一次出现指定字符串的位置
        index = str.indexOf("in",2);
        //从下表为2处开始寻找第一次出现iin的位置
        System.out.println(index);//2
        index = str.indexOf("in",3);
        //从下表为3处开始寻找第一次出现iin的位置
        System.out.println(index);//5

        //检索最后一次穿线给定字符串的位置
        index = str.lastIndexOf("in");
        System.out.println(index);//9



    }
}
