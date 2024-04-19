package com.example.springproject.event;

import com.example.springproject.model.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class SendInfoEvent extends ApplicationEvent {

    private User user;
    public SendInfoEvent(Object source, User user) {
        super(source);

        this.user = user;
        System.out.println("SendInfoEvent Đã tạo sự kiện thành công với dữ liệu cung cấp");
    }
}
