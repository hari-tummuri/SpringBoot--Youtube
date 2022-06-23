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
    private long likes;
    private String time;
    private String channel;
    private String logo;

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", description='" + description + '\'' +
                ", likes=" + likes +
                ", time='" + time + '\'' +
                ", channel='" + channel + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
