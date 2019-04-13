package trizzo.springframework.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeService {
	
	
	public String getJokes()
	{
		ChuckNorrisQuotes quotes = new ChuckNorrisQuotes(); 
		return quotes.getRandomQuote(); 
	}

}
