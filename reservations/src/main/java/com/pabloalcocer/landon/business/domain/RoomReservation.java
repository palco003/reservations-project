package com.pabloalcocer.landon.business.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by pabloalcocer on 5/4/17.
 */
@Data
public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;
}
