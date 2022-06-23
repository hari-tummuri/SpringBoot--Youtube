package com.example.youtube.repository;

import com.example.youtube.model.User;
import com.example.youtube.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video,Long> {

    public List<Video> findByChannel(String channel);
    @Modifying
    @Query("update Video u set u.likes = ?1 where u.id=?2")
    void updateVideoLikes(long likes,long id);


}
