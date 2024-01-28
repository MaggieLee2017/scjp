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
        System.out.println("Q4_2:程式碼如下，請問最後結果為何？");
        System.out.println("        int x = 2;\n" + //
                "        int y = 1;\n" + //
                "        if ((x == 1) && (y == 2))\n" + //
                "            System.out.print(\"x = 1, \");\n" + //
                "        System.out.print(\"y = 2, \");\n" + //
                "        if (x + y == 3)\n" + //
                "            System.out.println(\"x+y = 3\");");
        System.out.print("Q4_2 結果：");
        Q4_2.showMe();

        System.out.println("////////////////////////////////////");
        System.out.println("Q4_3:程式碼如下，請問最後結果為何？");
        System.out.println("        String str;\n" + //
                "        str = \"\";\n" + //
                "        z: {\n" + //
                "            for (int x = 3; x < 8; x++) {\n" + //
                "                if (x == 4)\n" + //
                "                    break;\n" + //
                "                if (x == 6)\n" + //
                "                    break z;\n" + //
                "                str += x;\n" + //
                "            }\n" + //
                "        }\n" + //
                "        System.out.println(str);");
        System.out.print("Q4_3 結果：");
        Q4_3.showMe();
    }
}

// Q01. 以下程式碼會出現什麼結果？
// int x=2;
// int y=1;
// if((x == 1) && (y == 2))
// System.out.print("x = 1, ");
// System.out.print("y = 2, ");
// if( x+y == 3)
// System.out.println("x+y = 3");
class Q4_1 {
    chapter04exercises q4_1 = new chapter04exercises();

    public static void showMe() {
        int x = 2;
        int y = 1;
        if ((x == 1) && (y == 2))
            System.out.print("x = 1, ");
        System.out.print("y = 2, ");
        if (x + y == 3)
            System.out.println("x+y = 3");
    }
}

// Q02. 以下程式碼會出現什麼結果？
// int x = 0;
// int y = 0;
// do {
// y++;
// x++;
// } while (x < 5);
// System.out.println(x + "," + y);
class Q4_2 {
    chapter04exercises q4_2 = new chapter04exercises();

    public static void showMe() {
        int x = 0;
        int y = 0;
        do {
            y++;
            ++x;
        } while (x < 5);

        System.out.println(x + "," + y);
    }
}

// Q03. 以下程式碼會出現什麼結果？
// String str;
// z:
// str = "";
// for(int x=3; x<8; x++){
// if(x==4) break;
// if(x==6) break z;
// str +=x;
// }
// System.out.println(str);
//結果：無法編譯。因為標籤 z 沒有在任何迴圈關閉。
//標籤z 只能作用在迴圈上。
//修正如下：可以執行。 
class Q4_3 {
    chapter04exercises q4_3 = new chapter04exercises();

    public static void showMe() {
        String str;
        str = "";
        z: {
            for (int x = 3; x < 8; x++) {
                if (x == 4)
                    break;
                if (x == 6)
                    break z;
                str += x;
            }
        }
        System.out.println(str);

    }
}
