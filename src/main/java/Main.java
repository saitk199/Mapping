import Models.User;

public class Main {
    public static void main(String[] args){
        User user = new User(1, "Leonid", "Ostrovsky");
        Mapper mapper = new MapperImpl();
        String str1 = mapper.userToString(user);
        System.out.println(str1);
        String str2[] = mapper.stringToArray(str1);
        for(String i : str2){
            System.out.println(i);
        }
        String str3 = mapper.arrayToString(str2);
        System.out.println(str3);
    }
}
