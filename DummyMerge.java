package dummy;

import java.util.ArrayList;
import java.util.List;

public class DummyMerge {

    public static void main(String[] args) {
        List<ClientDto> merge = new ArrayList<>();

        for (int i = 0; i < 1000; i++){
            ClientDto clientDto = new ClientDto();
            clientDto.setCliNum(i+1);
            clientDto.setRole(DummyRole.role());
            clientDto.setProvider(DummyProvider.provider());
            clientDto.setCliId(DummyId.nId()+DummyId.nNo2());
            clientDto.setCliName(DummyName.Name());
            clientDto.setCliGender(DummyGender.gender());
            clientDto.setCliEmail(DummyEmail.nId()+DummyEmail.nNo2()+DummyEmail.emailAdress());
            clientDto.setCliAgearange(DummyAgerange.range());
            merge.add(clientDto);
        }

        MakeCSV makeCSV = new MakeCSV();
        makeCSV.createCSV(merge, "clientList", "src");
    }
}
