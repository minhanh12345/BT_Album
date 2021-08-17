package Service;

import Model.Album;

import java.util.ArrayList;

public class ServiceSong {
public static ArrayList<Album> list=new ArrayList<>();
public static void create(Album album){
list.add(album);
}
}
