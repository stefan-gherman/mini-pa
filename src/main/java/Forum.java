import java.util.ArrayList;
import java.util.List;

public class Forum {
    private static Forum instance = null;
    private List<Topic> topics = new ArrayList<>();

    private Forum() {
        this.topics = new ArrayList<>();
    }
    public static Forum getInstance() {
        if(instance == null) {
            instance = new Forum();
        }
        return instance;
    }

    public void addTopic (Topic topic) {
        topics.add(topic);
    }

    public List<Topic> getTopics() {
        return topics;
    }

    @Override
    public String toString() {
        StringBuilder forumPage = new StringBuilder();
        forumPage.append("Welcome to the Forum\n Topics:\n");
        topics.forEach(topic -> {
            forumPage.append(topic.toString() + '\n');
        });
        return forumPage.toString();
    }
}
