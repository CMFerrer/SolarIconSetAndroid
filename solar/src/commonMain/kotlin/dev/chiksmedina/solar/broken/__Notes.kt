package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.notes.Archive
import dev.chiksmedina.solar.broken.notes.ArchiveCheck
import dev.chiksmedina.solar.broken.notes.ArchiveDown
import dev.chiksmedina.solar.broken.notes.ArchiveDownMinimlistic
import dev.chiksmedina.solar.broken.notes.ArchiveMinimalistic
import dev.chiksmedina.solar.broken.notes.ArchiveUp
import dev.chiksmedina.solar.broken.notes.ArchiveUpMinimlistic
import dev.chiksmedina.solar.broken.notes.Clipboard
import dev.chiksmedina.solar.broken.notes.ClipboardAdd
import dev.chiksmedina.solar.broken.notes.ClipboardCheck
import dev.chiksmedina.solar.broken.notes.ClipboardHeart
import dev.chiksmedina.solar.broken.notes.ClipboardList
import dev.chiksmedina.solar.broken.notes.ClipboardRemove
import dev.chiksmedina.solar.broken.notes.ClipboardText
import dev.chiksmedina.solar.broken.notes.Document
import dev.chiksmedina.solar.broken.notes.DocumentAdd
import dev.chiksmedina.solar.broken.notes.DocumentMedicine
import dev.chiksmedina.solar.broken.notes.DocumentText
import dev.chiksmedina.solar.broken.notes.Documents
import dev.chiksmedina.solar.broken.notes.DocumentsMinimalistic
import dev.chiksmedina.solar.broken.notes.Notebook
import dev.chiksmedina.solar.broken.notes.Notes
import dev.chiksmedina.solar.broken.notes.NotesMinimalistic
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
