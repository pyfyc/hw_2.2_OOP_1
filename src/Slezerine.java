public class Slezerine extends Hogwarts{
    private final int tricky; // хитрость
    private final int resoluteness; // решительность
    private final int ambition; // амбициозность
    private final int resourcefulness; // находчивость
    private final int hungerForPower; // жажда власти

    public Slezerine(String name, int magic, int teleport, int tricky, int resoluteness, int ambition, int resourcefulness, int hungerForPower) {
        super(name, magic, teleport);
        validateIntField("Tricky", tricky);
        validateIntField("Resoluteness", resoluteness);
        validateIntField("Ambition", ambition);
        validateIntField("Resourcefulness", resourcefulness);
        validateIntField("HungerForPower", hungerForPower);
        this.tricky = tricky;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.hungerForPower = hungerForPower;
    }

    public static void compareFacultyStudents(Slezerine student1, Slezerine student2) {
        if (student1 != null && student2 != null) {
            int total1 = student1.tricky + student1.resoluteness + student1.ambition + student1.resourcefulness + student1.hungerForPower;
            int total2 = student2.tricky + student2.resoluteness + student2.ambition + student2.resourcefulness + student2.hungerForPower;
            compareTotalPoints("Slezerinian", student1.getName(), total1, student2.getName(), total2);
        }
    }

    public int getTricky() {
        return tricky;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getHungerForPower() {
        return hungerForPower;
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
                ", tricky = " + tricky +
                ", resoluteness = " + resoluteness +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", hungerForPower = " + hungerForPower;
    }
}
