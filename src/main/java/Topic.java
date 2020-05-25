import java.util.ArrayList;
import java.util.List;

public class Topic extends Entry {

    private String title;
    private List<Comment> comments = new ArrayList<>();

    public Topic( String title, String message) {
        super(message);
        this.title = title;
        this.comments = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getModeratedComments() {
        List<Comment> moderatedComments = new ArrayList<>();
        comments.forEach(comment -> {
            if (comment.isModerated()) {
                moderatedComments.add(comment);
            }
        });
        return moderatedComments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder topicContent = new StringBuilder();
        String rowPadding = "--------";
        topicContent.append(rowPadding);
        topicContent.append(String.format("Topic:%s Title:%s Date:%s \n Comments:\n", this.getId(), this.getTitle(), this.getCreationDate()));
        this.getModeratedComments().forEach(comment -> {
            topicContent.append(comment.toString()+'\n');
        });
        topicContent.append(rowPadding);
        return topicContent.toString();
    }
}
