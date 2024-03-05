package nnpia_cv3.runners;

import nnpia_cv3.entities.AppUser;
import nnpia_cv3.entities.AppUserRole;
import nnpia_cv3.entities.Role;
import nnpia_cv3.entities.Task;
import nnpia_cv3.repository.AppUserRepository;
import nnpia_cv3.repository.AppUserRoleRepository;
import nnpia_cv3.repository.RoleRepository;
import nnpia_cv3.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DatabaseRunner implements CommandLineRunner {

    private final AppUserRepository appUserRepository;
    private final AppUserRoleRepository appUserRoleRepository;
    private final RoleRepository roleRepository;
    private final TaskRepository taskRepository;


    public DatabaseRunner(AppUserRepository appUserRepository, AppUserRoleRepository appUserRoleRepository, RoleRepository roleRepository, TaskRepository taskRepository) {
        this.appUserRepository = appUserRepository;
        this.appUserRoleRepository = appUserRoleRepository;
        this.roleRepository = roleRepository;
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        AppUser user1 = new AppUser();
        user1.setUsername("Lukas");
        user1.setPassword("heslo");
        user1.setActive(true);
        AppUser user2 = new AppUser();
        user2.setUsername("Eva");
        user2.setPassword("heslo");
        AppUser user3 = new AppUser();
        user3.setUsername("Matej");
        user3.setPassword("heslo");
        appUserRepository.save(user1);
        appUserRepository.save(user2);
        appUserRepository.save(user3);

        Task task1 = new Task();
        task1.setTitle("Uklid");
        task1.setAuthor(user1);
        Task task2 = new Task();
        task2.setTitle("odpocinek");
        task2.setAuthor(user1);
        Task task3 = new Task();
        task3.setTitle("straz");
        task3.setAuthor(user1);
        taskRepository.save(task1);
        taskRepository.save(task2);
        taskRepository.save(task3);

        Role role1 = new Role();
        role1.setName("udrzbar");
        Role role2 = new Role();
        role2.setName("policista");
        Role role3 = new Role();
        role3.setName("reditel");
        roleRepository.save(role1);
        roleRepository.save(role2);
        roleRepository.save(role3);

        AppUserRole appUserRole1 = new AppUserRole();
        appUserRole1.setAppUser(user1);
        appUserRole1.setRole(role1);
        AppUserRole appUserRole2 = new AppUserRole();
        appUserRole2.setAppUser(user2);
        appUserRole2.setRole(role2);
        AppUserRole appUserRole3 = new AppUserRole();
        appUserRole3.setAppUser(user3);
        appUserRole3.setRole(role3);
        appUserRoleRepository.save(appUserRole1);
        appUserRoleRepository.save(appUserRole2);
        appUserRoleRepository.save(appUserRole3);
    }
}

