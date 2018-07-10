package com.io.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

// single ton
@Service
public class TopicService {

	
		private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
				new Topic(0, "Web Apps", "Web development"),
				new Topic(1, "Algorithms", "Algosss")
				));

	public TopicService() {
		
		}


	public List<Topic> getAllTopics(){
		return topics;
	}


	public Topic getTopic(int id) {
		return (Topic) topics.get(id);
	}


	public void addTopic(Topic topic) {
		topics.add(topic);	
	}
	
}
