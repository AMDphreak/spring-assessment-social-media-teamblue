package com.Assessment.SocialMedia.DTOs;

import java.util.List;

import com.Assessment.SocialMedia.entities.Tweet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContextDTO {
	private Tweet target;
	private List<Tweet> before;
	private List<Tweet> after;
}
