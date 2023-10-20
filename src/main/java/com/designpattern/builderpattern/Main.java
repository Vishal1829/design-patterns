package com.designpattern.builderpattern;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                    .setEmailId("vishal@gmail.com")
                    .setUserId("vishal1829")
                    .setUserName("Vishal")
                    .build();

        User user2 = User.UserBuilder.builder()
                    .setEmailId("vishal@gmail.com")
                    .setUserId("vishal1829")
                    .setUserName("Vishal")
                    .build();
        System.out.println(user2);
    }
}

/*
Builder Design Pattern:-
while creating object when object contain many attributes then many problem can exists:
  1. we have to pass many arguments to create object.
  2. some parameters might be optional.
  3. factory class takes all responsibility for creating object. If the object is heavy then all complexity is the part of   factory class.

So in builder pattern we create object step by step and finally return final object with desired value of attributes.

Note:- so here we have make the attributes of object immutable using the builder pattern.
*/
