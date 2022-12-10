package pro.sky.telegrambot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.model.Notification_task;

public interface Notification_taskRepository extends JpaRepository<Notification_task, Long> {
}
