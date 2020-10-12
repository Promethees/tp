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

    public void remove(int i) {
        writing.remove(i);
    }

    /**
     *  print all of the current writings in the Arraylist with details.
     */
    public void printWritings() {
        for (int i = 0; i < countWriting; i++) {
            System.out.println(writing.get(i).title);
            System.out.println(writing.get(i).author);
            System.out.println(writing.get(i).content);
            System.out.println(writing.get(i).date);
        }
    }
}
