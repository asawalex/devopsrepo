package org.example.devopsproject.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data

public class UserModel {
    @Generated()
    private Long id;
    private String name;
    private String email;
}
