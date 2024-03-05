package nnpia_cv3.controllers;

import lombok.RequiredArgsConstructor;
import nnpia_cv3.entities.AppUser;
import nnpia_cv3.repository.AppUserRepository;
import nnpia_cv3.services.AppUserService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService appUserService;

    public static final String APP_USER_PATH = "/app-user/v1";



    @GetMapping(value = APP_USER_PATH + "/{id}")
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public Optional<AppUser> getUserById(@PathVariable Long id) {
        Optional<AppUser> user = appUserService.getUserById(id);

        return Optional.of(user).orElseThrow(null);
    }

//    @DeleteMapping(APP_USER_PATH + "/{id}")
//    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
//        if (!appUserRepository.existsById(id)) {
//            return ResponseEntity.notFound().build();
//        }
//
//        appUserRepository.deleteById(id);
//
//        return ResponseEntity.ok("User with ID " + id + " deleted successfully");
//    }
//
//    @PutMapping(APP_USER_PATH)
//    public ResponseEntity<String> updateUserById(@PathVariable Long id) {
//        AppUser newAppUser = new AppUser();
//        appUserRepository.save(newAppUser);
//        return ResponseEntity.ok("User with id: " + newAppUser.getId() + " created.");
//    }
}
