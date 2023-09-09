package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.files.CloudFile
import com.chiksmedina.solar.broken.files.CodeFile
import com.chiksmedina.solar.broken.files.FigmaFile
import com.chiksmedina.solar.broken.files.File
import com.chiksmedina.solar.broken.files.FileCheck
import com.chiksmedina.solar.broken.files.FileCorrupted
import com.chiksmedina.solar.broken.files.FileDownload
import com.chiksmedina.solar.broken.files.FileFavourite
import com.chiksmedina.solar.broken.files.FileLeft
import com.chiksmedina.solar.broken.files.FileRemove
import com.chiksmedina.solar.broken.files.FileRight
import com.chiksmedina.solar.broken.files.FileSend
import com.chiksmedina.solar.broken.files.FileText
import com.chiksmedina.solar.broken.files.ZipFile
import com.chiksmedina.solar.broken.files.`FileSmile)`
import kotlin.collections.List as ____KtList

public object FilesGroup

public val BrokenGroup.Files: FilesGroup
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
