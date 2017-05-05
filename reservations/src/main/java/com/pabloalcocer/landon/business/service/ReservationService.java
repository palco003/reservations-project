package com.pabloalcocer.landon.business.service;

import com.pabloalcocer.landon.data.repository.GuestRepository;
import com.pabloalcocer.landon.data.repository.ReservationRepository;
import com.pabloalcocer.landon.data.repository.RoomRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pabloalcocer on 5/4/17.
 */
@Service
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ReservationService {
    private RoomRepository roomRepository;
    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;
}
