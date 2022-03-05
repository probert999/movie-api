package com.ssp.movie.api.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    @Id
    private String movieId;
    private String movieType;
    private String movieName;
    private int releaseYear;
    private int runningTime;
    private String movieGenre;
    private double averageRating;
    private int numberOfVotes;

    public String toEmailContent() {
        return MessageFormat.format("<b>{0}</b><br>Released: {1}<br>Running Time: {2}<br>Genre: {3}" +
                        "<br>Rating: {4} from {5} votes" +
                        "<br>More Details: https://www.imdb.com/title/{6}<br>"
                        ,movieName,Integer.toString(releaseYear),runningTime,movieGenre
                        ,averageRating,numberOfVotes,movieId);
    }
}

