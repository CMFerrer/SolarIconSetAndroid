package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.files.CloudFile
import dev.chiksmedina.solar.outline.files.CodeFile
import dev.chiksmedina.solar.outline.files.FigmaFile
import dev.chiksmedina.solar.outline.files.File
import dev.chiksmedina.solar.outline.files.FileCheck
import dev.chiksmedina.solar.outline.files.FileCorrupted
import dev.chiksmedina.solar.outline.files.FileDownload
import dev.chiksmedina.solar.outline.files.FileFavourite
import dev.chiksmedina.solar.outline.files.FileLeft
import dev.chiksmedina.solar.outline.files.FileRemove
import dev.chiksmedina.solar.outline.files.FileRight
import dev.chiksmedina.solar.outline.files.FileSend
import dev.chiksmedina.solar.outline.files.FileSmile
import dev.chiksmedina.solar.outline.files.FileText
import dev.chiksmedina.solar.outline.files.ZipFile
import kotlin.collections.List as KtList

object FilesGroup

val OutlineSolar.Files: FilesGroup
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
