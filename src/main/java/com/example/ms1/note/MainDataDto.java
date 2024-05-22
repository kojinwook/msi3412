package com.example.ms1.note;


import com.example.ms1.note.note.Note;
import com.example.ms1.note.note.tag.tag.Tag;
import com.example.ms1.note.notebook.Notebook;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MainDataDto {
    List<Notebook> notebookList = new ArrayList<>();
    List<Note> noteList = new ArrayList<>();
    List<Tag> tagList = new ArrayList<>();
    List<Notebook> searchedNotebookList = new ArrayList<>();
    List<Note> searchedNoteList = new ArrayList<>();
    Notebook targetNotebook;
    Note targetNote;


}
