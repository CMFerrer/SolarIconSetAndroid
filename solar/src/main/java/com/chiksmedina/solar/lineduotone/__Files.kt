package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
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
import com.chiksmedina.solar.lineduotone.files.FileText
import com.chiksmedina.solar.lineduotone.files.ZipFile
import com.chiksmedina.solar.lineduotone.files.`FileSmile)`
import kotlin.collections.List as ____KtList

public object FilesGroup

public val LineduotoneGroup.Files: FilesGroup
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
