import java.util.Date;
import java.util.UUID;

public abstract class Entry {
    protected Date creationDate;
    protected UUID id;
    protected String message;

    public Entry(String message) {
        this.id = UUID.randomUUID();
        this.creationDate = new Date();
        this.message = message;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract String toString();
}
