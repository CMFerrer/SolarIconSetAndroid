package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.networkitprogramming.Bug
import com.chiksmedina.solar.lineduotone.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.lineduotone.networkitprogramming.Code
import com.chiksmedina.solar.lineduotone.networkitprogramming.Code2
import com.chiksmedina.solar.lineduotone.networkitprogramming.CodeCircle
import com.chiksmedina.solar.lineduotone.networkitprogramming.CodeSquare
import com.chiksmedina.solar.lineduotone.networkitprogramming.Command
import com.chiksmedina.solar.lineduotone.networkitprogramming.Hashtag
import com.chiksmedina.solar.lineduotone.networkitprogramming.HashtagChat
import com.chiksmedina.solar.lineduotone.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.lineduotone.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.lineduotone.networkitprogramming.Programming
import com.chiksmedina.solar.lineduotone.networkitprogramming.Screencast
import com.chiksmedina.solar.lineduotone.networkitprogramming.Screencast2
import com.chiksmedina.solar.lineduotone.networkitprogramming.SidebarCode
import com.chiksmedina.solar.lineduotone.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.lineduotone.networkitprogramming.Siderbar
import com.chiksmedina.solar.lineduotone.networkitprogramming.SlashCircle
import com.chiksmedina.solar.lineduotone.networkitprogramming.SlashSquare
import com.chiksmedina.solar.lineduotone.networkitprogramming.Station
import com.chiksmedina.solar.lineduotone.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.lineduotone.networkitprogramming.Structure
import com.chiksmedina.solar.lineduotone.networkitprogramming.Translation
import com.chiksmedina.solar.lineduotone.networkitprogramming.Translation2
import com.chiksmedina.solar.lineduotone.networkitprogramming.Usb
import com.chiksmedina.solar.lineduotone.networkitprogramming.UsbCircle
import com.chiksmedina.solar.lineduotone.networkitprogramming.UsbSquare
import com.chiksmedina.solar.lineduotone.networkitprogramming.WifiRouter
import com.chiksmedina.solar.lineduotone.networkitprogramming.WifiRouterMinimalistic
import com.chiksmedina.solar.lineduotone.networkitprogramming.WifiRouterRound
import com.chiksmedina.solar.lineduotone.networkitprogramming.WindowFrame
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
