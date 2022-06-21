package com.example.youtube.Dto;

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
    private String category;
    private String likes;
    private String time;
}
