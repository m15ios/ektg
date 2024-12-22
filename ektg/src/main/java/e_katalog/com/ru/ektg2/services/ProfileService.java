package e_katalog.com.ru.ektg2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import e_katalog.com.ru.ektg2.model.Profile;
import e_katalog.com.ru.ektg2.repositories.ProfileRepository;

@Service
public class ProfileService {
    private final profileRepository ProfileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public User getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public User createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
    
}
