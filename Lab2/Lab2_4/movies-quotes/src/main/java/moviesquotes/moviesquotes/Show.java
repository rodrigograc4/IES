package moviesquotes.moviesquotes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Show {

    private final String name;
    private final int show;

    public Show(String name, int show) {
        this.name = name;
        this.show = show;
    }

    public String getName() {
        return this.name;
    }

    public int getShow() {
        return this.show;
    }

    public static ArrayList<Show> getAllShows(String filename) {
        ArrayList<Show> shows = new ArrayList<>();
        HashSet<String> processedShowNames = new HashSet<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int showId = 1;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" - ");
                if (parts.length == 2) {
                    String showName = parts[1];
                    if (!processedShowNames.contains(showName)) {
                        processedShowNames.add(showName);
                        shows.add(new Show(showName, showId));
                        showId++;
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return shows;
    }

}
