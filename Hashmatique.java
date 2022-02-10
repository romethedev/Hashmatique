//Map of the Hashmatique
//A band from Teignmouth, Devon has contracted your company to organize their song list. Part of this is that they don't want to use song numbers in storing the lyrics until they are certain of the order. They insist that you be able to immediately retrieve the lyrics based on the song name, and your PM has asked you to implement this.
//To demonstrate to the band how it would work, use a HashMap with the track titles as keys and some sample lyrics as the values. Add at least 4 songs to your trackList HashMap and then pull one out by its name. They also want to be able to see all the tracks with the lyrics immediately following them.

import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Purple Rain", "I never meant to cause you any sorrow...");
        trackList.put("Remember the Time", "I don't know, bet you wanna try...");
        trackList.put("Sweet Child O' Mine", "She's got a smile that it seems to me...");
        trackList.put("Head Over Heels", "I wanted to be with you alone...");

        String single = trackList.get("Purple Rain");     //set a track into the single variable by its name
        System.out.println(single);         //display the name lyrics to that single

        Set<String> keys = trackList.keySet();
        for (String key: keys) {
            System.out.println("Title: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }
    }
}
