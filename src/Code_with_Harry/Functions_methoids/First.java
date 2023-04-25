package Code_with_Harry.Functions_methoids;

public class First {
    public static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String args[]) {
        int a = 7;
        int b = 5;
        int c;
        c = logic(a, b);
        System.out.println(c);

        int d = 45;
        int e = -32;
        int f;
        f = logic(d, e);
        System.out.println(f);
    }
}
