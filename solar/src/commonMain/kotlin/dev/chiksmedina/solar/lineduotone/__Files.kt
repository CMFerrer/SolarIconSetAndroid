package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.files.CloudFile
import dev.chiksmedina.solar.lineduotone.files.CodeFile
import dev.chiksmedina.solar.lineduotone.files.FigmaFile
import dev.chiksmedina.solar.lineduotone.files.File
import dev.chiksmedina.solar.lineduotone.files.FileCheck
import dev.chiksmedina.solar.lineduotone.files.FileCorrupted
import dev.chiksmedina.solar.lineduotone.files.FileDownload
import dev.chiksmedina.solar.lineduotone.files.FileFavourite
import dev.chiksmedina.solar.lineduotone.files.FileLeft
import dev.chiksmedina.solar.lineduotone.files.FileRemove
import dev.chiksmedina.solar.lineduotone.files.FileRight
import dev.chiksmedina.solar.lineduotone.files.FileSend
import dev.chiksmedina.solar.lineduotone.files.FileSmile
import dev.chiksmedina.solar.lineduotone.files.FileText
import dev.chiksmedina.solar.lineduotone.files.ZipFile
import kotlin.collections.List as KtList

object FilesGroup

val LineDuotoneSolar.Files: FilesGroup
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
