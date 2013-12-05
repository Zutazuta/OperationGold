package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.ArrayList;

@Entity
public class User extends Model
{
	@Id
	
	public String username;
	public String password;
	public int iUserClass;
	public String location;
	public int age;
	public String email;
	public String esoID;
	public int postCount;
	public ArrayList<Post> recentPosts;
	public ArrayList<ReplayTopic> replayTopics;
	
	public User(String username, String password, int iUserClass)
	{
		this.username = username;
		this.password = password;
		this.iUserClass = iUserClass;
		this.postCount = 0;
		this.recentPosts = new ArrayList<Post>();
		this.replayTopics = new ArrayList<ReplayTopic>();
	}
			
	public static Finder<String,User> find = new Finder<String,User>(String.class, User.class);
	
	

}
