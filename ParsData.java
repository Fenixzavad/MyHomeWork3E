import java.util.HashMap;

public class ParsData {

    public HashMap<String, Object> parsInputData() {
        InputData inputData = new InputData();
        String[] data = inputData.enterData();
        HashMap<String, Object> dataDic = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                    try {
                        throw new DataException();
                    } catch (DataException e) {
                        e.dataException(i);
                    }

            } else if (i.matches("[0-9]+")) {
                dataDic.put("tel", i);
            } else if (i.matches("[A-Za-z]+")) {
                sb.append(i + " ");
            } else {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    e.dataException(i);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataDic.put("firstName", fullName[1]);
            dataDic.put("lastName", fullName[0]);
            dataDic.put("patronymic", fullName[2]);
        }
        return dataDic;
    }

}