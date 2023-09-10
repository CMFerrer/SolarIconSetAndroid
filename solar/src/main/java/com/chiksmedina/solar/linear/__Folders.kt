package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.folders.AddFolder
import com.chiksmedina.solar.linear.folders.Folder
import com.chiksmedina.solar.linear.folders.Folder2
import com.chiksmedina.solar.linear.folders.FolderCheck
import com.chiksmedina.solar.linear.folders.FolderCloud
import com.chiksmedina.solar.linear.folders.FolderError
import com.chiksmedina.solar.linear.folders.FolderFavouriteBookmark
import com.chiksmedina.solar.linear.folders.FolderFavouriteStar
import com.chiksmedina.solar.linear.folders.FolderOpen
import com.chiksmedina.solar.linear.folders.FolderPathConnect
import com.chiksmedina.solar.linear.folders.FolderSecurity
import com.chiksmedina.solar.linear.folders.FolderWithFiles
import com.chiksmedina.solar.linear.folders.MoveToFolder
import com.chiksmedina.solar.linear.folders.RemoveFolder
import kotlin.collections.List as KtList

object FoldersGroup

val LinearSolar.Folders: FoldersGroup
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
