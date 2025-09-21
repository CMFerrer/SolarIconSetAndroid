package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.folders.AddFolder
import dev.chiksmedina.solar.broken.folders.Folder
import dev.chiksmedina.solar.broken.folders.Folder2
import dev.chiksmedina.solar.broken.folders.FolderCheck
import dev.chiksmedina.solar.broken.folders.FolderCloud
import dev.chiksmedina.solar.broken.folders.FolderError
import dev.chiksmedina.solar.broken.folders.FolderFavouriteBookmark
import dev.chiksmedina.solar.broken.folders.FolderFavouriteStar
import dev.chiksmedina.solar.broken.folders.FolderOpen
import dev.chiksmedina.solar.broken.folders.FolderPathConnect
import dev.chiksmedina.solar.broken.folders.FolderSecurity
import dev.chiksmedina.solar.broken.folders.FolderWithFiles
import dev.chiksmedina.solar.broken.folders.MoveToFolder
import dev.chiksmedina.solar.broken.folders.RemoveFolder
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
