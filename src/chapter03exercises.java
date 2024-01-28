/* 
 * 作者：Maggie Lee
 * 修訂時間：2024/1
 */
public class chapter03exercises {
    public static void main(String[] args) {
        System.out.println("Q3_1:「7+6-5*4/3%(2+1)的結果為何？」");
        System.out.print("Q3_1 結果：");
        Q3_1.showMe();

        System.out.println("////////////////////////////////////");
        System.out.println("Q3_2:以下程式碼會出現什麼結果？");
        System.out.println("\tint i = 100;");
        System.out.println("\tString s = \"10\";");
        System.out.println("\ts += i;");
        System.out.println("\tSystem.out.println(s);");
        System.out.print("Q3_2 結果：");
        Q3_2.showMe();

        System.out.println("////////////////////////////////////");
        System.out.println("Q3_3:以下程式碼會出現什麼結果？");
        System.out.println("\tboolean result;");
        System.out.println("\tint i = 1;");
        System.out.println("\tresult = 1 == 2 && ++i >= 2;");
        System.out.println("\tSystem.out.println(\"result=\" + result + \", i=\" +i);");
        System.out.print("Q3_3 結果：");
        Q3_3.showMe();

        System.out.println("////////////////////////////////////");
        System.out.println("Q3_4:以下程式碼會出現什麼結果？");
        System.out.println("\tint x=1, y=1;");
        System.out.println("\tboolean b = ++x > ++y;");
        System.out.println("\tSystem.out.println(b);");
        System.out.print("Q3_4 結果：");
        Q3_4.showMe();

    }

}

// Q01:「7+6-5*4/3%(2+1)的結果為何？」
class Q3_1 {
    chapter03exercises Q3_1 = new chapter03exercises();

    public static void showMe() {
        System.out.println(7 + 6 - 5 * 4 / 3 % (2 + 1));
    }
}

// Q02. 以下程式碼會出現什麼結果？
// int i = 100;
// String s = "10";
// s += i;
// System.out.println(s);
class Q3_2 {
    chapter03exercises q3_2 = new chapter03exercises();

    public static void showMe() {
        int i = 100;
        String s = "10";
        s += i;
        System.out.println(s);
    }
}

// Q03. 以下程式碼會出現什麼結果？
// boolean result;
// int i = 1;
// result = 1 == 2 && ++i >= 2;
// System.out.println("result=" + result + ", i=" +i);
class Q3_3 {
    chapter03exercises q3_3 = new chapter03exercises();

    public static void showMe() {
        boolean result;
        int i = 1;
        result = 1 == 2 && ++i >= 2;
        System.out.println("result=" + result + ", i=" + i);
    }
}

// Q04. 以下程式碼會出現什麼結果？
// int x=1, y=1;
// boolean b = ++x > ++y;
// System.out.println(b);
class Q3_4 {
    chapter03exercises q3_4 = new chapter03exercises();

    public static void showMe() {
        int x = 1, y = 1;
        boolean b = ++x > ++y;
        System.out.println(b);
    }
}