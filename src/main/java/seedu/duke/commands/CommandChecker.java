package seedu.duke.commands;

import java.util.Scanner;

public enum CommandChecker {
    HELP,
    USERNAME,
    DIVIDER,

    NOUN,
    VERB,
    ADJ,
    LIST_WORDS,
    FILTER_WORDS,

    GEN_NAME,
    LIST_NAMES,
    FILTER_NAMES,

    BUNNY,
    LIST_BUNNY,
    FILTER_BUNNY,

    CHARACTER,
    LIST_CHARACTER,
    FILTER_CHARACTER,

    START,
    TITLE,
    TYPE,
    WRITE,
    FINISH,


    STATS,
    DELETE,
    EXIT,
    SCENE,
    TOPIC,
    UNRECOGNISED;

    /**
     * Figures out the command type from userInput.
     *
     * @param userInput string containing user input command
     * @return the type of command detected
     */
    public static CommandChecker extractCommandType(String userInput) {
        if (userInput.toLowerCase().trim().startsWith("help")) {
            return CommandChecker.HELP;
        } else if (userInput.toLowerCase().trim().startsWith("username")) {
            return CommandChecker.USERNAME;
        } else if (userInput.toLowerCase().trim().startsWith("divider")) {
            return CommandChecker.DIVIDER;
        } else if (userInput.toLowerCase().trim().startsWith("noun")) {
            return CommandChecker.NOUN;
        } else if (userInput.toLowerCase().trim().startsWith("verb")) {
            return CommandChecker.VERB;
        } else if (userInput.toLowerCase().trim().startsWith("adj")) {
            return CommandChecker.ADJ;
        } else if (userInput.toLowerCase().trim().startsWith("list words")) {
            return CommandChecker.LIST_WORDS;
        } else if (userInput.toLowerCase().trim().startsWith("bunny")) {
            return CommandChecker.BUNNY;
        } else if (userInput.toLowerCase().trim().startsWith("list bunny")) {
            return CommandChecker.LIST_BUNNY;
        } else if (userInput.toLowerCase().trim().startsWith("filter bunny")) {
            return CommandChecker.FILTER_BUNNY;
        } else if (userInput.toLowerCase().trim().startsWith("exit")) {
            return CommandChecker.EXIT;
        } else if (userInput.toLowerCase().trim().startsWith("scene")) {
            return CommandChecker.SCENE;
        } else if (userInput.toLowerCase().trim().startsWith("topic")) {
            return CommandChecker.TOPIC;
        } else if (userInput.toLowerCase().trim().startsWith("name")) {
            return CommandChecker.GEN_NAME;
        } else if (userInput.toLowerCase().trim().startsWith("list names")) {
            return CommandChecker.LIST_NAMES;
        } else if (userInput.toLowerCase().trim().startsWith("filter names")) {
            return CommandChecker.FILTER_NAMES;
        } else if (userInput.toLowerCase().trim().startsWith("filter")) {
            return CommandChecker.FILTER_WORDS;
        } else if (userInput.toLowerCase().trim().startsWith("start")) {
            return CommandChecker.START;
        } else if (userInput.toLowerCase().trim().startsWith("title")) {
            return CommandChecker.TITLE;
        } else if (userInput.toLowerCase().trim().startsWith("type")) {
            return CommandChecker.TYPE;
        } else if (userInput.toLowerCase().trim().startsWith("write")) {
            return CommandChecker.WRITE;
        } else if (userInput.toLowerCase().trim().startsWith("finish")) {
            return CommandChecker.FINISH;
        } else if (userInput.toLowerCase().trim().startsWith("stats")) {
            return CommandChecker.STATS;
        } else {
            return CommandChecker.UNRECOGNISED;
        }
    }

}
