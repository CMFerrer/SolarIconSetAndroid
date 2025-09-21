package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.folders.AddFolder
import dev.chiksmedina.solar.outline.folders.Folder
import dev.chiksmedina.solar.outline.folders.Folder2
import dev.chiksmedina.solar.outline.folders.FolderCheck
import dev.chiksmedina.solar.outline.folders.FolderCloud
import dev.chiksmedina.solar.outline.folders.FolderError
import dev.chiksmedina.solar.outline.folders.FolderFavouriteBookmark
import dev.chiksmedina.solar.outline.folders.FolderFavouriteStar
import dev.chiksmedina.solar.outline.folders.FolderOpen
import dev.chiksmedina.solar.outline.folders.FolderPathConnect
import dev.chiksmedina.solar.outline.folders.FolderSecurity
import dev.chiksmedina.solar.outline.folders.FolderWithFiles
import dev.chiksmedina.solar.outline.folders.MoveToFolder
import dev.chiksmedina.solar.outline.folders.RemoveFolder
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
