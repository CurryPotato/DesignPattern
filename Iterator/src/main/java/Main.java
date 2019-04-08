public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("design-pattern"));
        bookShelf.appendBook(new Book("domain-driven-design"));
        bookShelf.appendBook(new Book("java-web-token"));
        bookShelf.appendBook(new Book("java-virtual-machine"));

        Iterator<Book> iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

    }
}
