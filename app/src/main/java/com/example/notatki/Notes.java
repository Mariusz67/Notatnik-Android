package com.example.notatki;

public interface Notes {
    String TABLE_NAME = "notes";

    interface Columns {
        String NOTE_ID = "_id";
        String NOTE_TEXT = "note_text";
    }
}
