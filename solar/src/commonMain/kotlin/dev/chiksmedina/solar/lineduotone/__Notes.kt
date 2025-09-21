package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.notes.Archive
import dev.chiksmedina.solar.lineduotone.notes.ArchiveCheck
import dev.chiksmedina.solar.lineduotone.notes.ArchiveDown
import dev.chiksmedina.solar.lineduotone.notes.ArchiveDownMinimlistic
import dev.chiksmedina.solar.lineduotone.notes.ArchiveMinimalistic
import dev.chiksmedina.solar.lineduotone.notes.ArchiveUp
import dev.chiksmedina.solar.lineduotone.notes.ArchiveUpMinimlistic
import dev.chiksmedina.solar.lineduotone.notes.Clipboard
import dev.chiksmedina.solar.lineduotone.notes.ClipboardAdd
import dev.chiksmedina.solar.lineduotone.notes.ClipboardCheck
import dev.chiksmedina.solar.lineduotone.notes.ClipboardHeart
import dev.chiksmedina.solar.lineduotone.notes.ClipboardList
import dev.chiksmedina.solar.lineduotone.notes.ClipboardRemove
import dev.chiksmedina.solar.lineduotone.notes.ClipboardText
import dev.chiksmedina.solar.lineduotone.notes.Document
import dev.chiksmedina.solar.lineduotone.notes.DocumentAdd
import dev.chiksmedina.solar.lineduotone.notes.DocumentMedicine
import dev.chiksmedina.solar.lineduotone.notes.DocumentText
import dev.chiksmedina.solar.lineduotone.notes.Documents
import dev.chiksmedina.solar.lineduotone.notes.DocumentsMinimalistic
import dev.chiksmedina.solar.lineduotone.notes.Notebook
import dev.chiksmedina.solar.lineduotone.notes.Notes
import dev.chiksmedina.solar.lineduotone.notes.NotesMinimalistic
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
