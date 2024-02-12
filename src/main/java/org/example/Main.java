package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members = List.of(
                new Member("しろくま", 23),
                new Member("とんかつ", 29),
                new Member("ねこ", 54),
                new Member("エビフライ", 19),
                new Member("ペンギン", 15)
        );
        List<String> result = members.stream()
                .filter(member -> member.getAge() >= 20).map(Member::getName)
                .toList();
        System.out.println(result);
    }
}
