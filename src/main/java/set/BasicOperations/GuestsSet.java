package main.java.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {
    private Set<Guest> guestSet;

    public GuestsSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int inviteCode) {
        guestSet.add(new Guest(name, inviteCode));
    }

    public void removeGuestByInviteCode(int inviteCode) {
        for (Guest guest: guestSet) {
            if (guest.getInviteCode() == inviteCode) {
                guestSet.remove(guest);
                break;
            }
        }
    }
    public int guestAmount() {
        return guestSet.size();
    }
    public void showGuests() {
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        GuestsSet guestsSet = new GuestsSet();

        guestsSet.addGuest("Joao", 1);
        guestsSet.addGuest("Mica", 2);
        guestsSet.addGuest("Matheus", 3);
        guestsSet.addGuest("Carlos", 3);
        guestsSet.addGuest("Marcos", 4);

        guestsSet.showGuests();
        System.out.println(guestsSet.guestAmount());
    }
}
