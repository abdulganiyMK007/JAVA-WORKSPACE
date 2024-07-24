package chapter15;

import java.util.Objects;

public class Task {
    
private int priority;
    private String description;

    public Task(int priority, String description) {
        priority = this.priority;
        description = this.description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Task[priority: "+ priority +", description: "+ description +"]";
    }

    public boolean equals(Task newTask) {
        return (priority == newTask.getPriority() && description.equals(newTask.getDescription()));
    }

    public int hashCode() {
        return Objects.hash(priority, description);
    }
    
}

