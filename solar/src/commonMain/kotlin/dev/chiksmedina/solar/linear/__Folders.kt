package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.folders.AddFolder
import dev.chiksmedina.solar.linear.folders.Folder
import dev.chiksmedina.solar.linear.folders.Folder2
import dev.chiksmedina.solar.linear.folders.FolderCheck
import dev.chiksmedina.solar.linear.folders.FolderCloud
import dev.chiksmedina.solar.linear.folders.FolderError
import dev.chiksmedina.solar.linear.folders.FolderFavouriteBookmark
import dev.chiksmedina.solar.linear.folders.FolderFavouriteStar
import dev.chiksmedina.solar.linear.folders.FolderOpen
import dev.chiksmedina.solar.linear.folders.FolderPathConnect
import dev.chiksmedina.solar.linear.folders.FolderSecurity
import dev.chiksmedina.solar.linear.folders.FolderWithFiles
import dev.chiksmedina.solar.linear.folders.MoveToFolder
import dev.chiksmedina.solar.linear.folders.RemoveFolder
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
