/**
 * Created by poriesto on 2/14/14.
 */
/*
*
2. Создать приложение с 3 классами- А, B , С и 2 интерфейсами I1, I2.
	Класс А является родительским для классов B и С, Интерфейс I1 является родительским для интерфейса I2.
	Класс В реализует интерфейс I2. Класс С реализует интерфейс I1.
	Интерфейс I1 содержит метод i1, класс A содержит метод i1 с параметром, класс А также содержит метод а1,
	интерфейс I2 содержит метод i2. Класс B содержит метод b1.
	Класс С содержит метод с1.
	Все методы выводят строку с именем своего класса или интерфейса и именем метода.
	Создать минимальное число объектов для выполнения всех указанных 6 методов.
	и выполнить все эти методы.
	 */

public class labn2 {
    interface i1{
        String name = "Interface 1";
        String i1();
    }
    interface i2 extends i1{
        String name = "Interface 2";
        String i2();
    }
    static class A{
        String class_name = "A";
        public A(){}
        public String a1(){
            return this.class_name;
        }
    }
    static class B extends A implements i2{
        String class_name = "B";
        @Deprecated
        public String i1(){return name;}
        @Override
        public String i2(){
            return name;
        }
        public String b1(){
            return this.class_name;
        }
    }
    static class C extends A implements i1{
        String class_name = "C";
        @Override
        public String i1(){
            return name;
        }
        public String c1(){
            return this.class_name;
        }

    }
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println("Name of class: " + a.a1());
        System.out.println("Name of interface: " + b.i2() + " Name of class: " + b.b1());
        System.out.println("Name of interface: " + c.i1() + " Name of class: " + c.c1());
    }
}
