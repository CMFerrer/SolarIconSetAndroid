package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.files.CloudFile
import dev.chiksmedina.solar.broken.files.CodeFile
import dev.chiksmedina.solar.broken.files.FigmaFile
import dev.chiksmedina.solar.broken.files.File
import dev.chiksmedina.solar.broken.files.FileCheck
import dev.chiksmedina.solar.broken.files.FileCorrupted
import dev.chiksmedina.solar.broken.files.FileDownload
import dev.chiksmedina.solar.broken.files.FileFavourite
import dev.chiksmedina.solar.broken.files.FileLeft
import dev.chiksmedina.solar.broken.files.FileRemove
import dev.chiksmedina.solar.broken.files.FileRight
import dev.chiksmedina.solar.broken.files.FileSend
import dev.chiksmedina.solar.broken.files.FileSmile
import dev.chiksmedina.solar.broken.files.FileText
import dev.chiksmedina.solar.broken.files.ZipFile
import kotlin.collections.List as KtList

object FilesGroup

val BrokenSolar.Files: FilesGroup
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
