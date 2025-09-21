package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.networkitprogramming.Bug
import dev.chiksmedina.solar.linear.networkitprogramming.BugMinimalistic
import dev.chiksmedina.solar.linear.networkitprogramming.Code
import dev.chiksmedina.solar.linear.networkitprogramming.Code2
import dev.chiksmedina.solar.linear.networkitprogramming.CodeCircle
import dev.chiksmedina.solar.linear.networkitprogramming.CodeSquare
import dev.chiksmedina.solar.linear.networkitprogramming.Command
import dev.chiksmedina.solar.linear.networkitprogramming.Hashtag
import dev.chiksmedina.solar.linear.networkitprogramming.HashtagChat
import dev.chiksmedina.solar.linear.networkitprogramming.HashtagCircle
import dev.chiksmedina.solar.linear.networkitprogramming.HashtagSquare
import dev.chiksmedina.solar.linear.networkitprogramming.Programming
import dev.chiksmedina.solar.linear.networkitprogramming.Screencast
import dev.chiksmedina.solar.linear.networkitprogramming.Screencast2
import dev.chiksmedina.solar.linear.networkitprogramming.SidebarCode
import dev.chiksmedina.solar.linear.networkitprogramming.SidebarMinimalistic
import dev.chiksmedina.solar.linear.networkitprogramming.Siderbar
import dev.chiksmedina.solar.linear.networkitprogramming.SlashCircle
import dev.chiksmedina.solar.linear.networkitprogramming.SlashSquare
import dev.chiksmedina.solar.linear.networkitprogramming.Station
import dev.chiksmedina.solar.linear.networkitprogramming.StationMinimalistic
import dev.chiksmedina.solar.linear.networkitprogramming.Structure
import dev.chiksmedina.solar.linear.networkitprogramming.Translation
import dev.chiksmedina.solar.linear.networkitprogramming.Translation2
import dev.chiksmedina.solar.linear.networkitprogramming.Usb
import dev.chiksmedina.solar.linear.networkitprogramming.UsbCircle
import dev.chiksmedina.solar.linear.networkitprogramming.UsbSquare
import dev.chiksmedina.solar.linear.networkitprogramming.WifiRouter
import dev.chiksmedina.solar.linear.networkitprogramming.WifiRouterMinimalistic
import dev.chiksmedina.solar.linear.networkitprogramming.WifiRouterRound
import dev.chiksmedina.solar.linear.networkitprogramming.WindowFrame
import kotlin.collections.List as KtList

object NetworkItProgrammingGroup

val LinearSolar.NetworkItProgramming: NetworkItProgrammingGroup
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
