import java.util.*;
public class BloodDonation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Donor Blood Group : ");
        String bDonate=scan.nextLine();
        System.out.println("Enter Patient Blood Group : ");
        String bNeeded=scan.nextLine();
        boolean eligible=false;
        if(bDonate.equals(bNeeded)){
            System.out.println("Enter Donor Age : ");
            int age = scan.nextInt();
            System.out.println("Enter Donor Weight : ");
            int weight = scan.nextInt();
            if(age >= 18 && weight >= 45) {
                System.out.println("Blood donation successful ");
                eligible=!eligible;
            }
            else if(age < 18 ){
                System.out.println("Donar Not in legal age range");
            }
            else if(weight > 45) System.err.println("Donar not in elegible weight renge");
        }
        if(!eligible) System.out.println("Blood Not Match with Donor");

    }
}
