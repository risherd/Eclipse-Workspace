
public class Person {
	int age = 0;
	String name = "";
	public Person(){
	    age = 15;
	    name = "Daniel";
	}
	public Person(String name, int age){
	this.age = age;
	this.name = name;
	
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		age = this.age;
	}
	public void setName(String name){
		name = this.name;
	}
	public String toString(){
		return String.format("%s, %d", name, age);
	}
	
}
