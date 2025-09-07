package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.files.CloudFile
import com.chiksmedina.solar.linear.files.CodeFile
import com.chiksmedina.solar.linear.files.FigmaFile
import com.chiksmedina.solar.linear.files.File
import com.chiksmedina.solar.linear.files.FileCheck
import com.chiksmedina.solar.linear.files.FileCorrupted
import com.chiksmedina.solar.linear.files.FileDownload
import com.chiksmedina.solar.linear.files.FileFavourite
import com.chiksmedina.solar.linear.files.FileLeft
import com.chiksmedina.solar.linear.files.FileRemove
import com.chiksmedina.solar.linear.files.FileRight
import com.chiksmedina.solar.linear.files.FileSend
import com.chiksmedina.solar.linear.files.FileSmile
import com.chiksmedina.solar.linear.files.FileText
import com.chiksmedina.solar.linear.files.ZipFile
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
