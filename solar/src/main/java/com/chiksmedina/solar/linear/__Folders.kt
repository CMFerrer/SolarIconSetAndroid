package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.folders.AddFolder
import com.chiksmedina.solar.linear.folders.Folder
import com.chiksmedina.solar.linear.folders.Folder2
import com.chiksmedina.solar.linear.folders.FolderCheck
import com.chiksmedina.solar.linear.folders.FolderCloud
import com.chiksmedina.solar.linear.folders.FolderError
import com.chiksmedina.solar.linear.folders.FolderOpen
import com.chiksmedina.solar.linear.folders.FolderPathConnect
import com.chiksmedina.solar.linear.folders.FolderSecurity
import com.chiksmedina.solar.linear.folders.FolderWithFiles
import com.chiksmedina.solar.linear.folders.MoveToFolder
import com.chiksmedina.solar.linear.folders.RemoveFolder
import com.chiksmedina.solar.linear.folders.`FolderFavourite(bookmark)`
import com.chiksmedina.solar.linear.folders.`FolderFavourite(star)`
import kotlin.collections.List as ____KtList

public object FoldersGroup

public val LinearGroup.Folders: FoldersGroup
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
