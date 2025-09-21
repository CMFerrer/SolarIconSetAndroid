package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.notes.Archive
import dev.chiksmedina.solar.linear.notes.ArchiveCheck
import dev.chiksmedina.solar.linear.notes.ArchiveDown
import dev.chiksmedina.solar.linear.notes.ArchiveDownMinimlistic
import dev.chiksmedina.solar.linear.notes.ArchiveMinimalistic
import dev.chiksmedina.solar.linear.notes.ArchiveUp
import dev.chiksmedina.solar.linear.notes.ArchiveUpMinimlistic
import dev.chiksmedina.solar.linear.notes.Clipboard
import dev.chiksmedina.solar.linear.notes.ClipboardAdd
import dev.chiksmedina.solar.linear.notes.ClipboardCheck
import dev.chiksmedina.solar.linear.notes.ClipboardHeart
import dev.chiksmedina.solar.linear.notes.ClipboardList
import dev.chiksmedina.solar.linear.notes.ClipboardRemove
import dev.chiksmedina.solar.linear.notes.ClipboardText
import dev.chiksmedina.solar.linear.notes.Document
import dev.chiksmedina.solar.linear.notes.DocumentAdd
import dev.chiksmedina.solar.linear.notes.DocumentMedicine
import dev.chiksmedina.solar.linear.notes.DocumentText
import dev.chiksmedina.solar.linear.notes.Documents
import dev.chiksmedina.solar.linear.notes.DocumentsMinimalistic
import dev.chiksmedina.solar.linear.notes.Notebook
import dev.chiksmedina.solar.linear.notes.Notes
import dev.chiksmedina.solar.linear.notes.NotesMinimalistic
import kotlin.collections.List as KtList

object NotesGroup

val LinearSolar.Notes: NotesGroup
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
