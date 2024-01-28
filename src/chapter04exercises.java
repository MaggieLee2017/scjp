/* 
 * 作者：Maggie Lee
 * 修訂時間：2024/1
 */
public class chapter04exercises {
    public static void main(String[] args) {
        System.out.println("Q4_1:程式碼如下，請問最後結果為何？");
        System.out.println("        int x=2;\n" + //
                "        int y=1;\n" + //
                "        if((x == 1) && (y == 2))\n" + //
                "            System.out.print(\"x = 1, \");\n" + //
                "        System.out.print(\"y = 2, \");\n" + //
                "        if( x+y == 3)\n" + //
                "            System.out.println(\"x+y = 3\");");
        System.out.print("Q4_1 結果：");
        Q4_1.showMe();

        System.out.println("////////////////////////////////////");
    }
}

class Q4_1{
    chapter04exercises q4_1 = new chapter04exercises();
    public static void showMe() {
        int x=2;
        int y=1;
        if((x == 1) && (y == 2))
            System.out.print("x = 1, ");
        System.out.print("y = 2, ");
        if( x+y == 3)
            System.out.println("x+y = 3");
    }
}
