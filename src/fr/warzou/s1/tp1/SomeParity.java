package fr.warzou.s1.tp1;

public class SomeParity {

    public static void main(String[] args) {
        int a = BasicOperation.readInt();
        int b = BasicOperation.readInt();
        int c = BasicOperation.readInt();

        int sum = a + b + c;
        System.out.println("Parity of '" + sum + "' = " + (sum % 2 == 0));
    }

}
