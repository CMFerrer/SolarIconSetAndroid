package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.folders.AddFolder
import dev.chiksmedina.solar.boldduotone.folders.Folder
import dev.chiksmedina.solar.boldduotone.folders.Folder2
import dev.chiksmedina.solar.boldduotone.folders.FolderCheck
import dev.chiksmedina.solar.boldduotone.folders.FolderCloud
import dev.chiksmedina.solar.boldduotone.folders.FolderError
import dev.chiksmedina.solar.boldduotone.folders.FolderFavouriteBookmark
import dev.chiksmedina.solar.boldduotone.folders.FolderFavouriteStar
import dev.chiksmedina.solar.boldduotone.folders.FolderOpen
import dev.chiksmedina.solar.boldduotone.folders.FolderPathConnect
import dev.chiksmedina.solar.boldduotone.folders.FolderSecurity
import dev.chiksmedina.solar.boldduotone.folders.FolderWithFiles
import dev.chiksmedina.solar.boldduotone.folders.MoveToFolder
import dev.chiksmedina.solar.boldduotone.folders.RemoveFolder
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
