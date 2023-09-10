package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.networkitprogramming.Bug
import com.chiksmedina.solar.outline.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.outline.networkitprogramming.Code
import com.chiksmedina.solar.outline.networkitprogramming.Code2
import com.chiksmedina.solar.outline.networkitprogramming.CodeCircle
import com.chiksmedina.solar.outline.networkitprogramming.CodeSquare
import com.chiksmedina.solar.outline.networkitprogramming.Command
import com.chiksmedina.solar.outline.networkitprogramming.Hashtag
import com.chiksmedina.solar.outline.networkitprogramming.HashtagChat
import com.chiksmedina.solar.outline.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.outline.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.outline.networkitprogramming.Programming
import com.chiksmedina.solar.outline.networkitprogramming.Screencast
import com.chiksmedina.solar.outline.networkitprogramming.Screencast2
import com.chiksmedina.solar.outline.networkitprogramming.SidebarCode
import com.chiksmedina.solar.outline.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.outline.networkitprogramming.Siderbar
import com.chiksmedina.solar.outline.networkitprogramming.SlashCircle
import com.chiksmedina.solar.outline.networkitprogramming.SlashSquare
import com.chiksmedina.solar.outline.networkitprogramming.Station
import com.chiksmedina.solar.outline.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.outline.networkitprogramming.Structure
import com.chiksmedina.solar.outline.networkitprogramming.Translation
import com.chiksmedina.solar.outline.networkitprogramming.Translation2
import com.chiksmedina.solar.outline.networkitprogramming.Usb
import com.chiksmedina.solar.outline.networkitprogramming.UsbCircle
import com.chiksmedina.solar.outline.networkitprogramming.UsbSquare
import com.chiksmedina.solar.outline.networkitprogramming.WifiRouter
import com.chiksmedina.solar.outline.networkitprogramming.WifiRouterMinimalistic
import com.chiksmedina.solar.outline.networkitprogramming.WifiRouterRound
import com.chiksmedina.solar.outline.networkitprogramming.WindowFrame
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
