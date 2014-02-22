import java.lang.reflect.Method;

/**
 * Created by poriesto on 2/14/14.
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
interface Interface1{
    String name = "Interface 1";
    String i1() throws NoSuchMethodException;
}
interface Interface2 extends Interface1{
    String i2();
}
class A{
    public void i1(int itr){

    }
    public String a1(){
        Class c = this.getClass();
        return c.getName();
    }
}
class B extends A implements Interface2{
    Class c = B.class;
    Class[] interfaces = c.getInterfaces();
    Method[] methods = c.getMethods();

    public String i1(){
        String str = " ";
        return str + " Method: " + methods[3].getName();
    }
    public String i2(){
        String str = " ";
        String str1 = " ";

        for(Class cInterface : interfaces){
            str += (cInterface.getName() + " ");
        }

        return str + " Method: " + methods[1].getName();
    }
    public String b1(){
        Class c = this.getClass();
        return c.getName() + " extends of " + c.getSuperclass();
    }
}
class C extends A implements Interface1{
    Class c = C.class;
    Class[] interfaces = c.getInterfaces();
    Method[] methods = c.getMethods();

    public String i1(){
        String str = " ";
        for(Class cInterface : interfaces){
            str += (cInterface.getName() + " ");
        }
        return str + " Method: " + methods[0].getName();
    }
    public String c1(){
        Class c = this.getClass();
        return c.getName() + " extends of " + c.getSuperclass();
    }
}

public class labn2 {

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        //System.out.println("Name of interface: " + " Name of class: " + a.a1());
        //System.out.println("Name of interface:" + b.i2() + " Name of class: " + b.b1());
        //System.out.println("Name of interface:" + c.i1() + " Name of class: " + c.c1());
        System.out.println("\nTesting of class B:\n" + "Method i1: " + b.i1() + "\nMethod b1: " + b.b1() + "\nMethod i2: " + b.i2());
        System.out.println("\nTesting of class C:\n" + "Method i1: " + c.i1() + "\nMethod c1: " + c.c1());
    }
}
