package chapter07;

public class c7_ConstructorDetail {

	//编写一个main方法
	public static void main(String[] args) {
		Person_n p1 = new Person_n("king", 40);//第1个构造器
		Person_n p2 = new Person_n("tom");//第2个构造器

		Dog dog1 = new Dog();//使用的是默认的无参构造器

	}
}
class Dog {
	//如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	//使用javap指令 反编译看看
	/*
		默认构造器
		Dog() {

		}
	 */
	//一旦定义了自己的构造器,默认的构造器就覆盖了，就不能再使用默认的无参构造器，
	//除非显式的定义一下,即:  Dog(){}  写 (这点很重要)
	//
	public Dog(String dName) {
		//...
	}
	Dog() { //显式的定义一下 无参构造器

	}
}

class Person {
	String name;
	int age;//默认0
	//第1个构造器
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	//第2个构造器, 只指定人名，不需要指定年龄
	public Person(String pName) {
		name = pName;
	}
}