package day13;

public class Student {
	String name;
	int age;
	float yearsOfExperience;
	void checkExpereince() {
		if(yearsOfExperience>=5) {
			System.out.println("Expereience");
		}
		else
		{
			System.out.println("LEss experienced");
		
		}
	}
	Student(){
		System.out.println("Construnctor called");
	}
	Student(String n, int a, float yoe){
		name = n;
		age = a;
		yearsOfExperience = yoe;
		checkExpereince();
		System.out.println(n+ " "+a+" "+yearsOfExperience);	
	}
	String getName() {
		return name;
	}
	void setName(String n) {
		name =n;
	}
	int getAge() {
		return age;
	}
	void setAge(int a) {
		age =a;
	}
	float getYearsOfExperience() {
		return yearsOfExperience;
	}
	void setYearsOfExperience(float yoe) {
		yearsOfExperience = yoe;
	}


}
