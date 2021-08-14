package chapterFiften;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileAndDirectoryInformationsTest {
    String path = "C:\\Semicolon\\UIUX";
    @Test
    void testFileIFItDoesExist() throws IOException {

        assertEquals(path + " does exist",FileAndDirectoryInformations.checkPath(path));
    }

}