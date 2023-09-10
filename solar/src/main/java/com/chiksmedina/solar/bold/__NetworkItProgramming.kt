package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.networkitprogramming.Bug
import com.chiksmedina.solar.bold.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.bold.networkitprogramming.Code
import com.chiksmedina.solar.bold.networkitprogramming.Code2
import com.chiksmedina.solar.bold.networkitprogramming.CodeCircle
import com.chiksmedina.solar.bold.networkitprogramming.CodeSquare
import com.chiksmedina.solar.bold.networkitprogramming.Command
import com.chiksmedina.solar.bold.networkitprogramming.Hashtag
import com.chiksmedina.solar.bold.networkitprogramming.HashtagChat
import com.chiksmedina.solar.bold.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.bold.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.bold.networkitprogramming.Programming
import com.chiksmedina.solar.bold.networkitprogramming.Screencast
import com.chiksmedina.solar.bold.networkitprogramming.Screencast2
import com.chiksmedina.solar.bold.networkitprogramming.SidebarCode
import com.chiksmedina.solar.bold.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.bold.networkitprogramming.Siderbar
import com.chiksmedina.solar.bold.networkitprogramming.SlashCircle
import com.chiksmedina.solar.bold.networkitprogramming.SlashSquare
import com.chiksmedina.solar.bold.networkitprogramming.Station
import com.chiksmedina.solar.bold.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.bold.networkitprogramming.Structure
import com.chiksmedina.solar.bold.networkitprogramming.Translation
import com.chiksmedina.solar.bold.networkitprogramming.Translation2
import com.chiksmedina.solar.bold.networkitprogramming.Usb
import com.chiksmedina.solar.bold.networkitprogramming.UsbCircle
import com.chiksmedina.solar.bold.networkitprogramming.UsbSquare
import com.chiksmedina.solar.bold.networkitprogramming.WifiRouter
import com.chiksmedina.solar.bold.networkitprogramming.WifiRouterMinimalistic
import com.chiksmedina.solar.bold.networkitprogramming.WifiRouterRound
import com.chiksmedina.solar.bold.networkitprogramming.WindowFrame
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
