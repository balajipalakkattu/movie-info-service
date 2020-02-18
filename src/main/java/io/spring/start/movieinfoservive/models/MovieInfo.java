package io.spring.start.movieinfoservive.models;

public class MovieInfo {

	private String name;
	private String movieId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public MovieInfo(String name, String movieId) {
		super();
		this.name = name;
		this.movieId = movieId;
	}

}
