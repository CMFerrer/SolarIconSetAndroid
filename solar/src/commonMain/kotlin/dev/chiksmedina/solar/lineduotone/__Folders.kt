package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.folders.AddFolder
import dev.chiksmedina.solar.lineduotone.folders.Folder
import dev.chiksmedina.solar.lineduotone.folders.Folder2
import dev.chiksmedina.solar.lineduotone.folders.FolderCheck
import dev.chiksmedina.solar.lineduotone.folders.FolderCloud
import dev.chiksmedina.solar.lineduotone.folders.FolderError
import dev.chiksmedina.solar.lineduotone.folders.FolderFavouriteBookmark
import dev.chiksmedina.solar.lineduotone.folders.FolderFavouriteStar
import dev.chiksmedina.solar.lineduotone.folders.FolderOpen
import dev.chiksmedina.solar.lineduotone.folders.FolderPathConnect
import dev.chiksmedina.solar.lineduotone.folders.FolderSecurity
import dev.chiksmedina.solar.lineduotone.folders.FolderWithFiles
import dev.chiksmedina.solar.lineduotone.folders.MoveToFolder
import dev.chiksmedina.solar.lineduotone.folders.RemoveFolder
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
