package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        File games = new File("C:/Users/503242115/IdeaProjects/Initial/Games");
        if (games.mkdir()) System.out.println(">> Folder 'Games' was successfully created");
        str.append(">> Folder 'Games' was successfully created");

        File src = new File("C:/Users/503242115/IdeaProjects/Initial/Games/src");
        if (src.mkdir()) System.out.println(">> Dir 'src' was successfully created");
        str.append("\n>> Dir 'src' was successfully created");

        File res = new File("C:/Users/503242115/IdeaProjects/Initial/Games/res");
        if (res.mkdir()) System.out.println(">> Dir 'res' was successfully created");
        str.append("\n>> Dir 'res' was successfully created");

        File drawables = new File("C:/Users/503242115/IdeaProjects/Initial/Games/res/drawables");
        if (drawables.mkdir()) System.out.println(">> Dir 'drawables' was successfully created");
        str.append("\n>> Dir 'drawables' was successfully created");

        File vectors = new File("C:/Users/503242115/IdeaProjects/Initial/Games/res/vectors");
        if (vectors.mkdir()) System.out.println(">> Dir 'vectors' was successfully created");
        str.append("\n>> Dir 'vectors' was successfully created");

        File icons = new File("C:/Users/503242115/IdeaProjects/Initial/Games/res/icons");
        if (icons.mkdir()) System.out.println(">> Dir 'icons' was successfully created");
        str.append("\n>> Dir 'icons' was successfully created");

        File savegames = new File("C:/Users/503242115/IdeaProjects/Initial/Games/savegames");
        if (savegames.mkdir()) System.out.println(">> Dir 'savegames' was successfully created");
        str.append("\n>> Dir 'savegames' was successfully created");

        File main = new File("C:/Users/503242115/IdeaProjects/Initial/Games/src/main");
        if (main.mkdir()) System.out.println(">> Dir 'main' was successfully created");
        str.append("\n>> Dir 'main' was successfully created");

        File main_java = new File("C:/Users/503242115/IdeaProjects/Initial/Games/src/main//Main.java");
        try {
            if (main_java.createNewFile()) System.out.println(">> File 'Main.java' was successfully created");
            str.append("\n>> File 'Main.java' was successfully created");
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

        File utils_java = new File("C:/Users/503242115/IdeaProjects/Initial/Games/src/main//Utils.java");
        try {
            if (utils_java.createNewFile()) System.out.println(">> File 'Utils.java' was successfully created");
            str.append("\n>> File 'Utils.java' was successfully created");
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

        File test = new File("C:/Users/503242115/IdeaProjects/Initial/Games/src/test");
        if (test.mkdir()) System.out.println(">> Dir 'test' was successfully created");
        str.append("\n>> Dir 'test' was successfully created");

        File temp = new File("C:/Users/503242115/IdeaProjects/Initial/Games/temp");
        if (temp.mkdir()) System.out.println(">> Dir 'temp' was successfully created");
        str.append("\n>> Dir 'temp' was successfully created");

        File temp_txt = new File("C:/Users/503242115/IdeaProjects/Initial/Games/temp//temp.txt");
        try {
            if (temp_txt.createNewFile()) System.out.println(">> File 'temp.txt' was successfully created");
            str.append("\n>> File 'temp.txt' was successfully created");
            try (FileOutputStream fos = new FileOutputStream(temp_txt)){
                byte[] bytes = str.toString().getBytes();
                fos.write(bytes, 0, bytes.length);
            }catch (IOException io){
                System.out.println(io.getMessage());
            };
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

    }
}

