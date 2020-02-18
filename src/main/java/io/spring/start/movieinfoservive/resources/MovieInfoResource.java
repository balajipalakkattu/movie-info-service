package io.spring.start.movieinfoservive.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.spring.start.movieinfoservive.models.MovieInfo;

@RestController
@RequestMapping("/movie")
public class MovieInfoResource {
	@RequestMapping("/{movieId}")
	public List<MovieInfo>getMovieInfoResource(@PathVariable("movieId")String movieId){
		
		return Collections.singletonList(new MovieInfo("Transformers", "trans"));
	}

}
