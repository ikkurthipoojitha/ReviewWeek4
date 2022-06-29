package com.bridgelabz.AddressBook;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    ArrayList<ContactList> list = new ArrayList<>();
    public AddressBook(){

    }

    public void search(String fName){

        Iterator<ContactList> iterator = list.listIterator();
        while(iterator.hasNext()){
            ContactList contactList = iterator.next();
            if(fName.equals(contactList.getfName())){
                System.out.println("found fname");
            }
        }

    }

}
