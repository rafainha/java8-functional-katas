package katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;

import model.BoxArt;
import model.MovieList;
import util.DataUtil;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    @SuppressWarnings("rawtypes")
	public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        
        
        return movieLists.stream()
				.map(MovieList::getVideos)
				.flatMap(List::stream)
				.map(movie -> ImmutableMap.of(
								"id",movie.getId(),
								"title",movie.getTitle(),
								"boxart",movie.getBoxarts()
									.stream()
									.reduce((box1,box2) -> box1.getWidth() * box1.getHeight() < box2.getWidth() * box2.getHeight() ? box1:box2)
									.map(BoxArt::getUrl)
								)
							)
						
				.collect(Collectors.toList());
    }

}
