package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.networkitprogramming.Bug
import com.chiksmedina.solar.linear.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.linear.networkitprogramming.Code
import com.chiksmedina.solar.linear.networkitprogramming.Code2
import com.chiksmedina.solar.linear.networkitprogramming.CodeCircle
import com.chiksmedina.solar.linear.networkitprogramming.CodeSquare
import com.chiksmedina.solar.linear.networkitprogramming.Command
import com.chiksmedina.solar.linear.networkitprogramming.Hashtag
import com.chiksmedina.solar.linear.networkitprogramming.HashtagChat
import com.chiksmedina.solar.linear.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.linear.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.linear.networkitprogramming.Programming
import com.chiksmedina.solar.linear.networkitprogramming.Screencast
import com.chiksmedina.solar.linear.networkitprogramming.Screencast2
import com.chiksmedina.solar.linear.networkitprogramming.SidebarCode
import com.chiksmedina.solar.linear.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.linear.networkitprogramming.Siderbar
import com.chiksmedina.solar.linear.networkitprogramming.SlashCircle
import com.chiksmedina.solar.linear.networkitprogramming.SlashSquare
import com.chiksmedina.solar.linear.networkitprogramming.Station
import com.chiksmedina.solar.linear.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.linear.networkitprogramming.Structure
import com.chiksmedina.solar.linear.networkitprogramming.Translation
import com.chiksmedina.solar.linear.networkitprogramming.Translation2
import com.chiksmedina.solar.linear.networkitprogramming.Usb
import com.chiksmedina.solar.linear.networkitprogramming.UsbCircle
import com.chiksmedina.solar.linear.networkitprogramming.UsbSquare
import com.chiksmedina.solar.linear.networkitprogramming.WindowFrame
import com.chiksmedina.solar.linear.networkitprogramming.`Wi-fiRouterMinimalistic`
import com.chiksmedina.solar.linear.networkitprogramming.`Wi-fiRouterRound`
import com.chiksmedina.solar.linear.networkitprogramming.`Wi-fiRouter`
import kotlin.collections.List as ____KtList

public object NetworkItProgrammingGroup

public val LinearGroup.NetworkItProgramming: NetworkItProgrammingGroup
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
