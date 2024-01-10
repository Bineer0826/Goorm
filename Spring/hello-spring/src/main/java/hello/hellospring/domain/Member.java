package hello.hellospring.domain;

public class Member {
    //회원 아이디, 이름 필요

    private Long id; //고객이 정하는 아이디가 아닌 시스템이 저장하는 id
    private String name;

    //id와 이름에 대한 게터세터를 만들었다
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
