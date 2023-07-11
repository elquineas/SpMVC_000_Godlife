package com.godlife.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDto {
	private long s_seq;//	bigint		PRIMARY KEY
	private String s_memo;//	varchar(125)	NOT NULL	
	private String s_sDate;//	varchar(20)		
	private String s_eDate;//	varchar(20)		
	private long s_count;//	bigint		
	private String s_share;//	varchar(10)	NOT NULL	
	private String s_useyn;//	varchar(2)	NOT NULL	
}
