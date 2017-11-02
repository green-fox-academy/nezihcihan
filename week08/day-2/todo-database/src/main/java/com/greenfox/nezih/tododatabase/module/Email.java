package com.greenfox.nezih.tododatabase.module;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "emails")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String email;

//    @ManyToMany(mappedBy = "emails")
//    private Set<Assignee> assignees;



    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Set<Assignee> getAssignees() {
//        return assignees;
//    }
//
//    public void setAssignees(Set<Assignee> assignees) {
//        this.assignees = assignees;
//    }
}
