package com.example.youtube.service;

import com.example.youtube.Dto.VideoDto;
import com.example.youtube.model.Video;
import com.example.youtube.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public void create(VideoDto videoDto) {
        Video video=new Video();
        video.setTitle(videoDto.getTitle());
        video.setVideoUrl(videoDto.getVideoUrl());
        video.setDescription(videoDto.getDescription());
        video.setThumbnail(videoDto.getThumbnail());
        video.setCategory(videoDto.getCategory());
        video.setLikes(videoDto.getLikes());
        video.setTime(videoDto.getTime());
        videoRepository.save(video);
    }

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }
}
