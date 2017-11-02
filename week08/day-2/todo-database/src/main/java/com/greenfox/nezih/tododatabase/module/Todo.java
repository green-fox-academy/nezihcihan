package com.greenfox.nezih.tododatabase.module;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "assignee_id")
//    private Assignee assignee;

    public String title;
    public boolean isUrgent; // default False
    public boolean isDone; // default False

    public Todo() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isUrgent=" + isUrgent +
                ", isDone=" + isDone +
                '}';
    }
}
