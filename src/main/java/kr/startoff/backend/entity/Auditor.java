package kr.startoff.backend.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditor {
	@CreatedDate
	@Column(name = "created_at", updatable = false)
	LocalDateTime createdAt;

	@LastModifiedDate
	@Column(name = "updated_at")
	LocalDateTime updatedAt;

}
