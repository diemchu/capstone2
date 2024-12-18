package com.capstone2.nanum.database;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "joinRooms")
@Data
public class JoinRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long roomId;
    private Long roomManagerId;
    private String roomName;
    private  Long userId;

}
