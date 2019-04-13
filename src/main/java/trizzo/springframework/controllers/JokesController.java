package trizzo.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import trizzo.springframework.services.JokeService;

@Controller
public class JokesController {
	
	private JokeService jokeService; 
	
	public JokesController(JokeService jokeService)
	{
		this.jokeService = jokeService; 
	}
	
	@RequestMapping("/")
	private String requestJoke(Model model)
	{
		model.addAttribute("jokes", jokeService.getJokes()); 
		
		return "jokes";
	}
}
