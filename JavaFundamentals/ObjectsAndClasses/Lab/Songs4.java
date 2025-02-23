package JavaFundamentals.ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songsNumber = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < songsNumber; i++) {
            String[] command = scanner.nextLine().split("_");
            String type = command[0];
            String name = command[1];
            String time = command[2];
            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }

        } else {
            List<Song> filterSong = songs.stream().filter(e -> e.getTypeList().equals(typeList))
                    .collect(Collectors.toList());
            for (Song song : filterSong) {
                System.out.println(song.getName());
            }
        }

    }

    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }


        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
