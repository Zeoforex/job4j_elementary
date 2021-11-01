package ru.job4j.array;

public class DestroySequence {
    /**
     * Из нулей делает 1, а из 1 делает 0
     * @param seq
     * @return
     */
    public static char[] destroy(char[] seq) {
        for (int i = 0; i < 5; i++) {
            seq[i] = '0';
        }
        for (int i = seq.length - 5; i < seq.length; i++) {
            seq[i] = '1';
        }
        return seq;
    }
}