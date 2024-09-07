package com.example.tinder_aI_backend.conversations;

import com.example.tinder_aI_backend.profiles.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConversationRepository extends MongoRepository<Conversation, String> {
}
