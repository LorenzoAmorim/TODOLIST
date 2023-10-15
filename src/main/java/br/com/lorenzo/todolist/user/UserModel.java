package br.com.lorenzo.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

//lib lombok que define os getter e setter através do "@Data"
@Data
@Entity(name = "tb_users")
public class UserModel {

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;
}
