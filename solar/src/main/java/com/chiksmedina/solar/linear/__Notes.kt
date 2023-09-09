package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.notes.Archive
import com.chiksmedina.solar.linear.notes.ArchiveCheck
import com.chiksmedina.solar.linear.notes.ArchiveDown
import com.chiksmedina.solar.linear.notes.ArchiveDownMinimlistic
import com.chiksmedina.solar.linear.notes.ArchiveMinimalistic
import com.chiksmedina.solar.linear.notes.ArchiveUp
import com.chiksmedina.solar.linear.notes.ArchiveUpMinimlistic
import com.chiksmedina.solar.linear.notes.Clipboard
import com.chiksmedina.solar.linear.notes.ClipboardAdd
import com.chiksmedina.solar.linear.notes.ClipboardCheck
import com.chiksmedina.solar.linear.notes.ClipboardHeart
import com.chiksmedina.solar.linear.notes.ClipboardList
import com.chiksmedina.solar.linear.notes.ClipboardRemove
import com.chiksmedina.solar.linear.notes.ClipboardText
import com.chiksmedina.solar.linear.notes.Document
import com.chiksmedina.solar.linear.notes.DocumentAdd
import com.chiksmedina.solar.linear.notes.DocumentMedicine
import com.chiksmedina.solar.linear.notes.DocumentText
import com.chiksmedina.solar.linear.notes.Documents
import com.chiksmedina.solar.linear.notes.DocumentsMinimalistic
import com.chiksmedina.solar.linear.notes.Notebook
import com.chiksmedina.solar.linear.notes.Notes
import com.chiksmedina.solar.linear.notes.NotesMinimalistic
import kotlin.collections.List as ____KtList

public object NotesGroup

public val LinearGroup.Notes: NotesGroup
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
