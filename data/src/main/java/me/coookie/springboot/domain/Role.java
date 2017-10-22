package me.coookie.springboot.domain;

import lombok.Data;

/**
 * Created by cookie on 2017/10/22.
 */
@Data
public class Role {
    private Long id;
    private String name;
    private String description;
    private int disabled;
}
