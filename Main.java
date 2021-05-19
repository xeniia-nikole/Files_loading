package Loading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {
        List<String> files = openZip("C:/Users/503242115/Games/savegames/zip.zip");
//        openProgress(files);
    }

    public static List<String> openZip(String zipPath){
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(zipPath))) {
                ZipEntry entry;
                String name;
                while ((entry = zin.getNextEntry()) != null) {
                    name = entry.getName();
                    FileOutputStream fout = new FileOutputStream(name);
                    for (int i = zin.read(); i != -1; i = zin.read()) {
                        fout.write(i);
                    }
                    fout.flush();
                    zin.closeEntry();
                    fout.close();
                }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        List<String> files = new ArrayList<>();
        files.add("C:/Users/503242115/Games/savegames/save1.dat");
        files.add("C:/Users/503242115/Games/savegames/save2.dat");
        files.add("C:/Users/503242115/Games/savegames/save3.dat");
        return files;
    }

}
