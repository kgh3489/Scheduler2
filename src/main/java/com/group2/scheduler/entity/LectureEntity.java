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
@Table(name = "LECTURE")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LectureEntity {
	
	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT 
	private Integer lno;
	
	@Column(length = 50, nullable = false)
	private String day;
	
	@Column(length = 50, nullable = false)
	private String time;
	
	@Column(length = 50, nullable = false)
	private String title;
	
	@Column(length = 50, nullable = false)
	private String tutor;
	
	@Column(nullable = false)
	private Integer fixedNum;
}
