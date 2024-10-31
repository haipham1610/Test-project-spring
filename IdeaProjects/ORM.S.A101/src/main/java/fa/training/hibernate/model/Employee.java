package fa.training.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(length = 50, name = "First_Name", nullable = false)
    private String firstName;
    @Column(length = 50, name = "Last_Name", nullable = false)
    private String lastName;

    private String phone;
}
