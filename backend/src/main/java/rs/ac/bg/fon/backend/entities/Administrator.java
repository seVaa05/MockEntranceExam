package rs.ac.bg.fon.backend.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Administrator")
@PrimaryKeyJoinColumn(name="id")
public class Administrator extends User{
    @Column(name = "employee_num",nullable = false,unique = true)
    private Long employeeNum;

    public Administrator() {

    }

    public Administrator(Long id, String firstName, String lastName, String email,
                         String password, boolean active, Long employeeNum) {
        super(id, firstName, lastName, email, password, active);
        this.employeeNum = employeeNum;
    }

}
