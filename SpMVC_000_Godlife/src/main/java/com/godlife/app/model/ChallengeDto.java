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
public class ChallengeDto {
	private long c_seq;//	bigint		PRIMARY KEY
	private String c_memo;//	varchar(125)		
	private String c_sDate;//	varchar(10)		
	private String c_eDate;//	varchar(10)		
	private long c_count;//	bigint		
	private String c_share;//	varchar(2)	NOT NULL	
	private String c_useyn;//	varchar(2)	NOT NULL	
}
