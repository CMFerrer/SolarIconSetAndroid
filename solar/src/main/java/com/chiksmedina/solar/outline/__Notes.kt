package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.notes.Archive
import com.chiksmedina.solar.outline.notes.ArchiveCheck
import com.chiksmedina.solar.outline.notes.ArchiveDown
import com.chiksmedina.solar.outline.notes.ArchiveDownMinimlistic
import com.chiksmedina.solar.outline.notes.ArchiveMinimalistic
import com.chiksmedina.solar.outline.notes.ArchiveUp
import com.chiksmedina.solar.outline.notes.ArchiveUpMinimlistic
import com.chiksmedina.solar.outline.notes.Clipboard
import com.chiksmedina.solar.outline.notes.ClipboardAdd
import com.chiksmedina.solar.outline.notes.ClipboardCheck
import com.chiksmedina.solar.outline.notes.ClipboardHeart
import com.chiksmedina.solar.outline.notes.ClipboardList
import com.chiksmedina.solar.outline.notes.ClipboardRemove
import com.chiksmedina.solar.outline.notes.ClipboardText
import com.chiksmedina.solar.outline.notes.Document
import com.chiksmedina.solar.outline.notes.DocumentAdd
import com.chiksmedina.solar.outline.notes.DocumentMedicine
import com.chiksmedina.solar.outline.notes.DocumentText
import com.chiksmedina.solar.outline.notes.Documents
import com.chiksmedina.solar.outline.notes.DocumentsMinimalistic
import com.chiksmedina.solar.outline.notes.Notebook
import com.chiksmedina.solar.outline.notes.Notes
import com.chiksmedina.solar.outline.notes.NotesMinimalistic
import kotlin.collections.List as ____KtList

public object NotesGroup

public val OutlineGroup.Notes: NotesGroup
  get() = NotesGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NotesGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Archive, ArchiveCheck, ArchiveDown, ArchiveDownMinimlistic,
        ArchiveMinimalistic, ArchiveUp, ArchiveUpMinimlistic, Clipboard, ClipboardAdd,
        ClipboardCheck, ClipboardHeart, ClipboardList, ClipboardRemove, ClipboardText, Document,
        Documents, DocumentsMinimalistic, DocumentAdd, DocumentMedicine, DocumentText, Notebook,
        Notes, NotesMinimalistic)
    return __AllIcons!!
  }
