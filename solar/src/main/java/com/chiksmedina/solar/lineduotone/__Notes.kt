package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.notes.Archive
import com.chiksmedina.solar.lineduotone.notes.ArchiveCheck
import com.chiksmedina.solar.lineduotone.notes.ArchiveDown
import com.chiksmedina.solar.lineduotone.notes.ArchiveDownMinimlistic
import com.chiksmedina.solar.lineduotone.notes.ArchiveMinimalistic
import com.chiksmedina.solar.lineduotone.notes.ArchiveUp
import com.chiksmedina.solar.lineduotone.notes.ArchiveUpMinimlistic
import com.chiksmedina.solar.lineduotone.notes.Clipboard
import com.chiksmedina.solar.lineduotone.notes.ClipboardAdd
import com.chiksmedina.solar.lineduotone.notes.ClipboardCheck
import com.chiksmedina.solar.lineduotone.notes.ClipboardHeart
import com.chiksmedina.solar.lineduotone.notes.ClipboardList
import com.chiksmedina.solar.lineduotone.notes.ClipboardRemove
import com.chiksmedina.solar.lineduotone.notes.ClipboardText
import com.chiksmedina.solar.lineduotone.notes.Document
import com.chiksmedina.solar.lineduotone.notes.DocumentAdd
import com.chiksmedina.solar.lineduotone.notes.DocumentMedicine
import com.chiksmedina.solar.lineduotone.notes.DocumentText
import com.chiksmedina.solar.lineduotone.notes.Documents
import com.chiksmedina.solar.lineduotone.notes.DocumentsMinimalistic
import com.chiksmedina.solar.lineduotone.notes.Notebook
import com.chiksmedina.solar.lineduotone.notes.Notes
import com.chiksmedina.solar.lineduotone.notes.NotesMinimalistic
import kotlin.collections.List as ____KtList

public object NotesGroup

public val LineduotoneGroup.Notes: NotesGroup
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
