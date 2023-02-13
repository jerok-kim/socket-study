package homework.hw01_김형준1;

public class User {
    String name;
    Position position;

    User(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        String parser = this.name + "(" + this.position.toString() + ")";
        return parser;
    }
}

enum Position {
    CENTER("C"),
    POWER_FORWARD("PF"),
    SMALL_FORWARD("SF"),
    SHOOTING_GUARD("SG"),
    POINT_GUARD("PG");

    private final String getPositionName;

    Position(String position) {
        getPositionName = position;
    }

    @Override
    public String toString() {
        return getPositionName;
    }

}