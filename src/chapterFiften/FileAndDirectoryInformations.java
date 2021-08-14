package chapterFiften;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndDirectoryInformations {

    static String checkPath(String tempPaths) throws IOException {

        Path path = Paths.get(tempPaths);

        if(Files.exists(path)){
            System.out.printf("%n%s", path.getFileName());
            System.out.printf("%s a directory%n", Files.isDirectory(path)? "Is":"Is not" );
            System.out.printf("%s an absolute path%n", path.isAbsolute()? "Is":"Is not");
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            if (Files.isDirectory(path)){
                System.out.printf("%nDirectory contents:%n");

                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path newPath:directoryStream) {
                    System.out.println(newPath);
                }
            }
        }
         return String.format("%s exist", Files.exists(path) ? path + " does": path + " does not");
    }

}
