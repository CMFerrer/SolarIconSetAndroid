package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.folders.AddFolder
import com.chiksmedina.solar.lineduotone.folders.Folder
import com.chiksmedina.solar.lineduotone.folders.Folder2
import com.chiksmedina.solar.lineduotone.folders.FolderCheck
import com.chiksmedina.solar.lineduotone.folders.FolderCloud
import com.chiksmedina.solar.lineduotone.folders.FolderError
import com.chiksmedina.solar.lineduotone.folders.FolderFavouriteBookmark
import com.chiksmedina.solar.lineduotone.folders.FolderFavouriteStar
import com.chiksmedina.solar.lineduotone.folders.FolderOpen
import com.chiksmedina.solar.lineduotone.folders.FolderPathConnect
import com.chiksmedina.solar.lineduotone.folders.FolderSecurity
import com.chiksmedina.solar.lineduotone.folders.FolderWithFiles
import com.chiksmedina.solar.lineduotone.folders.MoveToFolder
import com.chiksmedina.solar.lineduotone.folders.RemoveFolder
import kotlin.collections.List as KtList

object FoldersGroup

val LineDuotoneSolar.Folders: FoldersGroup
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
