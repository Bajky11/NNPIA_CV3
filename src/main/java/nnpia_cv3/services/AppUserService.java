package nnpia_cv3.services;

import nnpia_cv3.entities.AppUser;

import java.util.Optional;

public interface AppUserService {

    Optional<AppUser> getUserById(Long id);
}
