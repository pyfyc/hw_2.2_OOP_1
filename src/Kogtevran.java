public class Kogtevran extends Hogwarts{
    private final int smart; // ум
    private final int wisdom; // мудрость
    private final int wit; // остроумие
    private final int creative; // творческий

    public Kogtevran(String name, int magic, int teleport, int smart, int wisdom, int wit, int creative) {
        super(name, magic, teleport);
        validateIntField("Smart", smart);
        validateIntField("Wisdom", wisdom);
        validateIntField("Wit", wit);
        validateIntField("Creative", creative);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public static void compareFacultyStudents(Kogtevran student1, Kogtevran student2) {
        if (student1 != null && student2 != null) {
            student1.setTotalFacultyPoints(student1.smart + student1.wisdom + student1.wit + student1.creative);
            student2.setTotalFacultyPoints(student2.smart + student2.wisdom + student2.wit + student2.creative);
            compareTotalPoints(student1, student2);
        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreative() {
        return creative;
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
                ", smart = " + smart +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creative = " + creative;
    }
}
