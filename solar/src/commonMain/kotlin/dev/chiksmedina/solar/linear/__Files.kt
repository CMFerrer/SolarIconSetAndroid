package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.files.CloudFile
import dev.chiksmedina.solar.linear.files.CodeFile
import dev.chiksmedina.solar.linear.files.FigmaFile
import dev.chiksmedina.solar.linear.files.File
import dev.chiksmedina.solar.linear.files.FileCheck
import dev.chiksmedina.solar.linear.files.FileCorrupted
import dev.chiksmedina.solar.linear.files.FileDownload
import dev.chiksmedina.solar.linear.files.FileFavourite
import dev.chiksmedina.solar.linear.files.FileLeft
import dev.chiksmedina.solar.linear.files.FileRemove
import dev.chiksmedina.solar.linear.files.FileRight
import dev.chiksmedina.solar.linear.files.FileSend
import dev.chiksmedina.solar.linear.files.FileSmile
import dev.chiksmedina.solar.linear.files.FileText
import dev.chiksmedina.solar.linear.files.ZipFile
import kotlin.collections.List as KtList

object FilesGroup

val LinearSolar.Files: FilesGroup
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
