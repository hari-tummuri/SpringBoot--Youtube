package com.example.youtube.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Channel {
    @Id
    @Autowired
    private long id ;
    @OneToOne(cascade =  CascadeType.ALL,mappedBy = "UserDetails")
    private User user;
    private String channel;
    private String logo;

}
