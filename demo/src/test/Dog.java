package test;

public class Dog {
	
	

	String name ;
	double  age ;
	 
	// ���췽�� û�з���ֵ //
	
	Dog(String  name1,double age1){
		name=name1;
		age=age1;
		System.out.println("лл");
		
	}
	//��ͨ����  �����з���ֵ
	void wangwang(){
		
		System.out.println("����");
		
	}
	
	void hello (){
		
	System.out.println("��ã�����������");
		
		
	}
	
public static void main (String arg[]){
	 // ��������ʱ���ݵĲ���Ҫ�빹�췽�������б��Ӧ
	Dog mydog =new Dog("���",13.);
	String  name=mydog.name;
	double age =mydog.age;
	System.out.println("���֣�"+name  +"����"+age);
	//���ʷ���
	 mydog.wangwang();
	 
	 mydog.hello();
	
}
     
}
