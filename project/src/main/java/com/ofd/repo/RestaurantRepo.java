package com.ofd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofd.entity.Restaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {

}
