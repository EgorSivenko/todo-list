package org.example.todolist.repository;

import org.example.todolist.entity.Category;
import org.example.todolist.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NoteRepository extends JpaRepository<Note, UUID> {

    @Query("FROM Note n WHERE n.user.username = :username ORDER BY n.createdOn")
    List<Note> findByUsernameInCreationOrder(String username);

    @Query("FROM Note n WHERE n.user.username = :username ORDER BY n.lastUpdatedOn DESC")
    List<Note> findByUsernameInLastUpdateOrder(String username);

    List<Note> findByCategoryOrderByCreatedOn(Category category);

    List<Note> findByCategoryOrderByLastUpdatedOnDesc(Category category);
}
