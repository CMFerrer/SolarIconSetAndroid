package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.notes.Archive
import com.chiksmedina.solar.bold.notes.ArchiveCheck
import com.chiksmedina.solar.bold.notes.ArchiveDown
import com.chiksmedina.solar.bold.notes.ArchiveDownMinimlistic
import com.chiksmedina.solar.bold.notes.ArchiveMinimalistic
import com.chiksmedina.solar.bold.notes.ArchiveUp
import com.chiksmedina.solar.bold.notes.ArchiveUpMinimlistic
import com.chiksmedina.solar.bold.notes.Clipboard
import com.chiksmedina.solar.bold.notes.ClipboardAdd
import com.chiksmedina.solar.bold.notes.ClipboardCheck
import com.chiksmedina.solar.bold.notes.ClipboardHeart
import com.chiksmedina.solar.bold.notes.ClipboardList
import com.chiksmedina.solar.bold.notes.ClipboardRemove
import com.chiksmedina.solar.bold.notes.ClipboardText
import com.chiksmedina.solar.bold.notes.Document
import com.chiksmedina.solar.bold.notes.DocumentAdd
import com.chiksmedina.solar.bold.notes.DocumentMedicine
import com.chiksmedina.solar.bold.notes.DocumentText
import com.chiksmedina.solar.bold.notes.Documents
import com.chiksmedina.solar.bold.notes.DocumentsMinimalistic
import com.chiksmedina.solar.bold.notes.Notebook
import com.chiksmedina.solar.bold.notes.Notes
import com.chiksmedina.solar.bold.notes.NotesMinimalistic
import kotlin.collections.List as KtList

object NotesGroup

val BoldSolar.Notes: NotesGroup
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
