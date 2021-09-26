package com.Assessment.SocialMedia.DTOs;

import java.sql.Timestamp;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TweetResponseDTO {

	private Long id; 
	private String Content; 
	private Timestamp posted;
	private TweetResponseDTO inReplyTo;
	private TweetResponseDTO repostOf;
	private List<TweedleUserResponseDTO> likedBy;
	
}
