package com.memorize.domain.user;import jakarta.persistence.*;import lombok.AccessLevel;import lombok.Builder;import lombok.Getter;import lombok.NoArgsConstructor;import java.time.LocalDateTime;@Table(name = "users")@Entity@Getter@NoArgsConstructor(access = AccessLevel.PROTECTED)public class User {    @Id    @Column(name = "user_id")    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long userId;    @Column(name = "nickname", length = 20)    private String nickName;    @Column(name = "email")    private String email;    @Column(name = "password", nullable = true)    private String password;    @Column(name = "created_time")    private LocalDateTime createdTime;    @Builder    private User(String nickName, String email, String password) {        this.nickName = nickName;        this.email = email;        this.password = password;    }}