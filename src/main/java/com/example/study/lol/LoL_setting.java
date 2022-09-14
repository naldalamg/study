package com.example.study.lol;

public class LoL_setting {
    private int cool_time; //스킬 재사용 대기시간

    public int getCool_time() {
        return cool_time;
    }

    public void setCool_time(int cool_time) {
        this.cool_time = cool_time;
    }


    //룬
    public String[] rune = {"정밀" , "지배" , "마법" , "결의" , "영감"};


    //소환사주문
    public String 점멸(){
        System.out.println("점멸 사용 \n");
        setCool_time(30);
        return "flash";
    }
    public String 점화(){
        System.out.println("점화 사용 \n");
        setCool_time(25);
        return "ignite";
    }
    public String 탈진(){
        System.out.println("탈진 사용 \n");
        setCool_time(20);
        return "exhaust";
    }


}
