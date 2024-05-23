package linkedlist.pm;

import linkedlist.tms.Task;

import java.util.Collections;
import java.util.LinkedList;

public class PlaylistManage {
    LinkedList <Playlist> playlists = new LinkedList<>();

    public void addTask(Playlist playlist){
        playlists.add(playlist);
        System.out.println("Task Added "+playlist);
    }

    public void removePlaylist(int songId) {
        playlists.removeIf(playlist -> playlist.getSongId()==(songId));
        for (int i=0; i<playlists.size(); i++) {
            System.out.println(playlists.get(i));
        }
    }

    public void searchPlaylistById(int taskId) {
        for(Playlist playlist:playlists){
            if(playlist.getSongId()==taskId) {
                System.out.println("Playlist Found:" +playlist);
                return;
            }
        }
        System.out.println("Task Id "+taskId+"is Not Found");
    }

    public void sortedByDuration() {
        Collections.sort(playlists);
        for (Playlist playlist:playlists){
            System.out.println(playlist);
        }
    }

    public static void main(String[] args) {
        PlaylistManage playlistManage = new PlaylistManage();

        playlistManage.addTask(new Playlist(1,"O Maahi", "Arijit Singh", "new album", "1 month"));
        playlistManage.addTask(new Playlist(2,"Saware", "Pritam", "latest album", "6 months"));
        playlistManage.addTask(new Playlist(3,"Apna Bana le", "Sachin Jigar", " album", "max duration"));

        System.out.println("\nRemove Playlist BY id 3");
        playlistManage.removePlaylist(3);

        System.out.println("\nSearch Playlist By id: 1");
        playlistManage.searchPlaylistById(1);

        System.out.println("\nSorted Playlist By There Duration: ");
        playlistManage.sortedByDuration();

    }
}
