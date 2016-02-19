/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import audio.Playlist;
import audio.SoundManager;
import audio.Source;
import audio.Track;
import java.util.ArrayList;

/**
 *
 * @author Camille
 */
public class MySoundManager extends SoundManager{
    
    public static MySoundManager getSoundManager () {
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track(MySoundManager.FIRST_LEVEL_SONG, Source.RESOURCE, "/snakegame/INNER_NINJA.wav"));
        tracks.add(new Track(MySoundManager.SECOND_LEVEL_SONG, Source.RESOURCE, "/snakegame/RECKLESS_BRAVE.wav"));
        tracks.add(new Track(MySoundManager.THIRD_LEVEL_SONG, Source.RESOURCE, "/snakegame/DEAD_MCR.wav"));
        tracks.add(new Track(MySoundManager.FOURTH_LEVEL_SONG, Source.RESOURCE, "/snakegame/RAT_A_TAT.wav"));
        tracks.add(new Track(MySoundManager.FIFTH_LEVEL_SONG, Source.RESOURCE, "/snakegame/TOO_MANY_FRIENDS.wav"));
        tracks.add(new Track(MySoundManager.SIXTH_LEVEL_SONG, Source.RESOURCE, "/snakegame/ROSA_DEAR.wav"));
        tracks.add(new Track(MySoundManager.SEVENTH_LEVEL_SONG, Source.RESOURCE, "/snakegame/NYC_HOTEL.wav"));
        tracks.add(new Track(MySoundManager.EIGHTH_LEVEL_SONG, Source.RESOURCE, "/snakegame/KILL.wav"));
        tracks.add(new Track(MySoundManager.NINETH_LEVEL_SONG, Source.RESOURCE, "/snakegame/DESOLATION_ROW.wav"));
        tracks.add(new Track(MySoundManager.TENTH_LEVEL_SONG, Source.RESOURCE, "/snakegame/CAMISADO.wav"));
        Playlist playlist = new Playlist(tracks);
        return new MySoundManager(playlist);
    }
            

    public MySoundManager(Playlist playlist) {
        super(playlist);
    }
    
    public static final String FIRST_LEVEL_SONG = "song1";
    public static final String SECOND_LEVEL_SONG = "song2";
    public static final String THIRD_LEVEL_SONG = "song3";
    public static final String FOURTH_LEVEL_SONG = "song4";
    public static final String FIFTH_LEVEL_SONG = "song5";
    public static final String SIXTH_LEVEL_SONG = "song6";
    public static final String SEVENTH_LEVEL_SONG = "song7";
    public static final String EIGHTH_LEVEL_SONG = "song8";
    public static final String NINETH_LEVEL_SONG = "song9";
    public static final String TENTH_LEVEL_SONG = "song10";
        
    
}
