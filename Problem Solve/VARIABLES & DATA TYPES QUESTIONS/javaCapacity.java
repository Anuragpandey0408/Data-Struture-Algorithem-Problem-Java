public class javaCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
       // System.out.println(sb.capacity()); // default 16
       // sb.append("Hello");
       // System.out.println(sb.capacity()); // now 16//
       // sb.append("java is my fav language");
       // System.out.println(sb.capacity());

       System.out.println(sb.capacity());   // 16 char + string len
    }
}
