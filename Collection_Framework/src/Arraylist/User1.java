package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class User1 {
public static void main(String[]args)
{
	ArrayList<User> users=new ArrayList<User>();
	User user1=new User(111,"Amar","amar@gmail.com","987067");
	User user2=new User(111,"vyanker","vyanket@gmail.com","345565");
	User user3=new User(111,"Omkar","omkar@gmail.com","245555");
	User user4=new User(111,"Aryan","arya@gmail.com","988067");
	User user5=new User(111,"Ankit","anki@gmail.com","987097");
	users.add(user1);
	users.add(user2);
	users.add(user3);
	users.add(user4);
	users.add(user5);
	//System.out.println(users);
	/*for(User i: users) {
		System.out.println(i);
	}*/
	System.out.println("============================================");
	for(int i=0;i<users.size();i++) {
		System.out.println("ID       🐻🐻:"+users.get(i).getId());
		System.out.println("Username 🤦‍♀️🤦‍♀️:"+users.get(i).getUsername());
		System.out.println("Gmail    🤞🤞:"+users.get(i).getEmail());
		System.out.println("Password 🙌🙌:"+users.get(i).getPassword());
		System.out.println("========================");
	}
}
}