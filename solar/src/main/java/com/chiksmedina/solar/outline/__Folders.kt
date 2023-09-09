package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.folders.AddFolder
import com.chiksmedina.solar.outline.folders.Folder
import com.chiksmedina.solar.outline.folders.Folder2
import com.chiksmedina.solar.outline.folders.FolderCheck
import com.chiksmedina.solar.outline.folders.FolderCloud
import com.chiksmedina.solar.outline.folders.FolderError
import com.chiksmedina.solar.outline.folders.FolderOpen
import com.chiksmedina.solar.outline.folders.FolderPathConnect
import com.chiksmedina.solar.outline.folders.FolderSecurity
import com.chiksmedina.solar.outline.folders.FolderWithFiles
import com.chiksmedina.solar.outline.folders.MoveToFolder
import com.chiksmedina.solar.outline.folders.RemoveFolder
import com.chiksmedina.solar.outline.folders.`FolderFavourite(bookmark)`
import com.chiksmedina.solar.outline.folders.`FolderFavourite(star)`
import kotlin.collections.List as ____KtList

public object FoldersGroup

public val OutlineGroup.Folders: FoldersGroup
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
