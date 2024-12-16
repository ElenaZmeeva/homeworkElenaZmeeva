package org.example.homework04Database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "guest_book",
    joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "guest_id", referencedColumnName = "id"))
    private Set<Guest> guestSet;

}
