package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.folders.AddFolder
import com.chiksmedina.solar.broken.folders.Folder
import com.chiksmedina.solar.broken.folders.Folder2
import com.chiksmedina.solar.broken.folders.FolderCheck
import com.chiksmedina.solar.broken.folders.FolderCloud
import com.chiksmedina.solar.broken.folders.FolderError
import com.chiksmedina.solar.broken.folders.FolderOpen
import com.chiksmedina.solar.broken.folders.FolderPathConnect
import com.chiksmedina.solar.broken.folders.FolderSecurity
import com.chiksmedina.solar.broken.folders.FolderWithFiles
import com.chiksmedina.solar.broken.folders.MoveToFolder
import com.chiksmedina.solar.broken.folders.RemoveFolder
import com.chiksmedina.solar.broken.folders.`FolderFavourite(bookmark)`
import com.chiksmedina.solar.broken.folders.`FolderFavourite(star)`
import kotlin.collections.List as ____KtList

public object FoldersGroup

public val BrokenGroup.Folders: FoldersGroup
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
