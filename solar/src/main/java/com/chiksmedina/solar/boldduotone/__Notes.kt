package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.notes.Archive
import com.chiksmedina.solar.boldduotone.notes.ArchiveCheck
import com.chiksmedina.solar.boldduotone.notes.ArchiveDown
import com.chiksmedina.solar.boldduotone.notes.ArchiveDownMinimlistic
import com.chiksmedina.solar.boldduotone.notes.ArchiveMinimalistic
import com.chiksmedina.solar.boldduotone.notes.ArchiveUp
import com.chiksmedina.solar.boldduotone.notes.ArchiveUpMinimlistic
import com.chiksmedina.solar.boldduotone.notes.Clipboard
import com.chiksmedina.solar.boldduotone.notes.ClipboardAdd
import com.chiksmedina.solar.boldduotone.notes.ClipboardCheck
import com.chiksmedina.solar.boldduotone.notes.ClipboardHeart
import com.chiksmedina.solar.boldduotone.notes.ClipboardList
import com.chiksmedina.solar.boldduotone.notes.ClipboardRemove
import com.chiksmedina.solar.boldduotone.notes.ClipboardText
import com.chiksmedina.solar.boldduotone.notes.Document
import com.chiksmedina.solar.boldduotone.notes.DocumentAdd
import com.chiksmedina.solar.boldduotone.notes.DocumentMedicine
import com.chiksmedina.solar.boldduotone.notes.DocumentText
import com.chiksmedina.solar.boldduotone.notes.Documents
import com.chiksmedina.solar.boldduotone.notes.DocumentsMinimalistic
import com.chiksmedina.solar.boldduotone.notes.Notebook
import com.chiksmedina.solar.boldduotone.notes.Notes
import com.chiksmedina.solar.boldduotone.notes.NotesMinimalistic
import kotlin.collections.List as ____KtList

public object NotesGroup

public val BoldduotoneGroup.Notes: NotesGroup
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
