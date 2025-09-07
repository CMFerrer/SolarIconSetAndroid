package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.files.CloudFile
import com.chiksmedina.solar.lineduotone.files.CodeFile
import com.chiksmedina.solar.lineduotone.files.FigmaFile
import com.chiksmedina.solar.lineduotone.files.File
import com.chiksmedina.solar.lineduotone.files.FileCheck
import com.chiksmedina.solar.lineduotone.files.FileCorrupted
import com.chiksmedina.solar.lineduotone.files.FileDownload
import com.chiksmedina.solar.lineduotone.files.FileFavourite
import com.chiksmedina.solar.lineduotone.files.FileLeft
import com.chiksmedina.solar.lineduotone.files.FileRemove
import com.chiksmedina.solar.lineduotone.files.FileRight
import com.chiksmedina.solar.lineduotone.files.FileSend
import com.chiksmedina.solar.lineduotone.files.FileSmile
import com.chiksmedina.solar.lineduotone.files.FileText
import com.chiksmedina.solar.lineduotone.files.ZipFile
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
