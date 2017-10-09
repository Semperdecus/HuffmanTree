/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huffman;

/**
 *
 * @author Terence
 */
public class HuffmanTree implements Comparable<HuffmanTree> {

    private int frequency;
    private boolean isCharacterNode;
    private CharFrequency chr;

    private HuffmanTree leftChildNode, rightChildNode;

    public HuffmanTree(HuffmanTree leftChildNode, HuffmanTree rightChildNode) {
        this.leftChildNode = leftChildNode;
        this.rightChildNode = rightChildNode;

        frequency = 0;
        frequency += leftChildNode.getFrequency() + rightChildNode.getFrequency();
        isCharacterNode = false;
    }

    public HuffmanTree(CharFrequency charFrequency) {
        this.chr = charFrequency;

        frequency = charFrequency.getFrequency();

        isCharacterNode = true;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public HuffmanTree getRightChildNode() {
        return this.rightChildNode;
    }

    public HuffmanTree getLeftChildNode() {
        return this.leftChildNode;
    }

    public CharFrequency getCharacter() {
        if (isCharacterNode) {
            return chr;
        } else {
            return null;
        }
    }

    public boolean getIsCharacterNode() {
        return isCharacterNode;
    }

    @Override
    public int compareTo(HuffmanTree o) {
        if (this.getFrequency() > o.getFrequency()) {
            return 1;
        } else if (this.getFrequency() == o.getFrequency()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(frequency);
    }
}
