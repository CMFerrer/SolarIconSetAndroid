package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.notes.Archive
import com.chiksmedina.solar.broken.notes.ArchiveCheck
import com.chiksmedina.solar.broken.notes.ArchiveDown
import com.chiksmedina.solar.broken.notes.ArchiveDownMinimlistic
import com.chiksmedina.solar.broken.notes.ArchiveMinimalistic
import com.chiksmedina.solar.broken.notes.ArchiveUp
import com.chiksmedina.solar.broken.notes.ArchiveUpMinimlistic
import com.chiksmedina.solar.broken.notes.Clipboard
import com.chiksmedina.solar.broken.notes.ClipboardAdd
import com.chiksmedina.solar.broken.notes.ClipboardCheck
import com.chiksmedina.solar.broken.notes.ClipboardHeart
import com.chiksmedina.solar.broken.notes.ClipboardList
import com.chiksmedina.solar.broken.notes.ClipboardRemove
import com.chiksmedina.solar.broken.notes.ClipboardText
import com.chiksmedina.solar.broken.notes.Document
import com.chiksmedina.solar.broken.notes.DocumentAdd
import com.chiksmedina.solar.broken.notes.DocumentMedicine
import com.chiksmedina.solar.broken.notes.DocumentText
import com.chiksmedina.solar.broken.notes.Documents
import com.chiksmedina.solar.broken.notes.DocumentsMinimalistic
import com.chiksmedina.solar.broken.notes.Notebook
import com.chiksmedina.solar.broken.notes.Notes
import com.chiksmedina.solar.broken.notes.NotesMinimalistic
import kotlin.collections.List as KtList

object NotesGroup

val BrokenSolar.Notes: NotesGroup
    get() = NotesGroup

private var _AllIcons: KtList<ImageVector>? = null

val NotesGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Archive, ArchiveCheck, ArchiveDown, ArchiveDownMinimlistic,
            ArchiveMinimalistic, ArchiveUp, ArchiveUpMinimlistic, Clipboard, ClipboardAdd,
            ClipboardCheck, ClipboardHeart, ClipboardList, ClipboardRemove, ClipboardText, Document,
            Documents, DocumentsMinimalistic, DocumentAdd, DocumentMedicine, DocumentText, Notebook,
            Notes, NotesMinimalistic
        )
        return _AllIcons!!
    }
