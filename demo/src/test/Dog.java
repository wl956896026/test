package test;

public class Dog {
	
	

	String name ;
	double  age ;
	 
	// 构造方法 没有返回值 //
	
	Dog(String  name1,double age1){
		name=name1;
		age=age1;
		System.out.println("谢谢");
		
	}
	//普通方法  必须有返回值
	void wangwang(){
		
		System.out.println("汪汪");
		
	}
	
	void hello (){
		
	System.out.println("你好！！！！！！");
		
		
	}
	
public static void main (String arg[]){
	 // 创建对象时传递的参数要与构造方法参数列表对应
	Dog mydog =new Dog("大白",13.);
	String  name=mydog.name;
	double age =mydog.age;
	System.out.println("名字："+name  +"年龄"+age);
	//访问方法
	 mydog.wangwang();
	 
	 mydog.hello();
	
}
     
}
