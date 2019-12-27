import Models.User;

import java.util.*;

public class MapperImpl implements Mapper {

    @Override
    public String userToString(User user) {
        String string = user.getId() + "," + user.getFirstName() + "," + user.getLastName();
        return string;
    }

    @Override
    public String[] stringToArray(String string) {

        String stringArray[] = string.split(",");
        return stringArray;
    }

    @Override
    public String arrayToString(String[] strings) {
        String string = "";
        int elementSeparators = strings.length;//колличество ", " между элеметами
        int flag = 1;
        for (String i : strings) {
            string += i;
            if(flag != elementSeparators){
                string +=", ";
                flag++;
            }
        }
        return string;
    }

    @Override
    @Deprecated
    public List<String> stringArrayToListString(String[] strings) {
        List<String> listString = new ArrayList<String>();
        for (String i : strings) {
            listString.add(i);
        }
        return listString;
    }

    @Override
    @Deprecated
    public String[] listStringToStringArray(List<String> list) {
        String string[] = new String[list.size()];
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            string[j] = list.get(i);
            if(j == 2){
                j=0;
            }else j++;
        }
        return string;
    }

    @Override
    public List<String[]> listStringToListStringArray(List<String> list) {
        List<String[]> listStringArray = new ArrayList<String[]>();
        String strings[];

        for (String i : list) {
            strings = stringToArray(i);
            listStringArray.add(strings);
        }

        return listStringArray;
    }

    @Override
    public List<String> listStringArrayToListString(List<String[]> listArray) {
        List<String> listString = new ArrayList<String>();

        for (String[] strings : listArray){
            listString.add(arrayToString(strings));
        }
        return listString;
    }
}