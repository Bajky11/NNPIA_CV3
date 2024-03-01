package nnpia_cv3.repository;

import nnpia_cv3.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    @Query(value = "SELECT username FROM appuser u WHERE u.active = true", nativeQuery = true)
    List<String> findAllUsernames();

    @Query("SELECT user FROM appuser user JOIN user.appUserRoles aur JOIN aur.role r WHERE r.name = :nameOfRole")
    List<AppUser> findAllByRole(@Param("nameOfRole") String name);
}
