package course1.objects_and_classes;

public class Main {
    public static void main(java.lang.String[] args) {
        Author exupery = new Author("Antonie", "de Saint-Exupery");
        Book book = new Book("The Little Prince", exupery, 1942);
        System.out.println("name = " + book.getName());
        System.out.println("author = " + exupery.getFirstNameAuthor() + " " + exupery.getLastNameAuthor());
        System.out.println("year = " + book.getYear());
        book.setYear(2018);
        System.out.println("book.getYear() = " + book.getYear());

        Book book1 = new Book ("Nightt flight", exupery, 1930);
        System.out.println("name = " + book1.getName());
        System.out.println("author = " + exupery.getFirstNameAuthor() + " " + exupery.getLastNameAuthor());
        System.out.println("year = " + book1.getYear());
        book1.setYear(1976);
        System.out.println("book1.getYear() = " + book1.getYear());

        Author braun = new Author("Ден", "Браун");
        Book book2 = new Book("Цифровая крепоость", braun, 2017);
        System.out.println("name = " + book2.getName());
        System.out.println("author = " + braun.getFirstNameAuthor() + " " + braun.getLastNameAuthor());
        System.out.println("year = " + book2.getYear());
        book2.setYear(2020);
        System.out.println("book2.getYear() = " + book2.getYear());

        Book book3 = new Book("Утраченный символ", braun, 2009);
        System.out.println("name = " + book3.getName());
        System.out.println("author = " + braun.getFirstNameAuthor() + " " + braun.getLastNameAuthor());
        System.out.println("year = " + book3.getYear());
        book3.setYear(2021);
        System.out.println("book3.getYear() = " + book3.getYear());
    }
}
