package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.files.CloudFile
import com.chiksmedina.solar.outline.files.CodeFile
import com.chiksmedina.solar.outline.files.FigmaFile
import com.chiksmedina.solar.outline.files.File
import com.chiksmedina.solar.outline.files.FileCheck
import com.chiksmedina.solar.outline.files.FileCorrupted
import com.chiksmedina.solar.outline.files.FileDownload
import com.chiksmedina.solar.outline.files.FileFavourite
import com.chiksmedina.solar.outline.files.FileLeft
import com.chiksmedina.solar.outline.files.FileRemove
import com.chiksmedina.solar.outline.files.FileRight
import com.chiksmedina.solar.outline.files.FileSend
import com.chiksmedina.solar.outline.files.FileSmile
import com.chiksmedina.solar.outline.files.FileText
import com.chiksmedina.solar.outline.files.ZipFile
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
