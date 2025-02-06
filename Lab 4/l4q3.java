class Club {
    static String clubName = "Anime Club";
    
    String memberName;

    Club(String memberName) {
        this.memberName = memberName;
    }
    
    static void displayClubName() {
        System.out.println("Name of Club is: " + clubName);
    }
    
    void displayMember() {
        System.out.println("Member is " + memberName + " of the Club : " + clubName);
    }
}
public class l4q3{
    public static void main(String[] args) {
        Club.displayClubName();
        Club member1 = new Club("Nakul");
        Club member2 = new Club("Dev");
        member1.displayMember();
        member2.displayMember();
    }
}
