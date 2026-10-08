//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("tom","Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(0);
    }
}