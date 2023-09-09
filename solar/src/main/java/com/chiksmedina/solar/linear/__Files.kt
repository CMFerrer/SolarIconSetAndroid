package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
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
import com.chiksmedina.solar.linear.files.FileText
import com.chiksmedina.solar.linear.files.ZipFile
import com.chiksmedina.solar.linear.files.`FileSmile)`
import kotlin.collections.List as ____KtList

public object FilesGroup

public val LinearGroup.Files: FilesGroup
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
