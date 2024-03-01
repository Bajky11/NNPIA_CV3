package nnpia_cv3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String title;
    @Column
    private String text;
    @Column
    private String description;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime creation_date;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime update_date;
    @ManyToOne
    public AppUser authorId;
}
