public class Excercise_2 {
    public static void main(String[] args) {
    }
    // Excercise 1
    Public class Candidate{
        private final int candidateID;
        private String name;
        private String party;


        Public Candidate(int candidateID, String name, String party){
            this.candidateID = candidateID;
            this.name = name;
            this.party = party;
        }
    }

    // Excercise 2
    Public class Voter{
        private final int voterID;
        private String name;
        private boolean hasVoted;


        Public Candidate(int v, String n, boolean hasV){
            voterID = v;
            name = n;
            hasVoted = hasV;
        }
    }



    //Excercise 3
    public class Utility (){
        private String firstName;
        private String lastName;


        public String printInfoC(){
            System.out.println("Candidate ID" + candidateID + "Name" + name + "Party" + party);
        }
        public String printInfoV(){
            System.out.println("Voter ID" + v + "Name" + n + "Party" + p);
        }


        public String getFirstNameC(){
            return this.firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

}
