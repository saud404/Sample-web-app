package com.ironyeard.models;

import javax.persistence.*;

@Entity
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String platform;
    @Column(nullable = false)
    private String gener;
    @Column(nullable = false)
    private int releaseYear;
    @ManyToOne
    User user;
    public Game() {
    }

    public Game(String name, String platform, String gener, int releaseYear, User user) {

        this.name = name;
        this.platform = platform;
        this.gener = gener;
        this.releaseYear = releaseYear;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGener() {
        return gener;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
