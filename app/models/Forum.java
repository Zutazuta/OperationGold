package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.ArrayList;



@Entity
public class Forum extends Model
{

	@Id
	public int forumID;
	public String forumName;
	public ArrayList<Topic> topicList;
	public ArrayList<Forum> subForumList;
	public int parentID;
	
	public Forum(int forumID, String forumName, int parentID)
	{
		this.forumID = forumID;
		this.forumName = forumName;
		this.parentID= parentID;
		this.topicList = new ArrayList<Topic>();
		this.subForumList = new ArrayList<Forum>();
	}
	
	public Topic newTopic(User by, String subject, String content)
	{
		Topic topic = new Topic(0, subject, this, by, content);
		this.refresh();
		return topic;
	}
	
	public int getTopicsCount()
	{
		return topicList.size();
	}
	
	public int getPostCount()
	{
		int count = 0;
		
		for(int i = 0; i<topicList.size(); i++)
		{
			count += topicList.get(i).getPostCount();
		}
		
		return count;
	}
	
}
