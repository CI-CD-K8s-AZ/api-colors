package cl.metalcloud.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colors")
public class NamesController {

	private static ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue","Red","Yellow", "Orange", "Green"));
	
	@GetMapping("/")
	public ArrayList<String> getAll() {
		return colors;
	}
	
	private int getRandomNumber(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	
	@GetMapping("/random")
	public String getRandom() {
	    int index = getRandomNumber(1, colors.size()) - 1;
	    if(index < 0) index = 0;
	    if(index > colors.size()) index = colors.size()-1;
		return colors.get(index);
	}
}
