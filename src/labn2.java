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
interface int1{
    String name = "Interface 1";
    String i1();
}
interface int2 extends int1{
    String name = "Interface 2";
    String i2();
}
class A{
    private String class_name = "A";
    public A(){}
    public String a1(){
        return class_name;
    }
}
class B extends A implements int2{
    private String class_name = "B";
    public String i1(){
        return name;
    }
    public String i2(){
        return name;
    }
    public String b1(){
        return this.class_name;
    }
}
class C extends A implements int1{
    private String class_name = "C";
    public String i1(){
        return name;
    }
    public String c1(){
        return this.class_name;
    }

}

public class labn2 {

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println("Name of interface: " +  " Name of class: " + a.a1());
        System.out.println("Name of interface: " + b.i2() + " Name of class: " + b.b1());
        System.out.println("Name of interface: " + c.i1() + " Name of class: " + c.c1());
    }
}
