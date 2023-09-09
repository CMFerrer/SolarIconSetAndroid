package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.folders.AddFolder
import com.chiksmedina.solar.lineduotone.folders.Folder
import com.chiksmedina.solar.lineduotone.folders.Folder2
import com.chiksmedina.solar.lineduotone.folders.FolderCheck
import com.chiksmedina.solar.lineduotone.folders.FolderCloud
import com.chiksmedina.solar.lineduotone.folders.FolderError
import com.chiksmedina.solar.lineduotone.folders.FolderOpen
import com.chiksmedina.solar.lineduotone.folders.FolderPathConnect
import com.chiksmedina.solar.lineduotone.folders.FolderSecurity
import com.chiksmedina.solar.lineduotone.folders.FolderWithFiles
import com.chiksmedina.solar.lineduotone.folders.MoveToFolder
import com.chiksmedina.solar.lineduotone.folders.RemoveFolder
import com.chiksmedina.solar.lineduotone.folders.`FolderFavourite(bookmark)`
import com.chiksmedina.solar.lineduotone.folders.`FolderFavourite(star)`
import kotlin.collections.List as ____KtList

public object FoldersGroup

public val LineduotoneGroup.Folders: FoldersGroup
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
