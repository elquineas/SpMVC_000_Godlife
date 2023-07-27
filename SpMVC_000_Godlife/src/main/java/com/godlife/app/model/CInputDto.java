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
public class CInputDto {
	
	public String c_code; //	BIGINT	not null	primary key ,
	public String c_title; //	varchar(50)	NOT NULL,	
	public String c_write; //	varchar(20),
	public String c_start; //	varchar(20),		
	public String c_end; //	varchar(20),	
	public int c_count; //	int,		
	public String c_detail; // varchar(500)

}
