package org.example.todolist.controller.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoteForm {

    private UUID id;
    private String title;
    private String content;
    private UUID categoryId;
}
