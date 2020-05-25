public class Comment extends Entry {

    private boolean isModerated;

    public boolean isModerated() {
        return isModerated;
    }

    public void setModerated(boolean moderated) {
        isModerated = moderated;
    }

    public void toggleModeration () {
        if(this.isModerated) {
            this.isModerated = false;
        } else {
            this.isModerated = true;
        }
    }

    public Comment(String message) {
        super(message);
        this.isModerated = false;
    }

    @Override
    public String toString() {
        return String.format("Comment:%s Date:%s \n Text:%s", this.getId(), this.getCreationDate(), this.getMessage());
    }
}
