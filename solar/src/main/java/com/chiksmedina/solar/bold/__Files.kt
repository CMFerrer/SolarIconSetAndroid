package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.files.CloudFile
import com.chiksmedina.solar.bold.files.CodeFile
import com.chiksmedina.solar.bold.files.FigmaFile
import com.chiksmedina.solar.bold.files.File
import com.chiksmedina.solar.bold.files.FileCheck
import com.chiksmedina.solar.bold.files.FileCorrupted
import com.chiksmedina.solar.bold.files.FileDownload
import com.chiksmedina.solar.bold.files.FileFavourite
import com.chiksmedina.solar.bold.files.FileLeft
import com.chiksmedina.solar.bold.files.FileRemove
import com.chiksmedina.solar.bold.files.FileRight
import com.chiksmedina.solar.bold.files.FileSend
import com.chiksmedina.solar.bold.files.FileSmile
import com.chiksmedina.solar.bold.files.FileText
import com.chiksmedina.solar.bold.files.ZipFile
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
