package com.shelly.coupons.dao;

import com.shelly.coupons.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserDao extends CrudRepository<UserEntity, Long> {
	public List<UserEntity> findByName(String name);
	public List<UserEntity> findByNameAndAge(String name, int age);
	@Query("SELECT u FROM UserEntity u WHERE u.name= :userName and u.age=:age")
	public List<UserEntity> getByData(@Param("userName") String name, @Param("age") int age);
	

}
