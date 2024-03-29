package com.netflix.model;

import com.netflix.model.constants.VideoStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Entity
@Getter
@Setter
public class ProfileWatchList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileWatchListId;

    @ManyToOne
    @JoinColumn(name = "profileId")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "videoId")
    private Video video;

    @Enumerated(EnumType.STRING)
    private VideoStatus status;

    private Time timeStamp;
}