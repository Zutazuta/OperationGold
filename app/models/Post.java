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
	public User postedBy;
	public Topic topic;
	public String postContent;
	
	public Post(int postID, User postedBy, Topic topic, String postContent)
	{
		this.postID = postID;
		this.postDate = new Date();
		this.postedBy = postedBy;
		this.topic = topic;
		this.postContent = postContent;
	}
}
