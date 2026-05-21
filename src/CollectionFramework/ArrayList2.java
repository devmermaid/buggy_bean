package CollectionFramework;

//Scenario: In a music streaming app like Spotify,
// users can manually re-order their music playlist. I
// f they click "Play Next" on a song inside their queue,
// that song should bypass the sequence and
// move directly to the very beginning of the playlist.
// Problem Statement: You are given an ArrayList of $N$ song titles (Strings)
// and a specific song title targetSong that exists in the list.
// Modify the ArrayList to move this song to index 0.
// The relative order of all other songs must remain unchanged.

import java.util.*;

public class ArrayList2
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> playlist=new ArrayList<>();
        //enter total songs
        System.out.println("Enter of number of songs: ");
        int totalsongs=sc.nextInt();

        //accept the song names
        for(int i=1;i<=totalsongs;i++)
        {
            System.out.println("Enter name of song: ");
            String song=sc.next();
            playlist.add(song);
        }

        //finding targeted song to play now
        System.out.println("Enter name of song you want to play first now: ");
        String targetSong=sc.next();

        //finding index of this target song to swap on first index
        int index=playlist.indexOf(targetSong);
        if(index!=-1)
        {
            playlist.remove(targetSong);
            playlist.add(0,targetSong);
        }

        //printing playlist now
        for(String songs:playlist)
        {
            System.out.println(songs);
        }
        //printing current song
        System.out.println("Current playing song: "+ targetSong);
    }
}
