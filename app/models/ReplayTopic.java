package models;

import java.util.List;

public class ReplayTopic extends Topic{
	public List<String> replayFiles;
	
	public ReplayTopic(int topicID, String subjectLine, Forum thisForum, List<String> replayFiles)
	{
		super(topicID, subjectLine, thisForum);
		this.replayFiles = replayFiles;
	}
	
}
