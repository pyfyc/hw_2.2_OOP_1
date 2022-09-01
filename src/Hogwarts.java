public class Hogwarts {
    private final String name;
    private final int magic;
    private final int teleport;
    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 100;

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

    private static void compareStudentsProperty(String propName, String studentName1, int studentProp1, String studentName2, int studentProp2) {
        if (studentProp1 > studentProp2) {
            System.out.println(studentName1 + "'s " + propName + " is better than " + studentName2 + "'s");
        } else if (studentProp2 > studentProp1) {
            System.out.println(studentName2 + "'s " + propName + " is better than " + studentName1 + "'s");
        } else {
            System.out.println("Both students " + propName + " is the same");
        }
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1 != null && student2 != null) {
            compareStudentsProperty("magic", student1.getName(), student1.getMagic(), student2.getName(), student2.getMagic());
            compareStudentsProperty("teleport", student1.getName(), student1.getTeleport(), student2.getName(), student2.getTeleport());
        }
    }

    protected static void compareTotalPoints(String facultyName, String studentName1, int total1, String studentName2, int total2) {
        if (total1 > total2) {
            System.out.println(studentName1 + " (" + total1 + ")" + " is better " + facultyName + " than " + studentName2 + " (" + total2 + ")");
        } else if (total2 > total1) {
            System.out.println(studentName2 + " (" + total2 + ")" + " is better " + facultyName + " than " + studentName1 + " (" + total1 + ")");
        } else {
            System.out.println("Both " + facultyName + " students have the same strength - " + total1);
        }
    }

    protected void printStudent() {
        // To Override in subclasses.
    }

    protected String getName() {
        return name;
    }

    protected int getMagic() {
        return magic;
    }

    protected int getTeleport() {
        return teleport;
    }
}
