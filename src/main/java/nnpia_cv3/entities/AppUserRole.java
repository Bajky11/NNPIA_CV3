package nnpia_cv3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "appuserrole")
public class AppUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "appUsers")
    public AppUser appUser;
    @ManyToOne
    @JoinColumn(name = "roles")
    public Role role;

}
