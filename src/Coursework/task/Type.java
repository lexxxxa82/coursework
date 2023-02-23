package Coursework.task;

public enum Type {
    WORK("Work"),
    PERSONAL("Personal");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
