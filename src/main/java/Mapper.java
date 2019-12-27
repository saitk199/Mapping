import Models.User;

import java.util.List;

public interface Mapper {

    String userToString(User user);

    String[] stringToArray(String string);

    String arrayToString(String[] strings);

    List<String> stringArrayToListString(String[] strings);

    String[] listStringToStringArray(List<String> list);

    List<String[]> listStringToListStringArray(List<String> list);

    List<String> listStringArrayToListString(List<String[]> listArray);

}
