package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = false
)
