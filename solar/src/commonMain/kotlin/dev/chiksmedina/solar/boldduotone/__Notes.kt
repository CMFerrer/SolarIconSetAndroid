package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.notes.Archive
import dev.chiksmedina.solar.boldduotone.notes.ArchiveCheck
import dev.chiksmedina.solar.boldduotone.notes.ArchiveDown
import dev.chiksmedina.solar.boldduotone.notes.ArchiveDownMinimlistic
import dev.chiksmedina.solar.boldduotone.notes.ArchiveMinimalistic
import dev.chiksmedina.solar.boldduotone.notes.ArchiveUp
import dev.chiksmedina.solar.boldduotone.notes.ArchiveUpMinimlistic
import dev.chiksmedina.solar.boldduotone.notes.Clipboard
import dev.chiksmedina.solar.boldduotone.notes.ClipboardAdd
import dev.chiksmedina.solar.boldduotone.notes.ClipboardCheck
import dev.chiksmedina.solar.boldduotone.notes.ClipboardHeart
import dev.chiksmedina.solar.boldduotone.notes.ClipboardList
import dev.chiksmedina.solar.boldduotone.notes.ClipboardRemove
import dev.chiksmedina.solar.boldduotone.notes.ClipboardText
import dev.chiksmedina.solar.boldduotone.notes.Document
import dev.chiksmedina.solar.boldduotone.notes.DocumentAdd
import dev.chiksmedina.solar.boldduotone.notes.DocumentMedicine
import dev.chiksmedina.solar.boldduotone.notes.DocumentText
import dev.chiksmedina.solar.boldduotone.notes.Documents
import dev.chiksmedina.solar.boldduotone.notes.DocumentsMinimalistic
import dev.chiksmedina.solar.boldduotone.notes.Notebook
import dev.chiksmedina.solar.boldduotone.notes.Notes
import dev.chiksmedina.solar.boldduotone.notes.NotesMinimalistic
import kotlin.collections.List as KtList

object NotesGroup

val BoldDuotoneSolar.Notes: NotesGroup
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
