package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.networkitprogramming.Bug
import dev.chiksmedina.solar.bold.networkitprogramming.BugMinimalistic
import dev.chiksmedina.solar.bold.networkitprogramming.Code
import dev.chiksmedina.solar.bold.networkitprogramming.Code2
import dev.chiksmedina.solar.bold.networkitprogramming.CodeCircle
import dev.chiksmedina.solar.bold.networkitprogramming.CodeSquare
import dev.chiksmedina.solar.bold.networkitprogramming.Command
import dev.chiksmedina.solar.bold.networkitprogramming.Hashtag
import dev.chiksmedina.solar.bold.networkitprogramming.HashtagChat
import dev.chiksmedina.solar.bold.networkitprogramming.HashtagCircle
import dev.chiksmedina.solar.bold.networkitprogramming.HashtagSquare
import dev.chiksmedina.solar.bold.networkitprogramming.Programming
import dev.chiksmedina.solar.bold.networkitprogramming.Screencast
import dev.chiksmedina.solar.bold.networkitprogramming.Screencast2
import dev.chiksmedina.solar.bold.networkitprogramming.SidebarCode
import dev.chiksmedina.solar.bold.networkitprogramming.SidebarMinimalistic
import dev.chiksmedina.solar.bold.networkitprogramming.Siderbar
import dev.chiksmedina.solar.bold.networkitprogramming.SlashCircle
import dev.chiksmedina.solar.bold.networkitprogramming.SlashSquare
import dev.chiksmedina.solar.bold.networkitprogramming.Station
import dev.chiksmedina.solar.bold.networkitprogramming.StationMinimalistic
import dev.chiksmedina.solar.bold.networkitprogramming.Structure
import dev.chiksmedina.solar.bold.networkitprogramming.Translation
import dev.chiksmedina.solar.bold.networkitprogramming.Translation2
import dev.chiksmedina.solar.bold.networkitprogramming.Usb
import dev.chiksmedina.solar.bold.networkitprogramming.UsbCircle
import dev.chiksmedina.solar.bold.networkitprogramming.UsbSquare
import dev.chiksmedina.solar.bold.networkitprogramming.WifiRouter
import dev.chiksmedina.solar.bold.networkitprogramming.WifiRouterMinimalistic
import dev.chiksmedina.solar.bold.networkitprogramming.WifiRouterRound
import dev.chiksmedina.solar.bold.networkitprogramming.WindowFrame
import kotlin.collections.List as KtList

object NetworkItProgrammingGroup

val BoldSolar.NetworkItProgramming: NetworkItProgrammingGroup
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
