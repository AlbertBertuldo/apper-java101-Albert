public class UserInfo {

    private String name;

    public String getName() {
        return name;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    private Double currentBalance;

    public UserInfo(){}

    public UserInfo(String name, Double currentBalance) {
        this.name = name;
        this.currentBalance = currentBalance;
    }



    /*
    public static void main(String[] args) {
        HashMap<String, User> users = new HashMap<>();
        users.put("1234567890", new User("John Doe", 100.0));
    }*/
}
