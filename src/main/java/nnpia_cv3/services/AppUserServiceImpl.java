package nnpia_cv3.services;

import lombok.AllArgsConstructor;
import nnpia_cv3.entities.AppUser;
import nnpia_cv3.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository appUserRepository;


    @Override
    public Optional<AppUser> getUserById(Long id) {
        return appUserRepository.findById(id);
    }
}
