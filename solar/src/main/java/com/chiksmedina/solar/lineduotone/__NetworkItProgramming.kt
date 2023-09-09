package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
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
import com.chiksmedina.solar.lineduotone.networkitprogramming.WindowFrame
import com.chiksmedina.solar.lineduotone.networkitprogramming.`Wi-fiRouterMinimalistic`
import com.chiksmedina.solar.lineduotone.networkitprogramming.`Wi-fiRouterRound`
import com.chiksmedina.solar.lineduotone.networkitprogramming.`Wi-fiRouter`
import kotlin.collections.List as ____KtList

public object NetworkItProgrammingGroup

public val LineduotoneGroup.NetworkItProgramming: NetworkItProgrammingGroup
  get() = NetworkItProgrammingGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NetworkItProgrammingGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bug, BugMinimalistic, Code, Code2, CodeCircle, CodeSquare, Command, Hashtag,
        HashtagChat, HashtagCircle, HashtagSquare, Programming, Screencast, Screencast2,
        SidebarCode, SidebarMinimalistic, Siderbar, SlashCircle, SlashSquare, Station,
        StationMinimalistic, Structure, Translation, Translation2, Usb, UsbCircle, UsbSquare,
        `Wi-fiRouter`, `Wi-fiRouterMinimalistic`, `Wi-fiRouterRound`, WindowFrame)
    return __AllIcons!!
  }
