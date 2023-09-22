package com.mlorenzo.brewery.domain.security;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "login_successes")
public class LoginSuccess extends BaseEntity {
	private String sourceIp;
	
    @ManyToOne
    private User user;
}
