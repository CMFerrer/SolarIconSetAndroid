package com.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.Solar
import com.chiksmedina.solar.boldduotone.AllIcons
import com.chiksmedina.solar.boldduotone.Arrows
import com.chiksmedina.solar.boldduotone.ArrowsAction
import com.chiksmedina.solar.boldduotone.Astronomy
import com.chiksmedina.solar.boldduotone.BusinessStatistic
import com.chiksmedina.solar.boldduotone.Call
import com.chiksmedina.solar.boldduotone.DesignTools
import com.chiksmedina.solar.boldduotone.ElectronicDevices
import com.chiksmedina.solar.boldduotone.EssentionalUi
import com.chiksmedina.solar.boldduotone.FacesEmotionsStickers
import com.chiksmedina.solar.boldduotone.Files
import com.chiksmedina.solar.boldduotone.Folders
import com.chiksmedina.solar.boldduotone.FoodKitchen
import com.chiksmedina.solar.boldduotone.HomeFurniture
import com.chiksmedina.solar.boldduotone.Like
import com.chiksmedina.solar.boldduotone.List
import com.chiksmedina.solar.boldduotone.MapLocation
import com.chiksmedina.solar.boldduotone.Medicine
import com.chiksmedina.solar.boldduotone.MessagesConversation
import com.chiksmedina.solar.boldduotone.Money
import com.chiksmedina.solar.boldduotone.NatureTravel
import com.chiksmedina.solar.boldduotone.NetworkItProgramming
import com.chiksmedina.solar.boldduotone.Notes
import com.chiksmedina.solar.boldduotone.Notifications
import com.chiksmedina.solar.boldduotone.School
import com.chiksmedina.solar.boldduotone.Search
import com.chiksmedina.solar.boldduotone.Security
import com.chiksmedina.solar.boldduotone.SettingsFineTuning
import com.chiksmedina.solar.boldduotone.ShoppingEcommerce
import com.chiksmedina.solar.boldduotone.Sports
import com.chiksmedina.solar.boldduotone.TextFormatting
import com.chiksmedina.solar.boldduotone.Time
import com.chiksmedina.solar.boldduotone.Users
import com.chiksmedina.solar.boldduotone.VideoAudioSound
import com.chiksmedina.solar.boldduotone.Weather
import kotlin.collections.List as ____KtList

public object BoldduotoneGroup

public val Solar.Boldduotone: BoldduotoneGroup
  get() = BoldduotoneGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BoldduotoneGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons +
        BusinessStatistic.AllIcons + Call.AllIcons + DesignTools.AllIcons +
        ElectronicDevices.AllIcons + EssentionalUi.AllIcons + FacesEmotionsStickers.AllIcons +
        Files.AllIcons + Folders.AllIcons + FoodKitchen.AllIcons + HomeFurniture.AllIcons +
        Like.AllIcons + List.AllIcons + MapLocation.AllIcons + Medicine.AllIcons +
        MessagesConversation.AllIcons + Money.AllIcons + NatureTravel.AllIcons +
        NetworkItProgramming.AllIcons + Notes.AllIcons + Notifications.AllIcons + School.AllIcons +
        Search.AllIcons + Security.AllIcons + SettingsFineTuning.AllIcons +
        ShoppingEcommerce.AllIcons + Sports.AllIcons + TextFormatting.AllIcons + Time.AllIcons +
        Users.AllIcons + VideoAudioSound.AllIcons + Weather.AllIcons + listOf()
    return __AllIcons!!
  }
