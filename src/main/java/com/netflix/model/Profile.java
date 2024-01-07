package com.netflix.model;

import com.netflix.model.constants.ProfileType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<ProfileWatchList> profileWatchList;

    private String name;

    @Enumerated(EnumType.STRING)
    private ProfileType profileType;
}