package lesson10.task4.p2;

import lesson10.task4.p1.A;

public class A2 extends A {
    @Override
    public String toString() {
        return "p2.A2 extends p1.A{\n" +
                "\tполя класса p1.A доступные из класса p2.A2:\n" +
                "\t\tpublic    " + A.s1 +
                "\n\t\tprotected " + A.s3 + "\n" +
                "\tполя класса p1.A не доступные из класса p2.A2:\n" +
                "\t\tdefault   p1.A.s2" +
                "\n\t\tprivate   " + "p1.A.s4\n" +
                "}\n";
    }
}
