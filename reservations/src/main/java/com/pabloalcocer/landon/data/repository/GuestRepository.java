package com.pabloalcocer.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pabloalcocer.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}