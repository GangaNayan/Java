

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
   // private ArrayList<Song> songs;
    private Songlist songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
       // this.songs = new ArrayList<Song>();
        this.songs = new Songlist( );

    }

    public boolean addSong(String title, double duration) {
//        if(findSong(title) == null) {
//            this.songs.add(new Song(title, duration));
//            return true;
//        }
//        return false;

        return this.songs.add(new Song(title,duration));

    }

//    private Song findSong(String title) {
//        //or for(i=0; i<this.songs.size(); i++)
//        // Song checkedsong=this.songs.get(i);
//        for(Song checkedSong: this.songs) {
//            if(checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            }
//        }
//        return null;
//    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
//        int index = trackNumber -1;
//        if((index >=0) && (index <= this.songs.size())) {
//            playList.add(this.songs.get(index));

        Song checkedsong =this.songs.findsong(trackNumber);
        if(checkedsong !=null){
            playList.add(checkedsong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {

        Song checkedSong = songs.findSong(title); //findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class Songlist{
        private ArrayList<Song> songs;

        public Songlist() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            //or for(i=0; i<this.songs.size(); i++)
            // Song checkedsong=this.songs.get(i);
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findsong(int tracknumber){
            int index = tracknumber -1;
            if((index >0) && (index < this.songs.size())) {
                return songs.get(index);
            }
           return null;
        }

        }
    }


