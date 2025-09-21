package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.notes.Archive
import dev.chiksmedina.solar.outline.notes.ArchiveCheck
import dev.chiksmedina.solar.outline.notes.ArchiveDown
import dev.chiksmedina.solar.outline.notes.ArchiveDownMinimlistic
import dev.chiksmedina.solar.outline.notes.ArchiveMinimalistic
import dev.chiksmedina.solar.outline.notes.ArchiveUp
import dev.chiksmedina.solar.outline.notes.ArchiveUpMinimlistic
import dev.chiksmedina.solar.outline.notes.Clipboard
import dev.chiksmedina.solar.outline.notes.ClipboardAdd
import dev.chiksmedina.solar.outline.notes.ClipboardCheck
import dev.chiksmedina.solar.outline.notes.ClipboardHeart
import dev.chiksmedina.solar.outline.notes.ClipboardList
import dev.chiksmedina.solar.outline.notes.ClipboardRemove
import dev.chiksmedina.solar.outline.notes.ClipboardText
import dev.chiksmedina.solar.outline.notes.Document
import dev.chiksmedina.solar.outline.notes.DocumentAdd
import dev.chiksmedina.solar.outline.notes.DocumentMedicine
import dev.chiksmedina.solar.outline.notes.DocumentText
import dev.chiksmedina.solar.outline.notes.Documents
import dev.chiksmedina.solar.outline.notes.DocumentsMinimalistic
import dev.chiksmedina.solar.outline.notes.Notebook
import dev.chiksmedina.solar.outline.notes.Notes
import dev.chiksmedina.solar.outline.notes.NotesMinimalistic
import kotlin.collections.List as KtList

object NotesGroup

val OutlineSolar.Notes: NotesGroup
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
