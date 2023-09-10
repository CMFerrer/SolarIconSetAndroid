package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
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
import kotlin.collections.List as KtList

object NotesGroup

val LineDuotoneSolar.Notes: NotesGroup
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
