package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.files.CloudFile
import dev.chiksmedina.solar.boldduotone.files.CodeFile
import dev.chiksmedina.solar.boldduotone.files.FigmaFile
import dev.chiksmedina.solar.boldduotone.files.File
import dev.chiksmedina.solar.boldduotone.files.FileCheck
import dev.chiksmedina.solar.boldduotone.files.FileCorrupted
import dev.chiksmedina.solar.boldduotone.files.FileDownload
import dev.chiksmedina.solar.boldduotone.files.FileFavourite
import dev.chiksmedina.solar.boldduotone.files.FileLeft
import dev.chiksmedina.solar.boldduotone.files.FileRemove
import dev.chiksmedina.solar.boldduotone.files.FileRight
import dev.chiksmedina.solar.boldduotone.files.FileSend
import dev.chiksmedina.solar.boldduotone.files.FileSmile
import dev.chiksmedina.solar.boldduotone.files.FileText
import dev.chiksmedina.solar.boldduotone.files.ZipFile
import kotlin.collections.List as KtList

object FilesGroup

val BoldDuotoneSolar.Files: FilesGroup
    get() = FilesGroup

private var _AllIcons: KtList<ImageVector>? = null

val FilesGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            CloudFile,
            CodeFile,
            FigmaFile,
            File,
            FileCheck,
            FileCorrupted,
            FileDownload,
            FileFavourite,
            FileLeft,
            FileRemove,
            FileRight,
            FileSend,
            FileSmile,
            FileText,
            ZipFile
        )
        return _AllIcons!!
    }
