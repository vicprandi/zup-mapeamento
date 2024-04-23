import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class BookDTO {

    @NotBlank
    @Size(max = 200)
    private String title;

    @NotBlank
    @Size(max = 4000)
    private String description;

    @Past
    private LocalDate publicationDate;

    @NotBlank
    private String isbn;

    public BookDTO() {
    }

    public BookDTO(String title, String description, LocalDate publicationDate, String isbn) {
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.isbn = isbn;
    }

    // getters e setters
}
