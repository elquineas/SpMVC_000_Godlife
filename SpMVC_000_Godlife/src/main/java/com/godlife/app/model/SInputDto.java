package com.godlife.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class SInputDto {
	
	public String s_code; //	BIGINT	not null	primary key ,
	public String s_title; //	varchar(50)	NOT NULL,	
	public String s_write; //	varchar(20),
	public String s_start; //	varchar(20),		
	public String s_end; //	varchar(20),	
	public String s_detail; // varchar(500)

}
