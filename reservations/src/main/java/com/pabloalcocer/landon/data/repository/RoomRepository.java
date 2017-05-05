package com.pabloalcocer.landon.data.repository;

import com.pabloalcocer.landon.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pabloalcocer on 5/4/17.
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    Room findByNumber(String number);
}
