package com.restapi.application.restapiapplication.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.restapi.application.restapiapplication.entity.Coustmer;

@Repository
public interface CoustmerRepository extends JpaRepository<Coustmer, Integer> {

	
	Coustmer findByName(String Name);
	
	public List<Coustmer> coustmer = new ArrayList<Coustmer>();
	
	public default List<Coustmer> getAll(){
		return coustmer;
	}

	Coustmer save(Coustmer employee2);
	
}
