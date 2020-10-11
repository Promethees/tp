package seedu.duke.writing;

public class Poem extends Writings {
    private int numberOfLines;
    private int numberOfWords;
    private int countPoems;

    public Poem(String title, int id, String topic, String date, String content) {
        this.title = title;
        this.id = id;
        this.topic = topic;
        this.date = date;
        this.content = content;
        this.author = getAuthor();
        countPoems++;
    }

    public void setNumberOfLines() {
        int count = 0;
        for (int i = 0; i < this.content.length(); i++) {
            if (this.content.charAt(i) == '\n') {
                count++;
            }
        }
        this.numberOfLines = count;
    }

    public void setNumberOfWords() {
        int count = 0;
        for (int i = 0; i < this.content.length(); i++) {
            if (this.content.charAt(i) == ' ' || this.content.charAt(i) == '\n') {
                count++;
            }
        }
    }

    public int getCountPoems() {
        return countPoems;
    }
}
