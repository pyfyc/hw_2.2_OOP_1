public class Griffindor extends Hogwarts {
    private final int nobility; // благородство
    private final int honor; // честь
    private final int bravery; // храбрость

    public Griffindor(String name, int magic, int teleport, int nobility, int honor, int bravery) {
        super(name, magic, teleport);
        validateIntField("Nobility", nobility);
        validateIntField("Honor", honor);
        validateIntField("Bravery", bravery);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void compareFacultyStudents(Griffindor student1, Griffindor student2) {
        if (student1 != null && student2 != null) {
            int total1 = student1.nobility + student1.honor + student1.bravery;
            int total2 = student2.nobility + student2.honor + student2.bravery;
            compareTotalPoints("Griffindorian", student1.getName(), total1, student2.getName(), total2);
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
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
                ", nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery;
    }
}
