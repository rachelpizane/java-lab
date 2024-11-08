package com.rachelpzm.POO.aula03;

import java.util.ArrayList;

public class Perfil {
    private String name;
    private int age;
    private ArrayList<String> friends;

    public Perfil(String name, int age, ArrayList<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public Perfil(String name, int age) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void addFriend(String nameFriend){
        friends.add(nameFriend);
        System.out.println("This friend has been successfully added");
    }

    public void removeFriend(String nameFriend){
        String answer = "This friend does not exist....";

        if (friends.contains(nameFriend)){
            friends.remove(nameFriend);
            answer = "This friend has been successfully removed";
        }

        System.out.println(answer);
    }

    public void isPopular(){
        String answer = "You aren't popular...";

        if(friends.size() >= 2) {
            answer = "You are sooo popular!";
        }

        System.out.println(answer);
    }

    public void status(){
        String stringFriends = String.join(", ", friends);

        if(friends.isEmpty()){
            stringFriends = "**Empty**";
        }

        String message = "-------------- PERFIL --------------%n" + "Name: %s%nAge: %d%nFriend(s): %s%n" + "----------------------%n";

        System.out.printf(message, this.name, this.age, stringFriends);
    }

}
