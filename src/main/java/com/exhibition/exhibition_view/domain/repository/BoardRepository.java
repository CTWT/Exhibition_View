package com.exhibition.exhibition_view.domain.repository;

import com.exhibition.exhibition_view.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
