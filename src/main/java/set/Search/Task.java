package main.java.set.Search;

public class Task {
    private String description;
    private boolean isDone = false;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "{" +
                "description='" + description + '\'' +
                ", isDone=" + (isDone ? "yes" : "no") +
                "}\n";
    }
}
