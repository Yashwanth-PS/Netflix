package com.netflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoId;

    private String title;
    private String description;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<ProfileWatchList> profileWatchList;

    @ManyToMany
    private List<Actor> actor;
}