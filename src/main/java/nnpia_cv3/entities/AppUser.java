package nnpia_cv3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Další hodnoty, kterých může directivum spring.jpa.hibernate.ddl-auto nabývat:
 * - create: Hibernate bude při startu aplikace vytvářet schéma databáze na základě
 *   definice entit v entitních třídách. Pokud už existuje tabulka se stejným názvem,
 *   bude odstraněna a vytvořena nová. Data v existujících tabulkách budou ztracena.
 * - update: Hibernate bude aktualizovat schéma databáze podle definice entit. Existující
 *   tabulky zůstanou nedotčeny, ale mohou být změněny sloupce nebo přidány nové podle
 *   změn v entitních třídách.
 * - validate: Hibernate pouze ověří, zda se schéma databáze shoduje s definicí entit.
 *   Pokud ne, vyvolá výjimku.
 * - none: Hibernate nebude provádět žádné akce ohledně schématu databáze. Je očekáváno,
 *   že schéma bude spravováno ručně nebo jiným způsobem.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "appuser")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private boolean active;
    @Column
    private Date creation_date;
    @Column
    private Date updateDate;
    @OneToMany(mappedBy = "authorId")
    public List<Task> tasks;
    @OneToMany(mappedBy = "appUser")
    public List<AppUserRole> appUserRoles;


}
