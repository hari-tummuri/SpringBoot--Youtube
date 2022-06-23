package com.example.youtube.controller;

import com.example.youtube.Dto.VideoDto;
import com.example.youtube.model.Video;
import com.example.youtube.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("api/video/")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping("/create")
    public ResponseEntity createVideo(@RequestBody VideoDto videoDto){
        videoService.create(videoDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public List<Video> getAllVideos(){
        return videoService.getAllVideos();
    }

    @GetMapping("/get/{id}")
    public Video getVideoById(@PathVariable long id){
        return videoService.getVideoById(id);
    }

    @GetMapping("/getRemain/{id}")
    public List<Video> getRemainingVideos(@PathVariable long id){
        return videoService.getRemainingVideos(id);
    }
    @GetMapping("/getSearch/{searchString}")
    public List<Video> getMatchedVideos(@PathVariable String searchString){
        return videoService.getMatchedVideos(searchString);
    }
    @GetMapping("myVideos/{channel}")
    public List<Video> getMyVideos(@PathVariable String channel){
        return videoService.getMyVideos(channel);
    }
    @PutMapping("/updateVideo")
    public Video updateVideo(@RequestBody Video video){
       return videoService.updateVideo(video);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVideo(@PathVariable long id){
        videoService.deleteVideo(id);
    }
}
