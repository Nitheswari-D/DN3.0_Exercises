import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

public class BookModel extends EntityModel<Book> {

    public BookModel(Book book) {
        super(book);

        // Add self-link to this book
        add(linkTo(methodOn(BookController.class).getBookById(book.getId())).withSelfRel());

        // Add link to all books
        add(linkTo(methodOn(BookController.class).getAllBooks()).withRel("books"));
    }
}
