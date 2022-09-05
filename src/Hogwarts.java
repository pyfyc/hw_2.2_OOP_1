public abstract class Hogwarts {
    private final String name;
    private final int magic;
    private final int teleport;
    protected int totalFacultyPoints;
    private static final int MIN_VALUE = 0;

    private static final int MAX_VALUE = 100;

    public Hogwarts(String name, int magic, int teleport) {
        validateIntField("Magic", magic);
        validateIntField("Teleport", teleport);
        this.name = name;
        this.magic = magic;
        this.teleport = teleport;
    }

    protected void validateIntField(String fieldName, int fieldValue) {
        if (fieldValue < MIN_VALUE || fieldValue > MAX_VALUE) {
            throw new IllegalArgumentException(fieldName + " is not valid");
        }
    }

    private static void compareStudentsProperty(String propName, Hogwarts student1, Hogwarts student2) {
        int propValue1;
        int propValue2;
        switch (propName) {
            case "magic":
                propValue1 = student1.getMagic();
                propValue2 = student2.getMagic();
                break;
            case "teleport":
                propValue1 = student1.getTeleport();
                propValue2 = student2.getTeleport();
                break;
            default:
                throw new RuntimeException("Unknown Hogwarts field: " + propName);
        }
        if (propValue1 > propValue2) {
            System.out.println(student1.getName() + "'s " + propName + " is better than " + student2.getName() + "'s");
        } else if (propValue2 > propValue1) {
            System.out.println(student2.getName() + "'s " + propName + " is better than " + student1.getName() + "'s");
        } else {
            System.out.println("Both students " + propName + " is the same");
        }
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1 != null && student2 != null) {
            compareStudentsProperty("magic", student1, student2);
            compareStudentsProperty("teleport", student1, student2);
        }
    }

    protected static void compareTotalPoints(Hogwarts student1, Hogwarts student2) {
        if (student1.getTotalFacultyPoints() > student2.getTotalFacultyPoints()) {
            System.out.println(student1.getName() + " (" + student1.getTotalFacultyPoints() + ")" + " is better " + student1.getClass().getName() + " than " + student2.getName() + " (" + student2.getTotalFacultyPoints() + ")");
        } else if (student2.getTotalFacultyPoints() > student1.getTotalFacultyPoints()) {
            System.out.println(student2.getName() + " (" + student2.getTotalFacultyPoints() + ")" + " is better " + student1.getClass().getName() + " than " + student1.getName() + " (" + student1.getTotalFacultyPoints() + ")");
        } else {
            System.out.println("Both " + student1.getClass().getName() + " students have the same strength - " + student1.getTotalFacultyPoints());
        }
    }

    protected abstract void printStudent();

    protected String getName() {
        return name;
    }

    protected int getMagic() {
        return magic;
    }

    protected int getTeleport() {
        return teleport;
    }

    protected int getTotalFacultyPoints() {
        return totalFacultyPoints;
    }

    protected void setTotalFacultyPoints(int totalFacultyPoints) {
        this.totalFacultyPoints = totalFacultyPoints;
    }
}
