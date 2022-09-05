public class Puffenduy extends Hogwarts {
    private final int hardwork; // трудолюбие
    private final int loyalty; // верность
    private final int honesty; // честность

    public Puffenduy(String name, int magic, int teleport, int hardWork, int loyalty, int honesty) {
        super(name, magic, teleport);
        validateIntField("Hardword", hardWork);
        validateIntField("Loyalty", loyalty);
        validateIntField("Honesty", honesty);
        this.hardwork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.setFacultyName("Puffenduy");
    }

    public static void compareFacultyStudents(Puffenduy student1, Puffenduy student2) {
        if (student1 != null && student2 != null) {
            student1.setTotalFacultyPoints(student1.hardwork + student1.loyalty + student1.honesty);
            student2.setTotalFacultyPoints(student2.hardwork + student2.loyalty + student2.honesty);
            compareTotalPoints(student1, student2);
        }
    }

    public int getHardwork() {
        return hardwork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public void printStudent() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return getName() +
                ", magic = " + getMagic() +
                ", teleport = " + getTeleport() +
                ", hardwork = " + hardwork +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty;
    }
}
