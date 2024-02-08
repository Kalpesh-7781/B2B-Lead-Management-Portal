package com.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
	public User findByEmployeeId(String employeeId);

	//public void deleteByEmployeeId1(int employeeId);

}
