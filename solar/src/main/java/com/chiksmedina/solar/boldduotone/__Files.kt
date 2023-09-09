package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
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
import com.chiksmedina.solar.boldduotone.files.FileText
import com.chiksmedina.solar.boldduotone.files.ZipFile
import com.chiksmedina.solar.boldduotone.files.`FileSmile)`
import kotlin.collections.List as ____KtList

public object FilesGroup

public val BoldduotoneGroup.Files: FilesGroup
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
