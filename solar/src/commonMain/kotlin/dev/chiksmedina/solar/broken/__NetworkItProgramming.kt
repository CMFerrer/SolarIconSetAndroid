package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.networkitprogramming.Bug
import dev.chiksmedina.solar.broken.networkitprogramming.BugMinimalistic
import dev.chiksmedina.solar.broken.networkitprogramming.Code
import dev.chiksmedina.solar.broken.networkitprogramming.Code2
import dev.chiksmedina.solar.broken.networkitprogramming.CodeCircle
import dev.chiksmedina.solar.broken.networkitprogramming.CodeSquare
import dev.chiksmedina.solar.broken.networkitprogramming.Command
import dev.chiksmedina.solar.broken.networkitprogramming.Hashtag
import dev.chiksmedina.solar.broken.networkitprogramming.HashtagChat
import dev.chiksmedina.solar.broken.networkitprogramming.HashtagCircle
import dev.chiksmedina.solar.broken.networkitprogramming.HashtagSquare
import dev.chiksmedina.solar.broken.networkitprogramming.Programming
import dev.chiksmedina.solar.broken.networkitprogramming.Screencast
import dev.chiksmedina.solar.broken.networkitprogramming.Screencast2
import dev.chiksmedina.solar.broken.networkitprogramming.SidebarCode
import dev.chiksmedina.solar.broken.networkitprogramming.SidebarMinimalistic
import dev.chiksmedina.solar.broken.networkitprogramming.Siderbar
import dev.chiksmedina.solar.broken.networkitprogramming.SlashCircle
import dev.chiksmedina.solar.broken.networkitprogramming.SlashSquare
import dev.chiksmedina.solar.broken.networkitprogramming.Station
import dev.chiksmedina.solar.broken.networkitprogramming.StationMinimalistic
import dev.chiksmedina.solar.broken.networkitprogramming.Structure
import dev.chiksmedina.solar.broken.networkitprogramming.Translation
import dev.chiksmedina.solar.broken.networkitprogramming.Translation2
import dev.chiksmedina.solar.broken.networkitprogramming.Usb
import dev.chiksmedina.solar.broken.networkitprogramming.UsbCircle
import dev.chiksmedina.solar.broken.networkitprogramming.UsbSquare
import dev.chiksmedina.solar.broken.networkitprogramming.WifiRouter
import dev.chiksmedina.solar.broken.networkitprogramming.WifiRouterMinimalistic
import dev.chiksmedina.solar.broken.networkitprogramming.WifiRouterRound
import dev.chiksmedina.solar.broken.networkitprogramming.WindowFrame
import kotlin.collections.List as KtList

object NetworkItProgrammingGroup

val BrokenSolar.NetworkItProgramming: NetworkItProgrammingGroup
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
