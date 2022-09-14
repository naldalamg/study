package com.example.study.lol;

import org.springframework.web.bind.annotation.GetMapping;

public class Heimerdinger extends LoL_setting implements Skill_Q, Skill_E, Skill_W, Skill_R {

    public static int 마나=385, 체력=558; // (lv.1일 때)

    public String ingame(String q, String w, String e, String r){

        System.out.println("[하이머딩거]");
        System.out.println("룬 선택 (" + rune[2] + "), lv1 마나 : "+ 마나 +", 체력 : " + 체력 + "\n");
        String spell = 탈진();
        skill_Q(q);
        skill_Q(q,r);
        skill_E(e,r);

        return spell;
    }

    //interface 재정의
    //Overriding
    public void skill_Q(String q){
        System.out.println("q : H-28G 진화형 포탑 \n");
    }
    //Overriding & Overloading
    public void skill_Q(String q, String r){
        skill_R(r);
        System.out.println("Q : H-28Q 최첨단 포탑 \n");
    }
    @Override
    public void skill_W(String w) {
        System.out.println("w : 마법공학 초소형 로켓 \n");
    }

    @Override
    public void skill_W(String w, String r) {
        skill_R(r);
        System.out.println("W : 마법공학 로켓 연사 \n");
    }

    @Override
    public void skill_E(String e) {
        System.out.println("e : CH-2 전자폭풍 수류탄 \n");
    }

    @Override
    public void skill_E(String e, String r) {
        skill_R(r);
        System.out.println("E : CH-3X 전격 수류탄 \n");
    }

    @Override
    public void skill_R(String r) {
        System.out.println("R : 업그레이드!!!");
    }
}
