package models;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

import java.util.ArrayList;
import java.util.List;



@Entity
public class Topic extends Model
{
	@Id
	public int topicID;
	public String subjectLine;
	public int viewCount;
	public Forum thisForum;
	public ArrayList<Post> postList;
	
	public Topic(int topicID, String subjectLine, Forum thisForum, User by, String content)
	{
		this.topicID = topicID;
		this.subjectLine = subjectLine;
		this.thisForum = thisForum;
		this.postList = new ArrayList<Post>();
		Post post = new Post(0, by, this, content);
		postList.add(post);
	}
	
	public int getPostCount()
	{
		return postList.size();
	}
	
	public List<Post> getPosts()
	{
		return postList;
	}
}
