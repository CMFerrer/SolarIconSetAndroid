package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.folders.AddFolder
import com.chiksmedina.solar.outline.folders.Folder
import com.chiksmedina.solar.outline.folders.Folder2
import com.chiksmedina.solar.outline.folders.FolderCheck
import com.chiksmedina.solar.outline.folders.FolderCloud
import com.chiksmedina.solar.outline.folders.FolderError
import com.chiksmedina.solar.outline.folders.FolderFavouriteBookmark
import com.chiksmedina.solar.outline.folders.FolderFavouriteStar
import com.chiksmedina.solar.outline.folders.FolderOpen
import com.chiksmedina.solar.outline.folders.FolderPathConnect
import com.chiksmedina.solar.outline.folders.FolderSecurity
import com.chiksmedina.solar.outline.folders.FolderWithFiles
import com.chiksmedina.solar.outline.folders.MoveToFolder
import com.chiksmedina.solar.outline.folders.RemoveFolder
import kotlin.collections.List as KtList

object FoldersGroup

val OutlineSolar.Folders: FoldersGroup
    get() = FoldersGroup

private var _AllIcons: KtList<ImageVector>? = null

val FoldersGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            AddFolder, Folder, Folder2, FolderCheck, FolderCloud, FolderError,
            FolderFavouriteBookmark, FolderFavouriteStar, FolderOpen, FolderPathConnect,
            FolderSecurity, FolderWithFiles, MoveToFolder, RemoveFolder
        )
        return _AllIcons!!
    }
