package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.networkitprogramming.Bug
import dev.chiksmedina.solar.outline.networkitprogramming.BugMinimalistic
import dev.chiksmedina.solar.outline.networkitprogramming.Code
import dev.chiksmedina.solar.outline.networkitprogramming.Code2
import dev.chiksmedina.solar.outline.networkitprogramming.CodeCircle
import dev.chiksmedina.solar.outline.networkitprogramming.CodeSquare
import dev.chiksmedina.solar.outline.networkitprogramming.Command
import dev.chiksmedina.solar.outline.networkitprogramming.Hashtag
import dev.chiksmedina.solar.outline.networkitprogramming.HashtagChat
import dev.chiksmedina.solar.outline.networkitprogramming.HashtagCircle
import dev.chiksmedina.solar.outline.networkitprogramming.HashtagSquare
import dev.chiksmedina.solar.outline.networkitprogramming.Programming
import dev.chiksmedina.solar.outline.networkitprogramming.Screencast
import dev.chiksmedina.solar.outline.networkitprogramming.Screencast2
import dev.chiksmedina.solar.outline.networkitprogramming.SidebarCode
import dev.chiksmedina.solar.outline.networkitprogramming.SidebarMinimalistic
import dev.chiksmedina.solar.outline.networkitprogramming.Siderbar
import dev.chiksmedina.solar.outline.networkitprogramming.SlashCircle
import dev.chiksmedina.solar.outline.networkitprogramming.SlashSquare
import dev.chiksmedina.solar.outline.networkitprogramming.Station
import dev.chiksmedina.solar.outline.networkitprogramming.StationMinimalistic
import dev.chiksmedina.solar.outline.networkitprogramming.Structure
import dev.chiksmedina.solar.outline.networkitprogramming.Translation
import dev.chiksmedina.solar.outline.networkitprogramming.Translation2
import dev.chiksmedina.solar.outline.networkitprogramming.Usb
import dev.chiksmedina.solar.outline.networkitprogramming.UsbCircle
import dev.chiksmedina.solar.outline.networkitprogramming.UsbSquare
import dev.chiksmedina.solar.outline.networkitprogramming.WifiRouter
import dev.chiksmedina.solar.outline.networkitprogramming.WifiRouterMinimalistic
import dev.chiksmedina.solar.outline.networkitprogramming.WifiRouterRound
import dev.chiksmedina.solar.outline.networkitprogramming.WindowFrame
import kotlin.collections.List as KtList

object NetworkItProgrammingGroup

val OutlineSolar.NetworkItProgramming: NetworkItProgrammingGroup
    get() = NetworkItProgrammingGroup

private var _AllIcons: KtList<ImageVector>? = null

val NetworkItProgrammingGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bug, BugMinimalistic, Code, Code2, CodeCircle, CodeSquare, Command, Hashtag,
            HashtagChat, HashtagCircle, HashtagSquare, Programming, Screencast, Screencast2,
            SidebarCode, SidebarMinimalistic, Siderbar, SlashCircle, SlashSquare, Station,
            StationMinimalistic, Structure, Translation, Translation2, Usb, UsbCircle, UsbSquare,
            WifiRouter, WifiRouterMinimalistic, WifiRouterRound, WindowFrame
        )
        return _AllIcons!!
    }
