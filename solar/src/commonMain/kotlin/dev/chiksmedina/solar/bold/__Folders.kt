package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.folders.AddFolder
import dev.chiksmedina.solar.bold.folders.Folder
import dev.chiksmedina.solar.bold.folders.Folder2
import dev.chiksmedina.solar.bold.folders.FolderCheck
import dev.chiksmedina.solar.bold.folders.FolderCloud
import dev.chiksmedina.solar.bold.folders.FolderError
import dev.chiksmedina.solar.bold.folders.FolderFavouriteBookmark
import dev.chiksmedina.solar.bold.folders.FolderFavouriteStar
import dev.chiksmedina.solar.bold.folders.FolderOpen
import dev.chiksmedina.solar.bold.folders.FolderPathConnect
import dev.chiksmedina.solar.bold.folders.FolderSecurity
import dev.chiksmedina.solar.bold.folders.FolderWithFiles
import dev.chiksmedina.solar.bold.folders.MoveToFolder
import dev.chiksmedina.solar.bold.folders.RemoveFolder
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
