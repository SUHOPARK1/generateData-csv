package dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class MakeCSV {
    public int createCSV(List<ClientDto> list, String title, String filepath) {
        int resultCount = 0;
        try {
            BufferedWriter fw =
                    new BufferedWriter(new FileWriter(filepath + "/" + title + ".csv", true));

            for (ClientDto dom : list) {
                fw.write(dom.getCliNum()+","+dom.getCliId()+","+dom.getCliName()+","+dom.getCliGender()+","+dom.getCliEmail()+","+dom.getCliAgearange());
                fw.newLine();
            }
            fw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultCount;
    }
}
