package course1.objects_and_classes;

import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;
    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
    @Override
    public String toString(){
        return firstNameAuthor + " " + lastNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstNameAuthor, author.firstNameAuthor) && Objects.equals(lastNameAuthor, author.lastNameAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }
    //    public String getFirstNameAuthor () {
//        return this.firstNameAuthor;
//    }
//    public String getLastNameAuthor () {
//        return this.lastNameAuthor;
//    }
}
