package org.example.homework04Database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String guestName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "guest_book",
    joinColumns = @JoinColumn(name = "guest_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName ="id" ))
    private List<Book> book;

}
