package com.example.tinder_aI_backend;

import com.example.tinder_aI_backend.conversations.ChatMessage;
import com.example.tinder_aI_backend.conversations.Conversation;
import com.example.tinder_aI_backend.conversations.ConversationRepository;
import com.example.tinder_aI_backend.profiles.Gender;
import com.example.tinder_aI_backend.profiles.Profile;
import com.example.tinder_aI_backend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class TinderAIBackendApplication implements CommandLineRunner {

	@Autowired
	private ProfileRepository profileRepository;

	@Autowired
	private ConversationRepository conversationRepository;

	public static void main(String[] args) {
		SpringApplication.run(TinderAIBackendApplication.class, args);
	}

	public void run(String... args){

		profileRepository.deleteAll();
		conversationRepository.deleteAll();

		Profile profile = new Profile(
				"1",
				"Rishav",
				"Pramanik",
				40,
				"Indian",
				Gender.MAlE,
				"Software programmer",
				"foo.jpg",
				"INTP"
		);
		profileRepository.save(profile);

		profile = new Profile(
				"2",
				"Foo",
				"Bar",
				40,
				"Indian",
				Gender.MAlE,
				"Software programmer",
				"foo.jpg",
				"INTP"
		);
		profileRepository.findAll().forEach(System.out::println);

		Conversation conversation = new Conversation(
				"1",
				profile.id(),
				List.of(
						new ChatMessage("Hello", profile.id(), LocalDateTime.now())
				)
		);

		conversationRepository.save(conversation);
		conversationRepository.findAll().forEach(System.out::println);
	}
}
