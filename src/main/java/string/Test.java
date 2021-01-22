package string;

public class Test {
    public static void main(String[] args) {
        String s1 = getHostName("www.tedu.cn");
        String s2 = getHostName("http://www.tarena.com");
        String s3 = getHostName("doc.canglaoshi.com.cn");
        System.out.println("s1:"+s1);//s1:tedu
        System.out.println("s2:"+s2);//s2:tarena
        System.out.println("s3:"+s3);//s3:canglaoshi
    }

    /**
     * 获取给定的网址中的域名(地址中第一个"."到第二个"."之间的内容)
     * @param address
     * @return
     */
    public static String getHostName(String address){
//        int start = address.indexOf(".")+1;
//        int end = address.indexOf(".",start);
//
//        return address.substring(start,end);

        int start = address.indexOf(".")+1;
        int end = address.indexOf(".",start);
        String sub = address.substring(start,end);
        if(sub.indexOf(".")==-1){

        }else{

        }
        return address.substring(start,end);
    }


}
