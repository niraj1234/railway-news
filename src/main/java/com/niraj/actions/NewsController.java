package com.niraj.actions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

	@GetMapping("/")
	public String welcome() {
		return "Railway Application | News Controller";
	}
	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<News>> getAllNews(){
		ArrayList<News>  newsList = new ArrayList<News>();

		News n1 = new News(1, "Simaria Pul new construction", "general", "One rail and Road bridge is going to be constructed newr Mokama on the river of Ganga");
		News n2 = new News(2, "NItish Kumar on Rajgir Wild Safari", "social", "Newly developed wild life safari in Rajgir is now open for public visit. Many animals like Lion, Black Buck, Cheetah are visible by very close distance");
		News n3 = new News(3, "Russia attacks on Ukrain", "political", "Pussian president Putin has ordered a full scale invasion to neighbour country Ukrain. EU has condemned the move by Kremlin.");
		News n4 = new News(4, "News Heading Political", "political", "News Brief 4 for better reading");
		News n5 = new News(5, "News Heading Sport", "sports", "News Brief 5 for Sports news");
		News n6 = new News(6, "News Heading Entertainment", "entertainment", "News Brief 6 Movie information will be covered here");
		News n7 = new News(7, "News Heading General", "general", "General Event cover in Patna");
		News n8 = new News(8, "News about Village", "village", "Many local news about village day to day life");
		News n9 = new News(9, "International News", "international", "News update for Russia and Ucrain conflict");
		
		newsList.add(n1);		
		newsList.add(n2);		
		newsList.add(n3);
		newsList.add(n4);
		newsList.add(n5);
		newsList.add(n6);
		newsList.add(n7);
		newsList.add(n8);
		newsList.add(n9);
		
		
        return new ResponseEntity<List<News>>(newsList , HttpStatus.OK);
	}

	
	@GetMapping("/site/{t}")
	public String newsType(@PathVariable("t") String type) {
		System.out.println("News Type in Request ==> " + type);
		return "News Type "+ type;
	}

	
	
}
