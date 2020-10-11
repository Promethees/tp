package seedu.duke.writing;

import java.util.ArrayList;

public class WritingList {
    private int countWriting;
    private ArrayList<Writings> writing;

    public WritingList() {
        countWriting = 0;
        this.writing = new ArrayList<>();
    }

    public void add(Writings w) {
        countWriting++;
        writing.add(w);
    }

    public Writings get(int i) {
        return writing.get(i);
    }

    public Writings remove(int i) {
        writing.remove(i);
    }
}
