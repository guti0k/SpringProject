package com.example.springproject.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;


@Component
@EnableAsync
public class MessageListener {
    @Async
    @EventListener
    public void handleMessage(SendInfoEvent sendInfoEvent) throws InterruptedException {
        Thread.sleep(2000);

        System.out.println("Sau khi bắt sự kiện thành công, hàm handleMessage đã ngủ 2s rồi thực thi công việc async");
        System.out.println("Info user: " + sendInfoEvent.getUser().toString());
    }
}
