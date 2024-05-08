class Date {
    //member variables
    private int day;
    private String month;
    private int year;

    //Constructor that takes Date
    Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //method to display date
    String dateDisplay() {
        if (day < 10)
            return ("0" + day + "-" + month + "-" + year);
        else
            return (day + "-" + month + "-" + year);
    }

    //Condition1 checker
    boolean check() {
        if (year < 2009)
            return true;
        else
            return false;
    }
}

class Member {
    //member variables
    private int MemberID;
    private String FirstName;
    private String LastName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;

    //Constructor that takes member Personal details
    Member(int MemberID, String FirstName, String LastName, int Handicap, char Gender) {
        this.MemberID = MemberID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Handicap = Handicap;
        this.Gender = Gender;
    }

    //Setter method1 takes Team details
    void teamDetailSetter(String Team, String MemberType) {
        this.Team = Team;
        this.MemberType = MemberType;
    }

    //Setter method2 takes Contact details
    void contactDetailSetter(int Coach, long Phone) {
        this.Coach = Coach;
        this.Phone = Phone;
    }

    //Setter method3 takes joining date of member
    void joinedDateSetter(int day, String month, int year) {
        JoinDate = new Date(day, month, year);
    }

    //method for condition1
    void check1() {
        if(JoinDate.check())
        display();
    }

    //method for condition2
    void check2() {
        if (MemberType == "Senior" && Handicap < 12)
            display();
    }
    //method for condition3
    void check3() {
        if(MemberType=="Senior" && Gender=='F' && Team == "TeamB")
        display();
    }

    //display method
    void display() {
        System.out.println("MemberID: " + MemberID);
        System.out.println("FirstName: " + FirstName);
        System.out.println("LastName: " + LastName);
        System.out.println("Handicap: " + Handicap);
        System.out.println("Gender: " + Gender);
        System.out.println("Team: " + Team);
        System.out.println("MemberType: " + MemberType);
        System.out.println("Coach: " + Coach);
        System.out.println("Phone: " + Phone);
        System.out.println("JoinDate: " + JoinDate.dateDisplay());
        System.out.println();
    }
    
}

class Test {
    public static void main(String args[]) {

        //Array of members
        Member member[] = new Member[20];

        member[0] = new Member(118, "Melissa", "McKenzie", 30, 'F');
        member[0].teamDetailSetter(null, "Junior");
        member[0].contactDetailSetter(153, 963270);
        member[0].joinedDateSetter(28, "May", 2005);

        member[1] = new Member(138, "Michael", "Stone", 30, 'M');
        member[1].teamDetailSetter(null, "Senior");
        member[1].contactDetailSetter(0, 983223);
        member[1].joinedDateSetter(31, "May", 2009);

        member[2] = new Member(153, "Brenda", "Nolan", 11, 'F');
        member[2].teamDetailSetter("TeamB", "Senior");
        member[2].contactDetailSetter(0, 442649);
        member[2].joinedDateSetter(12, "Aug", 2006);

        member[3] = new Member(176, "Helen", "Branch", 0, 'F');
        member[3].teamDetailSetter(null, "Social");
        member[3].contactDetailSetter(0, 589419);
        member[3].joinedDateSetter(6, "Dec", 2011);

        member[4] = new Member(178, "Sarah", "Beck", 0, 'F');
        member[4].teamDetailSetter(null, "Social");
        member[4].contactDetailSetter(0, 226596);
        member[4].joinedDateSetter(24, "Jan", 2010);

        member[5] = new Member(228, "Sandra", "Burton", 26, 'F');
        member[5].teamDetailSetter(null, "Junior");
        member[5].contactDetailSetter(153, 244493);
        member[5].joinedDateSetter(9, "Jul", 2013);

        member[6] = new Member(235, "William", "Cooper", 14, 'M');
        member[6].teamDetailSetter("TeamB", "Senior");
        member[6].contactDetailSetter(153, 722954);
        member[6].joinedDateSetter(5, "March", 2008);

        member[7] = new Member(239, "Thomas", "Spence", 10, 'M');
        member[7].teamDetailSetter(null, "Senior");
        member[7].contactDetailSetter(0, 697720);
        member[7].joinedDateSetter(22, "Jun", 2006);

        member[8] = new Member(258, "Barbara", "Olsen", 16, 'F');
        member[8].teamDetailSetter(null, "Senior");
        member[8].contactDetailSetter(0, 370186);
        member[8].joinedDateSetter(29, "Jul", 2013);

        member[9] = new Member(286, "Robert", "Pollard", 19, 'M');
        member[9].teamDetailSetter("TeamB", "Junior");
        member[9].contactDetailSetter(235, 617681);
        member[9].joinedDateSetter(13, "Aug", 2013);

        member[10] = new Member(290, "Thomas", "Sexton", 26, 'M');
        member[10].teamDetailSetter(null, "Senior");
        member[10].contactDetailSetter(235, 268936);
        member[10].joinedDateSetter(28, "Jul", 2008);

        member[11] = new Member(323, "Daniel", "Wilcox", 3, 'M');
        member[11].teamDetailSetter("TeamA", "Senior");
        member[11].contactDetailSetter(0, 665393);
        member[11].joinedDateSetter(18, "May", 2009);

        member[12] = new Member(331, "Thomas", "Schmidt", 25, 'M');
        member[12].teamDetailSetter(null, "Senior");
        member[12].contactDetailSetter(153, 867492);
        member[12].joinedDateSetter(7, "Apr", 2009);

        member[13] = new Member(332, "Deborah", "Bridges", 12, 'F');
        member[13].teamDetailSetter(null, "Senior");
        member[13].contactDetailSetter(235, 279087);
        member[13].joinedDateSetter(23, "Mar", 2007);

        member[14] = new Member(339, "Betty", "Young", 21, 'F');
        member[14].teamDetailSetter("TeamB", "Senior");
        member[14].contactDetailSetter(0, 507813);
        member[14].joinedDateSetter(17, "Apr", 2009);

        member[15] = new Member(414, "Jane", "Gilmore", 5, 'F');
        member[15].teamDetailSetter("TeamA", "Junior");
        member[15].contactDetailSetter(153, 459558);
        member[15].joinedDateSetter(30, "May", 2007);

        member[16] = new Member(415, "William", "Taylor", 7, 'M');
        member[16].teamDetailSetter("TeamA", "Senior");
        member[16].contactDetailSetter(235, 137353);
        member[16].joinedDateSetter(27, "Nov", 2007);

        member[17] = new Member(461, "Robert", "Reed", 3, 'M');
        member[17].teamDetailSetter("TeamA", "Senior");
        member[17].contactDetailSetter(235, 994664);
        member[17].joinedDateSetter(5, "Aug", 2005);

        member[18] = new Member(469, "Carolyn", "Willis", 29, 'F');
        member[18].teamDetailSetter(null, "Junior");
        member[18].contactDetailSetter(0, 688378);
        member[18].joinedDateSetter(14, "Jan", 2011);

        member[19] = new Member(487, "Susan", "Kent", 0, 'F');
        member[19].teamDetailSetter(null, "Social");
        member[19].contactDetailSetter(0, 707217);
        member[19].joinedDateSetter(7, "Oct", 2010);

        // to display member's join date which is earlier than 07-Apr-2009
        System.out.println("Members who joined before 07-Apr-2009: \n");
        for (int i = 0; i < member.length; i++) {
            member[i].check1();
        }
        
        //to display records of all the senior members whose handicap score is less than 12.
        System.out.println("Senior members with handicap score less than 12: \n");
        for (int i = 0; i < member.length; i++) {
            member[i].check2();
        }

        //to display the records of all the female senior members who are part of TeamB.
        System.out.println("Senior Female members who are in Team B: \n");
        for (int i = 0; i < member.length; i++) {
            member[i].check3();
        }
    }
}
