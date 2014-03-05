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
    String i1();
}
interface Interface2 extends Interface1{
    String i2();
}
class A{
    public String i1(int itr){
        Class c = this.getClass();
        return c.getName() + " " + itr;
    }
    public String a1(){
        Class c = this.getClass();
        return c.getName();
    }
}
class B extends A implements Interface2{
    final private Class c = B.class;
    final private Class[] interfaces = c.getInterfaces();
    final private Method[] methods = c.getMethods();

    public String i1(){
        String str = " ";
        return str + " Method: " + methods[3].getName();
    }
    public String i2(){
        String str = " ";

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
   final private Class c = C.class;
    final private Class[] interfaces = c.getInterfaces();
    final private Method[] methods = c.getMethods();

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
        B b = new B();
        C c = new C();
        System.out.println("\nTesting of class B:\n" + "Method i1: " + b.i1() + "\nMethod b1: " + b.b1() + "\nMethod i2: " + b.i2());
        System.out.println("\nTesting of class C:\n" + "Method i1: " + c.i1() + "\nMethod c1: " + c.c1() + "\nMethod a1() for class C:  " + c.a1() + "\nMethod i1(int itr) for class C: " + c.i1(1232));
        B i2 = new B();
        System.out.println("\nTesting of class C:\n" + "Method i1: " + ((C)i2).i1() + "\nMethod c1: " + ((C)i2).c1() + "\n " + ((C)i2).a1() + "\n " + ((C)i2).i1(1232));
    }
}
