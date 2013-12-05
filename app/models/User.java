package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;


@Entity
public class User extends Model
{
	@Id
	public String username;
	public String password;
	public boolean isAdmin;
	
	public User(String username, String password, boolean isAdmin)
	{
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	public static Finder<String,User> find = new Finder<String,User>(String.class, User.class);
	
	

}
