package com.io.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

// single ton instance of the class is created
@Service
public class TopicService {

	
		private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
				new Topic("One", "Web Apps", "Web development"),
				new Topic("Two", "Algorithms", "Algosss")
				));

	public TopicService() {
		
		}


	public List<Topic> getAllTopics(){
		return topics;
	}


	public Topic getTopic(String id) {
		int i = Integer.parseInt(id);
		return topics.get(i);
	}


	public void addTopic(Topic topic) {
		topics.add(topic);	
	}
	
	public void updateTopic(String id, Topic topic) {
		for(int i=0; i< topics.size(); i++){
			Topic t = topics.get(i);

			if(t.getId().equals(id)){
				topics.set(i, topic);
				return ;
			}
			
		}
	}
	
}
