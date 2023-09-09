package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.folders.AddFolder
import com.chiksmedina.solar.bold.folders.Folder
import com.chiksmedina.solar.bold.folders.Folder2
import com.chiksmedina.solar.bold.folders.FolderCheck
import com.chiksmedina.solar.bold.folders.FolderCloud
import com.chiksmedina.solar.bold.folders.FolderError
import com.chiksmedina.solar.bold.folders.FolderOpen
import com.chiksmedina.solar.bold.folders.FolderPathConnect
import com.chiksmedina.solar.bold.folders.FolderSecurity
import com.chiksmedina.solar.bold.folders.FolderWithFiles
import com.chiksmedina.solar.bold.folders.MoveToFolder
import com.chiksmedina.solar.bold.folders.RemoveFolder
import com.chiksmedina.solar.bold.folders.`FolderFavourite(bookmark)`
import com.chiksmedina.solar.bold.folders.`FolderFavourite(star)`
import kotlin.collections.List as ____KtList

public object FoldersGroup

public val BoldGroup.Folders: FoldersGroup
  get() = FoldersGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FoldersGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(AddFolder, Folder, Folder2, FolderCheck, FolderCloud, FolderError,
        `FolderFavourite(bookmark)`, `FolderFavourite(star)`, FolderOpen, FolderPathConnect,
        FolderSecurity, FolderWithFiles, MoveToFolder, RemoveFolder)
    return __AllIcons!!
  }
