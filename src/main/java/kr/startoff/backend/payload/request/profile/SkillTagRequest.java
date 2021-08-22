package kr.startoff.backend.payload.request.profile;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SkillTagRequest {
	private String skillName;

	public SkillTagRequest(String skillName) {
		this.skillName = skillName;
	}
}
