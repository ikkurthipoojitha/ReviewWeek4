package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {

    ArrayList<ContactList> list = new ArrayList<>();
    public AddressBook(){

    }

    public ContactList search(String fName){

        Iterator<ContactList> iterator = list.listIterator();
        while(iterator.hasNext()){
            ContactList contactList = iterator.next();
            if(fName.equals(contactList.getfName())){
                return contactList;

            }
        }

        return null;
    }

}
