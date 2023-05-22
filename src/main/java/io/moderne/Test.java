package io.moderne;

public class Test {

    private String message = "hola";
    public static void main(String[] args) {
        Test t = new Test();
        t.test();
    }

    private void test() {
        System.out.println(message);
    }
}
