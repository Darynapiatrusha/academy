package by.academy.lesson8;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		System.out.println(phone1);
		
		Phone phone2 = new Phone();
		System.out.println(phone2);
		
		Phone phone3 = new Phone();
		System.out.println(phone3);
		
		Phone phone4 = new Phone("375445941288","nokia", 2.5);
		System.out.println(phone4.getNumber());
		phone4.receiveCall("Никита");
		
		Phone phone5 = new Phone("375447846321","iphone", 14);
		System.out.println(phone5.getNumber());
		phone5.receiveCall("Настя");
		
		Phone phone6 = new Phone("375336015849","huawei", 6.8);
		System.out.println(phone6.getNumber());
		phone6.receiveCall("Маша");
		
		Phone phone7 = new Phone("375296015849","huawei");
		System.out.println(phone7.getNumber());
		phone7.receiveCall("Оля");
		
		Phone phone8 = new Phone("375446015849","huawei");
		System.out.println(phone8.getNumber());
		phone8.receiveCall("Коля");
		
	}
}
