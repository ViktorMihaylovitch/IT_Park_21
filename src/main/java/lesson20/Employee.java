package lesson20;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement(name = "Employee")
@XmlType(propOrder = {"personalNumber", "login", "name", "department", "position"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Employee {
    @XmlElement(name = "PersonalNumber")
    private int personalNumber;
    @XmlElement(name = "Login")
    private String login;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Department")
    private Department department;
    @XmlElement(name = "Position")
    private Position position;
}
