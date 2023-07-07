package Lab01;

public class Fibonacci {
    public static void main(String[] args) {
        IntBag ib1 = new IntBag();
        
        ib1.add(0);
        ib1.add(1);

        for(int i = 0; i < 38; i++){
            int a;
            a = ib1.getIndex(i) + ib1.getIndex(i+1);
            ib1.add(a);
        }

        System.out.println(ib1);
    }
}
