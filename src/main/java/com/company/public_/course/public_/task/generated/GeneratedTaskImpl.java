package com.company.public_.course.public_.task.generated;

import com.company.public_.course.public_.task.Task;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.public_.course.public_.task.Task}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedTaskImpl implements Task {
    
    private int id;
    private String info;
    private String answer;
    
    protected GeneratedTaskImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getInfo() {
        return info;
    }
    
    @Override
    public String getAnswer() {
        return answer;
    }
    
    @Override
    public Task setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Task setInfo(String info) {
        this.info = info;
        return this;
    }
    
    @Override
    public Task setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "     + Objects.toString(getId()));
        sj.add("info = "   + Objects.toString(getInfo()));
        sj.add("answer = " + Objects.toString(getAnswer()));
        return "TaskImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Task)) { return false; }
        final Task thatTask = (Task)that;
        if (this.getId() != thatTask.getId()) { return false; }
        if (!Objects.equals(this.getInfo(), thatTask.getInfo())) { return false; }
        if (!Objects.equals(this.getAnswer(), thatTask.getAnswer())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getInfo());
        hash = 31 * hash + Objects.hashCode(getAnswer());
        return hash;
    }
}