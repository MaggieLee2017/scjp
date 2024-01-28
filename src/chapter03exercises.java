/* 
 * 作者：Maggie Lee
 * 修訂時間：2024/1
 */
public class chapter03exercises {
    public static void main(String[] args) {
        System.out.println("Q01:「7+6-5*4/3%(2+1)的結果為何？」");
        System.out.print("Q01 結果：");
        Q01.showMe();

        System.out.println("////////////////////////////////////");
        System.out.println("Q02:以下程式碼會出現什麼結果？");
        System.out.println("\tint i = 100;");
        System.out.println("\tString s = \"10\";");
        System.out.println("\ts += i;");
        System.out.println("\tSystem.out.println(s);");
        System.out.print("Q02 結果：");
        Q02.showMe();

        System.out.println("////////////////////////////////////");
        System.out.println("Q03:以下程式碼會出現什麼結果？");
        System.out.println("\tboolean result;");
        System.out.println("\tint i = 1;");
        System.out.println("\tresult = 1 == 2 && ++i >= 2;");
        System.out.println("\tSystem.out.println(\"result=\" + result + \", i=\" +i);");
        System.out.print("Q03 結果：");
        Q03.showMe();

        System.out.println("////////////////////////////////////");
        System.out.println("Q04:以下程式碼會出現什麼結果？");
        System.out.println("\tint x=1, y=1;");
        System.out.println("\tboolean b = ++x > ++y;");
        System.out.println("\tSystem.out.println(b);");
        System.out.print("Q04 結果：");
        Q04.showMe();

    }

}

// Q01:「7+6-5*4/3%(2+1)的結果為何？」
class Q01 {
    chapter03exercises Q01 = new chapter03exercises();

    public static void showMe() {
        System.out.println(7 + 6 - 5 * 4 / 3 % (2 + 1));
    }
}

// Q02. 以下程式碼會出現什麼結果？
// int i = 100;
// String s = "10";
// s += i;
// System.out.println(s);
class Q02 {
    chapter03exercises q02 = new chapter03exercises();

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
class Q03 {
    chapter03exercises q03 = new chapter03exercises();

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
class Q04 {
    chapter03exercises q04 = new chapter03exercises();

    public static void showMe() {
        int x = 1, y = 1;
        boolean b = ++x > ++y;
        System.out.println(b);
    }
}