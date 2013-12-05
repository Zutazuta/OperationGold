package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.Date;


@Entity
public class Post extends Model
{
	@Id
	public int postID;
	public Date postDate;
	public User user;
	public Topic thisTopic;
	public String postContent;
	
	public Post(int postID, User user, Topic thisTopic, String postContent)
	{
		this.postID = postID;
		this.postDate = new Date();
		this.user = user;
		this.thisTopic = thisTopic;
		this.postContent = postContent;
	}
}
