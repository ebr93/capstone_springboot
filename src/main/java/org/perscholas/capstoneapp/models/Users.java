package org.perscholas.capstoneapp.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor
@Entity
@Table(name = "users")
@Slf4j
@Setter
@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NonNull
    String email;
    @NonNull
    String password;
    @NonNull
    int infoID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return email.equals(users.email) && password.equals(users.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }
}
