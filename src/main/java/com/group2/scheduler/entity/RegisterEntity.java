package com.group2.scheduler.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "REGISTER")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterEntity {
	
	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT 
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="uno")
	private UserEntity userEntity;
	
	@ManyToOne
	@JoinColumn(name="lno")
	private LectureEntity lectureEntity;
}
