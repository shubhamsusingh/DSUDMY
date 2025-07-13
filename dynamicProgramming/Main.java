package dynamicProgramming;

public class Main {
    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int w = 7;
        Knapsak kn = new Knapsak();
        int val1 = kn.knapsak(wt, val, w, wt.length);
        System.out.println(val1);
    }
}
