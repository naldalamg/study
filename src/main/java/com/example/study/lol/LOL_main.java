package com.example.study.lol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Timer;
import java.util.TimerTask;

@Controller
public class LOL_main {

    static int count = 0;

    @RequestMapping(value="/start")
    public String lol_start(){

        String q = "q";
        String w = "w";
        String e = "e";
        String r = "r";

        Heimerdinger heimerdinger = new Heimerdinger();
        Timer timer = new Timer();

        String spell = heimerdinger.ingame(q,w,e,r);

        if(spell != null) {
            int cool_time = heimerdinger.getCool_time();
            System.out.println(spell + " cool_time " + cool_time + "초 시작");

            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    if (count < cool_time){
                        System.out.print(count+" ");
                        count++;
                    } else {
                        timer.cancel();
                        System.out.println("\n" + spell + " 재사용 가능");
                    }
                }
            };
            timer.schedule(task, 1000, 1000);
        }
        return "home";
    }

}
