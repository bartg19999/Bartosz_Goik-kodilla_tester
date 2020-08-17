public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2013);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        Notebook heavyNotebook = new Notebook(2000, 2000, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        Notebook oldNotebook = new Notebook(1400, 500, 2008);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        Notebook newNotebook = new Notebook(2500, 4000, 2020);
        System.out.println(newNotebook.weight + " " + newNotebook.price + " " + newNotebook.year);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkYear();
    }
}