import org.omg.CORBA.SystemException;

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
    public interface i1{
        void i1();
    }
    public interface  i2 extends i1{
        void i2();
    }
    private static class A{
        private String name = null;
    }
    private static class B extends A implements i1{
        private String name = null;
    }
    private static class C extends A implements i2{
        private String name = null;
    }
    public static void main(String[] args){
        A a = new A("A1");
        B b = new B("B1");
        C c = new C("C1");
        System.out.println(a.a1() + "\n" + b.a1() + "\n" + c.a1());
        b.i1();
        System.out.print("\n");
        c.i2();
        System.out.print("\n");
        c.i1();
    }
}
