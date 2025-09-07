package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.files.CloudFile
import com.chiksmedina.solar.boldduotone.files.CodeFile
import com.chiksmedina.solar.boldduotone.files.FigmaFile
import com.chiksmedina.solar.boldduotone.files.File
import com.chiksmedina.solar.boldduotone.files.FileCheck
import com.chiksmedina.solar.boldduotone.files.FileCorrupted
import com.chiksmedina.solar.boldduotone.files.FileDownload
import com.chiksmedina.solar.boldduotone.files.FileFavourite
import com.chiksmedina.solar.boldduotone.files.FileLeft
import com.chiksmedina.solar.boldduotone.files.FileRemove
import com.chiksmedina.solar.boldduotone.files.FileRight
import com.chiksmedina.solar.boldduotone.files.FileSend
import com.chiksmedina.solar.boldduotone.files.FileSmile
import com.chiksmedina.solar.boldduotone.files.FileText
import com.chiksmedina.solar.boldduotone.files.ZipFile
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
