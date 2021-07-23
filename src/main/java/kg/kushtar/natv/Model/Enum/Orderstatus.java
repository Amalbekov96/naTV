package kg.kushtar.natv.Model.Enum;

public enum Orderstatus {

    NEW       (0),
    PROCESSED (1),
    ACCEPTED  (2);

    private final int levelCode;

    private Orderstatus(int levelCode) {
        this.levelCode = levelCode;
    }
}
