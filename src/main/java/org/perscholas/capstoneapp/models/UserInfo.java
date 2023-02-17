package org.perscholas.capstoneapp.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user_info")
@Slf4j
@Setter
@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NonNull
    String fName;
    @NonNull
    String lName;
    @NonNull
    String address;
    @NonNull
    int portfolioID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return fName.equals(userInfo.fName) && lName.equals(userInfo.lName) && address.equals(userInfo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, address);
    }
}
