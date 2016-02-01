package prv.zielony.trafficmaster.course.tracker.model;

import javax.persistence.*;

/**
 * Created by zielony on 22.01.16.
 */
@Entity
@Table(name = "PERSONAL_DATA")
public class PersonalData {
    @Id
    private Long id;

    @Version
    private Long version;

    private String name;

    private String surname;

    private int age;

    @Enumerated(EnumType.STRING)
    private Sex sex;
}
