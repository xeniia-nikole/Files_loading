package Loading;

import Preservation.GameProgress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static String FILEPATH = "C:/Users/503242115/IdeaProjects/Initial/Games/savegames" + File.separator;

    public static void main(String[] args) {
        List<String> files = openZip(FILEPATH + "zip.zip");

        int index = new Random().nextInt(files.size());
        String randomFile = files.get(index);

        openProgress(randomFile);
    }

    private static void openProgress(String fileName) {
        Preservation.GameProgress save = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            save = (GameProgress)ois.readObject();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        System.out.println(save);
    }

    public static List<String> openZip(String zipPath) {
        List<String> files = new ArrayList<>();
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(zipPath))) {
            ZipEntry entry;
            String name;
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName();
                FileOutputStream fout = new FileOutputStream(name);
                for (int i = zin.read(); i != -1; i = zin.read()) {
                    fout.write(i);
                }
                files.add(name);
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return files;
    }



}
