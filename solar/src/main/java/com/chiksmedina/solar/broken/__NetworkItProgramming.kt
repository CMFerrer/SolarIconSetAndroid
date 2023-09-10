package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.networkitprogramming.Bug
import com.chiksmedina.solar.broken.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.broken.networkitprogramming.Code
import com.chiksmedina.solar.broken.networkitprogramming.Code2
import com.chiksmedina.solar.broken.networkitprogramming.CodeCircle
import com.chiksmedina.solar.broken.networkitprogramming.CodeSquare
import com.chiksmedina.solar.broken.networkitprogramming.Command
import com.chiksmedina.solar.broken.networkitprogramming.Hashtag
import com.chiksmedina.solar.broken.networkitprogramming.HashtagChat
import com.chiksmedina.solar.broken.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.broken.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.broken.networkitprogramming.Programming
import com.chiksmedina.solar.broken.networkitprogramming.Screencast
import com.chiksmedina.solar.broken.networkitprogramming.Screencast2
import com.chiksmedina.solar.broken.networkitprogramming.SidebarCode
import com.chiksmedina.solar.broken.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.broken.networkitprogramming.Siderbar
import com.chiksmedina.solar.broken.networkitprogramming.SlashCircle
import com.chiksmedina.solar.broken.networkitprogramming.SlashSquare
import com.chiksmedina.solar.broken.networkitprogramming.Station
import com.chiksmedina.solar.broken.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.broken.networkitprogramming.Structure
import com.chiksmedina.solar.broken.networkitprogramming.Translation
import com.chiksmedina.solar.broken.networkitprogramming.Translation2
import com.chiksmedina.solar.broken.networkitprogramming.Usb
import com.chiksmedina.solar.broken.networkitprogramming.UsbCircle
import com.chiksmedina.solar.broken.networkitprogramming.UsbSquare
import com.chiksmedina.solar.broken.networkitprogramming.WifiRouter
import com.chiksmedina.solar.broken.networkitprogramming.WifiRouterMinimalistic
import com.chiksmedina.solar.broken.networkitprogramming.WifiRouterRound
import com.chiksmedina.solar.broken.networkitprogramming.WindowFrame
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
