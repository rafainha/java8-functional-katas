package katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;

import model.BoxArt;
import model.MovieList;
import util.DataUtil;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    @SuppressWarnings("rawtypes")
	public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        
        return  movieLists.stream()
				.map(MovieList::getVideos)
				.flatMap(List::stream)
						.map(movie -> ImmutableMap.of(
								"id",movie.getId(),
								"title",movie.getTitle(),
								"time",movie.getInterestingMoments()
										.stream()
										.filter(date -> "Middle".equals(date.getType()))
										.map(p -> p.getTime())
										.findFirst(),
								"boxart",movie.getBoxarts()
									.stream()
									.reduce((a,b) -> a.getWidth() < b.getWidth() ? a:b)
									.map(BoxArt::getUrl)
								)
							)
						
				.collect(Collectors.toList());

    }
}
