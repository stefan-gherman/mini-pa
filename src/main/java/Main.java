public class Main {
    public static void main(String[] args) {
        Forum forum = Forum.getInstance();

        Topic topic1 = new Topic("Post Hardcore", "Post Hardcore Bands");
        Comment comment1Topic1 = new Comment("A Skylit Drive");
        Comment comment2Topic1 = new Comment("Confide");
        Comment comment3Topic1 = new Comment("Armour For Sleep");

        topic1.addComment(comment1Topic1);
        topic1.addComment(comment2Topic1);
        topic1.addComment(comment3Topic1);

        comment2Topic1.toggleModeration();
        comment1Topic1.toggleModeration();

//        System.out.println(topic1.toString());


        Topic topic2 = new Topic("Metalcore", "Metalcore Bands");
        Comment comment1Topic2 = new Comment("Asking Alexandria");
        Comment comment2Topic2 = new Comment("Memphis May Fire");
        Comment comment3Topic2 = new Comment("Wage War");

        topic2.addComment(comment1Topic2);
        topic2.addComment(comment2Topic2);
        topic2.addComment(comment3Topic2);

        comment1Topic2.toggleModeration();
        comment2Topic2.toggleModeration();
        comment3Topic2.toggleModeration();

//        System.out.println(topic2.toString());

        Topic topic3 = new Topic("Deathcore", "Deathcore Bands");
        Comment comment1Topic3 = new Comment("Suicide Silence");
        Comment comment2Topic3 = new Comment("As Blood Runs Black");
        Comment comment3Topic3 = new Comment("Light This City");

        topic3.addComment(comment1Topic3);
        topic3.addComment(comment2Topic3);
        topic3.addComment(comment3Topic3);

        comment1Topic3.toggleModeration();
        comment2Topic3.toggleModeration();
        comment3Topic3.toggleModeration();

        comment1Topic3.toggleModeration();
        comment2Topic3.toggleModeration();
        comment3Topic3.toggleModeration();

//        System.out.println(topic3.toString());

        forum.addTopic(topic1);
        forum.addTopic(topic2);
        forum.addTopic(topic3);

        forum.getTopics().toString();
        System.out.println(forum.toString());
    }
}
