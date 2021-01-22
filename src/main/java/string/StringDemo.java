package string;

/**
 * 字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间,用于缓存使用字面量形式
 * 创建的字符串对象,当再次使用相同字面量创建字符串时会直接重用常量池中的对象
 * 而不会再次创建新对象,减少内存开销
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        System.out.println("s1:"+s1);

        String s2 = "123abc";
        //s2字面量与s1相同,因此重用了上面s1创建的字符串对象
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);
        //s1==s2为true,说明保存的地址一样,使用的同一个对象
        String s3 = new String("123abc");
        System.out.println("s3:"+s3);
        System.out.println(s2==s3);
        //s2==s3 结果为false,new很强制,一定创建新对象
        //因此  ==  判断的是 地址是否相同

        //比较字符串内容要用equals
        System.out.println(s2.equals(s3));
        //true, equals 比较的是字符串对象的内容(具体的值)是否相同

        s1 = s1 + "!";//由于字符串是不变对象,修改内容会创建新的对象
        System.out.println("s1:"+s1);//s1内容发生了改变
        System.out.println("s2:"+s2);//s2内容没有发生改变
        System.out.println(s1==s2);//false, s1已经不再和s2同时指向一个对象了

        /*
            编译器有一个特性:
            当编译器在编译一段代码时发现一个计算表达式可以再编译期间确定结果时
            就会进行计算,并将结果编译到class文件中.这样一来虚拟机运行程序时就
            不必每次都进行计算了.
            下面的代码会被编译器改为:
            String s4 = "123abc";
         */
        String s4 = "123" + "abc";
        System.out.println("s4:"+s4);
        System.out.println(s4==s2);

        String s = "123";
        String s5 = s + "abc";
        System.out.println("s5:"+s5);
        System.out.println(s5==s2);



    }
}
