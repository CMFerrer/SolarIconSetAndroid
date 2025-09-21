package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.files.CloudFile
import dev.chiksmedina.solar.bold.files.CodeFile
import dev.chiksmedina.solar.bold.files.FigmaFile
import dev.chiksmedina.solar.bold.files.File
import dev.chiksmedina.solar.bold.files.FileCheck
import dev.chiksmedina.solar.bold.files.FileCorrupted
import dev.chiksmedina.solar.bold.files.FileDownload
import dev.chiksmedina.solar.bold.files.FileFavourite
import dev.chiksmedina.solar.bold.files.FileLeft
import dev.chiksmedina.solar.bold.files.FileRemove
import dev.chiksmedina.solar.bold.files.FileRight
import dev.chiksmedina.solar.bold.files.FileSend
import dev.chiksmedina.solar.bold.files.FileSmile
import dev.chiksmedina.solar.bold.files.FileText
import dev.chiksmedina.solar.bold.files.ZipFile
import kotlin.collections.List as KtList

object FilesGroup

val BoldSolar.Files: FilesGroup
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
