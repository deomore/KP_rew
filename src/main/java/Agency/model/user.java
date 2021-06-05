package Agency.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user")
@Getter
@Setter
public class user {
    @Id
    private int userId;
    @Column (name = "name")
    private  String name;
    @Column (name = "Surname")
    private  String surname;
    @Column (name = "age")
    private int age;


}
