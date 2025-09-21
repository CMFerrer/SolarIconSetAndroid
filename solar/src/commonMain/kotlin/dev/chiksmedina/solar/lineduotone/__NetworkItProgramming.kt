package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Bug
import dev.chiksmedina.solar.lineduotone.networkitprogramming.BugMinimalistic
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Code
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Code2
import dev.chiksmedina.solar.lineduotone.networkitprogramming.CodeCircle
import dev.chiksmedina.solar.lineduotone.networkitprogramming.CodeSquare
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Command
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Hashtag
import dev.chiksmedina.solar.lineduotone.networkitprogramming.HashtagChat
import dev.chiksmedina.solar.lineduotone.networkitprogramming.HashtagCircle
import dev.chiksmedina.solar.lineduotone.networkitprogramming.HashtagSquare
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Programming
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Screencast
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Screencast2
import dev.chiksmedina.solar.lineduotone.networkitprogramming.SidebarCode
import dev.chiksmedina.solar.lineduotone.networkitprogramming.SidebarMinimalistic
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Siderbar
import dev.chiksmedina.solar.lineduotone.networkitprogramming.SlashCircle
import dev.chiksmedina.solar.lineduotone.networkitprogramming.SlashSquare
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Station
import dev.chiksmedina.solar.lineduotone.networkitprogramming.StationMinimalistic
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Structure
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Translation
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Translation2
import dev.chiksmedina.solar.lineduotone.networkitprogramming.Usb
import dev.chiksmedina.solar.lineduotone.networkitprogramming.UsbCircle
import dev.chiksmedina.solar.lineduotone.networkitprogramming.UsbSquare
import dev.chiksmedina.solar.lineduotone.networkitprogramming.WifiRouter
import dev.chiksmedina.solar.lineduotone.networkitprogramming.WifiRouterMinimalistic
import dev.chiksmedina.solar.lineduotone.networkitprogramming.WifiRouterRound
import dev.chiksmedina.solar.lineduotone.networkitprogramming.WindowFrame
import kotlin.collections.List as KtList

object NetworkItProgrammingGroup

val LineDuotoneSolar.NetworkItProgramming: NetworkItProgrammingGroup
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
