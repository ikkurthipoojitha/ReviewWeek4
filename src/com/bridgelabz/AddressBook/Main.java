package com.bridgelabz.AddressBook;

import javax.naming.CompositeName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;




public class Main {
    public static void main(String[] args) {


        Map<String,List<ContactList>> cityMap = new LinkedHashMap<>();
        AddressBook addressBook = new AddressBook();
        List<ContactList> listContact = new ArrayList<ContactList>();

        ContactList contactList1 = new ContactList("a","b","guntur");
        ContactList contactList2 = new ContactList("g","j","Hyderabad");
        ContactList contactList3 = new ContactList("LA","hj","kolkaata");


        addressBook.list.add(contactList1);
        addressBook.list.add(contactList2);
        addressBook.list.add(contactList3);




    }
}
