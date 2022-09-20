package com.group2.scheduler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USER")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uno;
	
	@Column(length = 50, nullable = false)
	private String id;

	@Column(length = 50, nullable = false)
	private String pw;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	
	@Getter
	@Setter
	@ToString
	@Builder
	public static class Request {
		
		private String idJoin;
		private String pwJoin;
		private String nameJoin;
		private String pwCheck;
		
		public UserEntity toEntity(Request user) {
			
			return UserEntity.builder().id(getIdJoin())
									.pw(getPwJoin())
									.name(getNameJoin())
									.build();
		}
	}
}
