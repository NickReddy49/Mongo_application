package com.test.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.mongodb.model.Incoming;

public interface mongorepo extends MongoRepository<Incoming,String> 
{
 
}
