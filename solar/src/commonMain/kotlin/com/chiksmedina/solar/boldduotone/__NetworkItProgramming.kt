package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.networkitprogramming.Bug
import com.chiksmedina.solar.boldduotone.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.boldduotone.networkitprogramming.Code
import com.chiksmedina.solar.boldduotone.networkitprogramming.Code2
import com.chiksmedina.solar.boldduotone.networkitprogramming.CodeCircle
import com.chiksmedina.solar.boldduotone.networkitprogramming.CodeSquare
import com.chiksmedina.solar.boldduotone.networkitprogramming.Command
import com.chiksmedina.solar.boldduotone.networkitprogramming.Hashtag
import com.chiksmedina.solar.boldduotone.networkitprogramming.HashtagChat
import com.chiksmedina.solar.boldduotone.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.boldduotone.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.boldduotone.networkitprogramming.Programming
import com.chiksmedina.solar.boldduotone.networkitprogramming.Screencast
import com.chiksmedina.solar.boldduotone.networkitprogramming.Screencast2
import com.chiksmedina.solar.boldduotone.networkitprogramming.SidebarCode
import com.chiksmedina.solar.boldduotone.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.boldduotone.networkitprogramming.Siderbar
import com.chiksmedina.solar.boldduotone.networkitprogramming.SlashCircle
import com.chiksmedina.solar.boldduotone.networkitprogramming.SlashSquare
import com.chiksmedina.solar.boldduotone.networkitprogramming.Station
import com.chiksmedina.solar.boldduotone.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.boldduotone.networkitprogramming.Structure
import com.chiksmedina.solar.boldduotone.networkitprogramming.Translation
import com.chiksmedina.solar.boldduotone.networkitprogramming.Translation2
import com.chiksmedina.solar.boldduotone.networkitprogramming.Usb
import com.chiksmedina.solar.boldduotone.networkitprogramming.UsbCircle
import com.chiksmedina.solar.boldduotone.networkitprogramming.UsbSquare
import com.chiksmedina.solar.boldduotone.networkitprogramming.WifiRouter
import com.chiksmedina.solar.boldduotone.networkitprogramming.WifiRouterMinimalistic
import com.chiksmedina.solar.boldduotone.networkitprogramming.WifiRouterRound
import com.chiksmedina.solar.boldduotone.networkitprogramming.WindowFrame
import kotlin.collections.List as KtList

object NetworkItProgrammingGroup

val BoldDuotoneSolar.NetworkItProgramming: NetworkItProgrammingGroup
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
