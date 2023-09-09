package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
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
import com.chiksmedina.solar.bold.files.FileText
import com.chiksmedina.solar.bold.files.ZipFile
import com.chiksmedina.solar.bold.files.`FileSmile)`
import kotlin.collections.List as ____KtList

public object FilesGroup

public val BoldGroup.Files: FilesGroup
  get() = FilesGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FilesGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(CloudFile, CodeFile, FigmaFile, File, FileCheck, FileCorrupted, FileDownload,
        FileFavourite, FileLeft, FileRemove, FileRight, FileSend, `FileSmile)`, FileText, ZipFile)
    return __AllIcons!!
  }
