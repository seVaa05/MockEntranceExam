package rs.ac.bg.fon.backend.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Administrator")
@PrimaryKeyJoinColumn(name="id")
public class Administrator extends User{
    @Column(name = "employee_num",nullable = false,unique = true)
    private Long employeeNum;
}
