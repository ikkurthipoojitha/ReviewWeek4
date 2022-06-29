package com.bridgelabz.AddressBook;

import javax.naming.CompositeName;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<ContactList> listContact = new ArrayList<ContactList>();

        ContactList contactList1 = new ContactList("a","b","guntur");
        ContactList contactList2 = new ContactList("g","j","Hyderabad");
        ContactList contactList3 = new ContactList("LA","hj","kolkaata");


        listContact.add(contactList1);
        listContact.add(contactList2);
        listContact.add(contactList3);


    }
}
