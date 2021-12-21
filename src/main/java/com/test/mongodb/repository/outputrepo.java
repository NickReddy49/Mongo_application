package com.test.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.mongodb.model.Outgoing;
public interface outputrepo extends MongoRepository<Outgoing,Integer>
{

}
