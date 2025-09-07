package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.folders.AddFolder
import com.chiksmedina.solar.broken.folders.Folder
import com.chiksmedina.solar.broken.folders.Folder2
import com.chiksmedina.solar.broken.folders.FolderCheck
import com.chiksmedina.solar.broken.folders.FolderCloud
import com.chiksmedina.solar.broken.folders.FolderError
import com.chiksmedina.solar.broken.folders.FolderFavouriteBookmark
import com.chiksmedina.solar.broken.folders.FolderFavouriteStar
import com.chiksmedina.solar.broken.folders.FolderOpen
import com.chiksmedina.solar.broken.folders.FolderPathConnect
import com.chiksmedina.solar.broken.folders.FolderSecurity
import com.chiksmedina.solar.broken.folders.FolderWithFiles
import com.chiksmedina.solar.broken.folders.MoveToFolder
import com.chiksmedina.solar.broken.folders.RemoveFolder
import kotlin.collections.List as KtList

object FoldersGroup

val BrokenSolar.Folders: FoldersGroup
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
