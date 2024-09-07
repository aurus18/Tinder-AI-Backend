package com.example.tinder_aI_backend;

import com.example.tinder_aI_backend.profiles.Gender;
import com.example.tinder_aI_backend.profiles.Profile;
import com.example.tinder_aI_backend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TinderAIBackendApplication implements CommandLineRunner {

	@Autowired
	private ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(TinderAIBackendApplication.class, args);
	}

	public void run(String... args){
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
		profileRepository.findAll().forEach(System.out::println);
	}
}
