package rs.ac.bg.fon.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Candidate")
@PrimaryKeyJoinColumn(name="id")
public class Candidate extends User{

    @Column(name = "jmbg", nullable = false, length = 13)
    private String jmbg;

    @Column(name = "phone", nullable = false, length = 100)
    private String phone;

    @Column(name = "address", nullable = false, length = 100)
    private String address;


}