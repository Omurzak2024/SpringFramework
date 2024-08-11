package peaksoft;

public class Book {
    private Library library;
    private String name;


    public Book(Library library) {
        this.library = library;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Book{" +
                "library=" + library +
                ", name='" + name + '\'' +
                '}';
    }
}
