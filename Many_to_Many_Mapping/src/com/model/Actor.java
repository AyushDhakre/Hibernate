package com.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hib_actor")
public class Actor {
    
	@Id
    @Column(name="actor_id")
    private int actorId;
    @Column(name = "actor_name", length = 50, nullable = false)
    private String actorName;
    
    @ManyToMany
    @JoinTable(
        name = "hib_actor_movie", 
        joinColumns = @JoinColumn(name = "actor_name"), 
        inverseJoinColumns = @JoinColumn(name = "movie_id")
    )
    private Set<Movie> movies;

    // Constructors
    public Actor() {}
    
    public Actor(String actorName, Set<Movie> movies, int actorId) {
        this.actorName = actorName;
        this.movies = movies;
        this.actorId=actorId;
    }

    // Getters and Setters
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
    
    
    public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", movies=" + movies + "]";
	}

	
}