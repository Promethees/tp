package seedu.duke.writing;

import seedu.duke.user.User;

public class Essay extends Writings {
    private int numberOfSentences;
    private int numberOfWords;
    private int countEssays;

    public Essay(String title, int id, String topic, String date, String content, String author) {
        this.title = title;
        this.id = id;
        this.topic = topic;
        this.date = date;
        this.content = content;
        this.author = new User(author);
        countEssays++;
    }

    public Essay(String title, int id, String topic, String date, String content) {
        this.title = title;
        this.id = id;
        this.topic = topic;
        this.date = date;
        this.content = content;
        this.author = getAuthor();
        countEssays++;
    }

    public void setNumberOfSentences() {
        int count = 0;
        for (int i = 0; i < this.content.length(); i++) {
            if (this.content.charAt(i) == '.') {
                count++;
            }
        }
        this.numberOfSentences = count;
    }

    public void setNumberOfWords() {
        int count = 0;
        for (int i = 0; i < this.content.length(); i++) {
            if (this.content.charAt(i) == ' ') {
                count++;
            }
        }
    }

    public int getCountEssays() {
        return countEssays;
    }
}
