/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huffman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Test;

/**
 *
 * @author Terence
 */
public class HuffmanTest {

    private Huffman verhaaltje;
    private Huffman randomKarakters;
    private static final int AMOUNTOFTESTS = 20;

    public HuffmanTest() throws IOException {
        verhaaltje = new Huffman("Last night, my wife's boss from her brand new job invited us over for dinner. On the drive over, my wife reiterated many times to me just how important it was to make a good impression.\n"
                + "\n"
                + "I scoffed and arrogantly informed my silly wife that I always make good impressions.\n"
                + "\n"
                + "My wife's boss is a single lady in her fifties, so it was just the three of us. We chitchatted over drinks and salads and seemed to really be hitting it off. She laughed at my well-timed, perfectly-appropriate jokes and my wife seemed pleased.\n"
                + "\n"
                + "Soon she brought out the main course, a nice big juicy steak for each of us. As I began to cut into my steak, I was discouraged to discover how under cooked this steak was.\n"
                + "\n"
                + "Now, I've had my fair share of rare steak. I prefer medium, but I can handle rare. This was several-minutes-on-a-hot-grill short of rare. I probably could've resuscitated the cow had I tried. Instead, I sat there fidgeting with my knife and fork, worrying about how I was going to get away with not eating this steak.\n"
                + "\n"
                + "Claim vegan-ism? No, I'd already feigned great enthusiasm upon seeing the steak.\n"
                + "\n"
                + "Just then, our hostess excused herself to the kitchen to take care of some dessert preparations. As I looked across the fancy dining room table at the open window of this 3rd story apartment... a cartoon light bulb appeared over my head.\n"
                + "\n"
                + "I knew I had to be decisive, realizing that she could return at any moment. I committed. I grabbed the steak with my hand, gently shook off the juice and executed a perfect throw right through the center of the open window.\n"
                + "\n"
                + "Here's the big time FU. The window wasn't open. It was the cleanest fricking window you've ever seen in your life. That is, until my mostly raw slab of steak slammed up against it and slowly slid down leaving a trail of bloody juice in its wake.\n"
                + "\n"
                + "My wife - who's steak was a nice medium rare and was unaware of my predicament - turned, jaw dropped, and stared at me like I was an alien from another planet. This look then slowly morphed into more of a there-is-no-place-on-this-planet-you-can-ever-hide-from-me expression of demonic anger.\n"
                + "\n"
                + "My wife's boss heard the thud of the steak-on-window impact and came quickly. She took in the scene, the steak sitting on the window sill, the blood trail, my empty plate, and then gave me an inquisitive, puzzled look.\n"
                + "\n"
                + "I just didn't know what to say. It felt like a minute of silence, but was probably 3 or 4 seconds. Finally, the best I could manage was \"I... I'm so sorry. I am such a clutz... I don't know... I was just cutting it.. and... it... ... it slipped... just ask my wife, I really am a clutz... right honey?... (no help coming from that direction) ... I will clean this up... I can't believe this... I am so sorry\" etc... etc...\n"
                + "\n"
                + "Both women continued to stare at me like I had escaped from the loony bin, as I smeared the blood around the window with my cloth napkin, dusted off the steak, and continued to mutter my incoherent explanation. I knew no one was buying the story.\n"
                + "\n"
                + "I knew what I had to do. I sheepishly returned to my seat and proceeded to eat every bite of that disgusting, cold, chewy, bloody, raw steak.\n"
                + "\n"
                + "I remained pretty quiet the rest of the evening. My wife's only two words to me since the incident are \"I'm fine\".\n"
                + "\n"
                + "TL;DR: Tried to sneakily throw my under-cooked steak through an open window... only to find out it wasn't open.\n"
                + "\n"
                + "Edit: Thanks kind redditors (:\n"
                + "\n"
                + "Update: Just got the first post-\"I'm fine\" communication from my wife, via text, who is at work...\n"
                + "\n"
                + "\"good news, [boss' name] and i just had a good laugh over how much of a fucking idiot u are. i hope u know u will never live this down. love u you moron\"");
    }

    @Test
    public void testTime() throws IOException {
        System.out.println("");
        int aantalTests = AMOUNTOFTESTS;
        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < aantalTests; i++) {
            Huffman instance = randomHuffmanText();
        }
        long duur = (System.currentTimeMillis() - beginTime);
        System.out.println("Duur om " + AMOUNTOFTESTS + " huffman bomen te maken: " + duur + "ms.");
    }

    private Huffman randomHuffmanText() throws IOException {
        // characters to include in random string
        char[] chars = "abcdefghijklmnopqrstuvwxyz ".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(70) + 50; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return new Huffman(sb.toString());
    }

    @Test
    public void testSortCharFrequencyList() {
        List<CharFrequency> inputList = new ArrayList<>();
        inputList.add(increaseCharCount(new CharFrequency('T'), 2));
        inputList.add(increaseCharCount(new CharFrequency('E'), 3));
        inputList.add(increaseCharCount(new CharFrequency('S'), 5));
        inputList.add(increaseCharCount(new CharFrequency('N'), 1));
    }

    private CharFrequency increaseCharCount(CharFrequency character, int count) {
        for (int i = 0; i < count; i++) {
            character.addFrequency();
        }
        return character;
    }
}
