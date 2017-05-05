package com.pabloalcocer.landon.data.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pabloalcocer on 5/4/17.
 */

@Entity
@Table(name="ROOM")
@Data
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String number;
    @Column(name="BED_INFO")
    private String bedInfo;
}
