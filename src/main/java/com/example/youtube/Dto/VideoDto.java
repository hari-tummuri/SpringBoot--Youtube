package com.example.youtube.Dto;

import com.example.youtube.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VideoDto {
    private String title;
    private String videoUrl;
    private String thumbnail;
    private String description;
    private long likes;
    private String channel;
    private String logo;
}
