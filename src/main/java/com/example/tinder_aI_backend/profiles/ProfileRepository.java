package com.example.tinder_aI_backend.profiles;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProfileRepository extends MongoRepository<Profile, String> {

}
