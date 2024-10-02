package lld.diagram.tictactooAssignment.Elevator;


import java.sql.Time;
import java.util.*;

public class Schedule {
    private Date date;
    private Elevator elevator;
    private String problem;

    public Schedule() {
        this.date = new Date(); // Or set via constructor
    }

    public Date getDate() {
        return date;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
