package com.example.demo.repos;

import com.example.demo.domain.UserEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
public interface UserRepo extends CrudRepository<UserEntity,Long> {

}
