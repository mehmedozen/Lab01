package Lab01;

public class IntBagApp {
    public static void main(String[] args) {
        IntBag b1 = new IntBag();
        b1.add(1);
        b1.add(2);
        b1.add(3);
        b1.add(4);
        b1.add(5);
        b1.add(6);
        b1.add(7);
        b1.add(8);

        b1.addIndex(5, 2);
        b1.removeIndex(4);
        System.out.println(b1.contains(12));;
        System.out.println(b1.getSize());
        System.out.println(b1.getIndex(4));;

        System.out.println(b1);

        b1.removeAll(8);
        b1.addIndex(4, 7);

        System.out.println(b1);

        System.out.println(b1.getSize());

        IntBag b2 = new IntBag();
        b2.add(1);
        b2.add(2);
        b2.add(1);
        b2.add(2);
        b2.add(1);

        b2.removeAll(1);

        System.out.println(b2);
    }
}
