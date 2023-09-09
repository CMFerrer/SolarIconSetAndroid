package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
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
import com.chiksmedina.solar.outline.files.FileText
import com.chiksmedina.solar.outline.files.ZipFile
import com.chiksmedina.solar.outline.files.`FileSmile)`
import kotlin.collections.List as ____KtList

public object FilesGroup

public val OutlineGroup.Files: FilesGroup
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
