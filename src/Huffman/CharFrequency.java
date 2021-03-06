package Huffman;

/**
 *
 * @author Terence
 */
public class CharFrequency implements Comparable<CharFrequency> {

    private Character character;
    private int frequency;

    public CharFrequency(Character character) {
        this.character = character;
        this.frequency = 1;
    }

    public Character getCharacter() {
        return this.character;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void addFrequency() {
        this.frequency++;
    }

    @Override
    public int compareTo(CharFrequency o) {
        if (this.getFrequency() > o.getFrequency()) {
            return 1;
        }
        if (this.getFrequency() < o.getFrequency()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return character + " " + frequency;
    }

}
