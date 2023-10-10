package logic;

import utils.FileWriter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoteManager {
    private final FileWriter fileWriter = new FileWriter();

    public void addNote(String note) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: " + "dd.MM.yyyy " + "Время: " + "HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);
        String formattedNote = timestamp + " -> " + note;
        fileWriter.writeToFile(formattedNote);
    }
}
