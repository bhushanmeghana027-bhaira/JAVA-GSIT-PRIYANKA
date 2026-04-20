package day11;

public class USerDetailsMAin {
	 public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.userId= 120;
		user.name = "Rajaat";
		UserDetails.Address address = user.new Address();
		address.city = "Pune";
		address.state = "MH";
		address.country = "IN";
		
		System.out.println(user.name+":"+address.country);
	}
}
