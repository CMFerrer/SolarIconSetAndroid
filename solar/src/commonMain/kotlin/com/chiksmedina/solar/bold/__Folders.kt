package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.folders.AddFolder
import com.chiksmedina.solar.bold.folders.Folder
import com.chiksmedina.solar.bold.folders.Folder2
import com.chiksmedina.solar.bold.folders.FolderCheck
import com.chiksmedina.solar.bold.folders.FolderCloud
import com.chiksmedina.solar.bold.folders.FolderError
import com.chiksmedina.solar.bold.folders.FolderFavouriteBookmark
import com.chiksmedina.solar.bold.folders.FolderFavouriteStar
import com.chiksmedina.solar.bold.folders.FolderOpen
import com.chiksmedina.solar.bold.folders.FolderPathConnect
import com.chiksmedina.solar.bold.folders.FolderSecurity
import com.chiksmedina.solar.bold.folders.FolderWithFiles
import com.chiksmedina.solar.bold.folders.MoveToFolder
import com.chiksmedina.solar.bold.folders.RemoveFolder
import kotlin.collections.List as KtList

object FoldersGroup

val BoldSolar.Folders: FoldersGroup
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
