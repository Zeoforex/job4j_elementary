package ru.job4j.array;

public class EndsWith {
    /**
     * надо сравнить совпадают ли буквы в конце у массива
     * @param word
     * @param post
     * @return
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}