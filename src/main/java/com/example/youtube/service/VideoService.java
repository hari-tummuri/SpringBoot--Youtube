package com.example.youtube.service;

import com.example.youtube.Dto.VideoDto;
import com.example.youtube.model.Video;
import com.example.youtube.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        video.setLikes(videoDto.getLikes());
        video.setTime(this.date());
        video.setChannel(videoDto.getChannel());
        video.setLogo(videoDto.getLogo());
        System.out.println(video.toString());
        videoRepository.save(video);
    }

    private String date() {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        return date.toString();

    }

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Video getVideoById(long id) {
        System.out.println(videoRepository.findById(id).get());
        return videoRepository.findById(id).get();
    }

    public List<Video> getRemainingVideos(long id){
        return videoRepository.findAll().stream().filter(video -> video.getId() != id).toList();
    }

    public List<Video> getMatchedVideos(String search) {
        return videoRepository.findAll().stream().filter(video -> video.getTitle().contains(search)).toList();
    }

    public Video updateVideo(Video video) {
        return videoRepository.save(video);
    }

    public List<Video> getMyVideos(String channel) {
        return videoRepository.findByChannel(channel);
    }

    public void deleteVideo(long id) {
        videoRepository.deleteById(id);
    }
}
