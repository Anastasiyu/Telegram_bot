package pro.sky.telegrambot.model;

import lombok.Getter;
import lombok.Setter;

import org.telegram.telegrambots.api.methods.send.SendMessage;

import org.telegram.telegrambots.exceptions.TelegramApiException;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Notification_task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    final int RECONNECT_PAUSE = 10_000;
private String task;
private LocalDateTime data;
private LocalDateTime time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
