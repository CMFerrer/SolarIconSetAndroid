package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.folders.AddFolder
import com.chiksmedina.solar.boldduotone.folders.Folder
import com.chiksmedina.solar.boldduotone.folders.Folder2
import com.chiksmedina.solar.boldduotone.folders.FolderCheck
import com.chiksmedina.solar.boldduotone.folders.FolderCloud
import com.chiksmedina.solar.boldduotone.folders.FolderError
import com.chiksmedina.solar.boldduotone.folders.FolderOpen
import com.chiksmedina.solar.boldduotone.folders.FolderPathConnect
import com.chiksmedina.solar.boldduotone.folders.FolderSecurity
import com.chiksmedina.solar.boldduotone.folders.FolderWithFiles
import com.chiksmedina.solar.boldduotone.folders.MoveToFolder
import com.chiksmedina.solar.boldduotone.folders.RemoveFolder
import com.chiksmedina.solar.boldduotone.folders.`FolderFavourite(bookmark)`
import com.chiksmedina.solar.boldduotone.folders.`FolderFavourite(star)`
import kotlin.collections.List as ____KtList

public object FoldersGroup

public val BoldduotoneGroup.Folders: FoldersGroup
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
