//package com.greenfox.nezih.tododatabase.module;
//
//import org.springframework.data.annotation.Id;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "assignees")
//public class Assignee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public long id;
//
//    private String name;
//
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name= "assignees_emails")
//    private Set<Email> emails;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public Set<Email> getEmails() {
//        return emails;
//    }
//
//    public void setEmails(Set<Email> emails) {
//        this.emails = emails;
//    }
//
//    public Assignee(String name, String email) {
//        this.name = name;
//
//    }
//
//    public Assignee() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//}
