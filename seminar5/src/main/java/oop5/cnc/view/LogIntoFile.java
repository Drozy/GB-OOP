package oop5.cnc.view;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogIntoFile implements Loggable {

    @Override
    public void saveLog(String str) {
        String out = LocalDateTime.now() + ": " + str + "\n";
        try (FileWriter fw = new FileWriter("calc_log.txt", true)){
            fw.append(out);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
