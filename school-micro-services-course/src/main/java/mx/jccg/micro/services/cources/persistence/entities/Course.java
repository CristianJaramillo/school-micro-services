package mx.jccg.micro.services.cources.persistence.entities;

import mx.jccg.school.micro.services.core.persistence.entities.Model;

import javax.persistence.*;

/**
 *
 * @author Cristian Jaramillo (cristian_gerar@hotmail.com)
 */
@Entity
@Table(name = "courses")
public class Course<Long> extends Model
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "key", unique = true, nullable = false)
    private String key;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "credits", nullable = false)
    private String credits;
    @Column(name = "theory_time", nullable = false)
    private Long theoryTime;
    @Column(name = "practice_time", nullable = false)
    private Long practiceTime;

    /**
     *
     */
    public Course()
    {
        super();
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public Long getTheoryTime() {
        return theoryTime;
    }

    public void setTheoryTime(Long theoryTime) {
        this.theoryTime = theoryTime;
    }

    public Long getPracticeTime() {
        return practiceTime;
    }

    public void setPracticeTime(Long practiceTime) {
        this.practiceTime = practiceTime;
    }

}
