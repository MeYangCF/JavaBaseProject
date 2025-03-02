package chapter07;

public class c7_Object03 {

	//编写一个main方法
	public static void main(String[] args) {

		Person12 p1=new Person12();
		p1.age=10;
		p1.name="小明";
		Person12 p2=p1; //把p1 赋给了 p2 ， 让p2指向p1
		System.out.println(p2.age); // 10




	}
}

class Person {
	String name;
	int age;
}