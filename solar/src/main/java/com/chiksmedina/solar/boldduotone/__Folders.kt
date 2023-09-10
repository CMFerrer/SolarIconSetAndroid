package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.folders.AddFolder
import com.chiksmedina.solar.boldduotone.folders.Folder
import com.chiksmedina.solar.boldduotone.folders.Folder2
import com.chiksmedina.solar.boldduotone.folders.FolderCheck
import com.chiksmedina.solar.boldduotone.folders.FolderCloud
import com.chiksmedina.solar.boldduotone.folders.FolderError
import com.chiksmedina.solar.boldduotone.folders.FolderFavouriteBookmark
import com.chiksmedina.solar.boldduotone.folders.FolderFavouriteStar
import com.chiksmedina.solar.boldduotone.folders.FolderOpen
import com.chiksmedina.solar.boldduotone.folders.FolderPathConnect
import com.chiksmedina.solar.boldduotone.folders.FolderSecurity
import com.chiksmedina.solar.boldduotone.folders.FolderWithFiles
import com.chiksmedina.solar.boldduotone.folders.MoveToFolder
import com.chiksmedina.solar.boldduotone.folders.RemoveFolder
import kotlin.collections.List as KtList

object FoldersGroup

val BoldDuotoneSolar.Folders: FoldersGroup
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
