package com.bridgelabz.AddressBook;

import java.util.*;

import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        AddressBook addressBook1 = new AddressBook();
        AddressBook addressBook2 = new AddressBook();
        AddressBook addressBook3 = new AddressBook();

        List<Contact1> Contact = new ArrayList<Contact1>();

        Contact1 contact1 = new Contact1("a","b","guntur");
        Contact1 contact2 = new Contact1("g","j","Hyderabad");
        Contact1 contact3 = new Contact1("LA","hj","Bangalore");
        Contact1 contact4 = new Contact1("Poojitha","Ikkurthi","Mumbai");
        Contact1 contact5 = new Contact1("pooja","hj","Bangalore");
        Contact1 contact6 = new Contact1("Radha","ik","Bangalore");

        addressBook1.list.add(contact1);
        addressBook1.list.add(contact2);

        addressBook2.list.add(contact3);
        addressBook2.list.add(contact4);

        addressBook3.list.add(contact5);
        addressBook3.list.add(contact6);

        Map<String, AddressBook> addressBookMap = new LinkedHashMap<>();
        addressBookMap.put("addressBook1", addressBook1);
        addressBookMap.put("addressBook2", addressBook2);
        addressBookMap.put("addressBook3", addressBook3);
        
        Map<String, List<Contact1>> cityMap = new LinkedHashMap<>();

        for(Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {

            AddressBook addressBook = addressBookMap.get(entry.getKey());
            addressBook.list.stream().forEach(element -> {
                if(cityMap.containsKey(element.getCity())) {
                    List<Contact1> list = cityMap.get(element.getCity());
                    list.add(element);
                } else {
                    List<Contact1> list = new ArrayList<>();
                    list.add(element);
                    cityMap.put(element.getCity(), list);
                }
            });
        }
        System.out.println(cityMap);
    }
}
