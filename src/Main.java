public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Garry Potter", 50, 60, 70, 80, 90);
        Griffindor hermionaGrainger = new Griffindor("Hermiona Grainger", 10, 20, 70, 80, 100);
        Griffindor ronWizly = new Griffindor("Ron Wizly", 95, 100, 43, 56, 77);

        Slezerine drakoMalfoy = new Slezerine("Drako Malfoy", 15, 20, 30, 40, 42, 53, 35);
        Slezerine grahemMontegue = new Slezerine("Grahem Montegue", 55, 35, 45, 55, 50, 60, 10);
        Slezerine gregoryGoyl = new Slezerine("Gregory Goyl", 70, 65, 40, 25, 88, 90, 95);

        Puffenduy zakhariaSmith = new Puffenduy("Zakharia Smith", 61, 34, 30, 20, 70);
        Puffenduy sedrickDiggoree = new Puffenduy("Sedrick Diggoree", 15, 40, 5, 45, 10);
        Puffenduy justinFinchFletchly = new Puffenduy("Justin Finch-Fletchly", 55, 35, 30, 20, 40);

        Kogtevran chzhouChang = new Kogtevran("Chzhou Chang", 90, 80, 78, 55, 65, 75);
        Kogtevran padmaPatill = new Kogtevran("Padma Patill", 45, 40, 39, 32, 11, 22);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 88, 79, 99, 100, 46, 37);

        harryPotter.printStudent();
        hermionaGrainger.printStudent();
        ronWizly.printStudent();
        drakoMalfoy.printStudent();
        zakhariaSmith.printStudent();
        chzhouChang.printStudent();

        Griffindor.compareFacultyStudents(harryPotter, hermionaGrainger);

        Hogwarts.compareStudents(drakoMalfoy, sedrickDiggoree);
    }
}