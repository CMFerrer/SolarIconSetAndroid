package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.notes.Archive
import dev.chiksmedina.solar.bold.notes.ArchiveCheck
import dev.chiksmedina.solar.bold.notes.ArchiveDown
import dev.chiksmedina.solar.bold.notes.ArchiveDownMinimlistic
import dev.chiksmedina.solar.bold.notes.ArchiveMinimalistic
import dev.chiksmedina.solar.bold.notes.ArchiveUp
import dev.chiksmedina.solar.bold.notes.ArchiveUpMinimlistic
import dev.chiksmedina.solar.bold.notes.Clipboard
import dev.chiksmedina.solar.bold.notes.ClipboardAdd
import dev.chiksmedina.solar.bold.notes.ClipboardCheck
import dev.chiksmedina.solar.bold.notes.ClipboardHeart
import dev.chiksmedina.solar.bold.notes.ClipboardList
import dev.chiksmedina.solar.bold.notes.ClipboardRemove
import dev.chiksmedina.solar.bold.notes.ClipboardText
import dev.chiksmedina.solar.bold.notes.Document
import dev.chiksmedina.solar.bold.notes.DocumentAdd
import dev.chiksmedina.solar.bold.notes.DocumentMedicine
import dev.chiksmedina.solar.bold.notes.DocumentText
import dev.chiksmedina.solar.bold.notes.Documents
import dev.chiksmedina.solar.bold.notes.DocumentsMinimalistic
import dev.chiksmedina.solar.bold.notes.Notebook
import dev.chiksmedina.solar.bold.notes.Notes
import dev.chiksmedina.solar.bold.notes.NotesMinimalistic
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
