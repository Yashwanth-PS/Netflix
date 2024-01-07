package com.netflix.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actorId;

    private String name;

    @ManyToMany
    private List<Video> videos;
}