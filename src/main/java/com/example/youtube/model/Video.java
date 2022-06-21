package com.example.youtube.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Video {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String videoUrl;
    private String thumbnail;
    private String description;
    private String category;
    private String likes;
    private String time;
    @ManyToOne()
    @JoinColumn(name = "id",nullable = false)
    private Channel channel;
}
