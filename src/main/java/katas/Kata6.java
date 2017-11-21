package katas;

import java.util.List;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
	public static String execute() {
		List<Movie> movies = DataUtil.getMovies();
		


		return movies.stream()
		.flatMap(movie -> movie.getBoxarts().stream())
		.reduce((box1,box2) -> (box1.getWidth()* box1.getHeight()) > (box2.getWidth()* box2.getHeight()) ? box1:box2)
		.map(BoxArt::getUrl)
		.orElse("");
		
	}
	
}