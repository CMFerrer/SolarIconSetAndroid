package com.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.Solar
import com.chiksmedina.solar.bold.AllIcons
import com.chiksmedina.solar.bold.Arrows
import com.chiksmedina.solar.bold.ArrowsAction
import com.chiksmedina.solar.bold.Astronomy
import com.chiksmedina.solar.bold.BuildingInfrastructure
import com.chiksmedina.solar.bold.BusinessStatistic
import com.chiksmedina.solar.bold.Call
import com.chiksmedina.solar.bold.DesignTools
import com.chiksmedina.solar.bold.ElectronicDevices
import com.chiksmedina.solar.bold.EssentionalUi
import com.chiksmedina.solar.bold.FacesEmotionsStickers
import com.chiksmedina.solar.bold.Files
import com.chiksmedina.solar.bold.Folders
import com.chiksmedina.solar.bold.FoodKitchen
import com.chiksmedina.solar.bold.Hands
import com.chiksmedina.solar.bold.HomeFurniture
import com.chiksmedina.solar.bold.Like
import com.chiksmedina.solar.bold.List
import com.chiksmedina.solar.bold.MapLocation
import com.chiksmedina.solar.bold.Medicine
import com.chiksmedina.solar.bold.MessagesConversation
import com.chiksmedina.solar.bold.Money
import com.chiksmedina.solar.bold.NatureTravel
import com.chiksmedina.solar.bold.NetworkItProgramming
import com.chiksmedina.solar.bold.Notes
import com.chiksmedina.solar.bold.Notifications
import com.chiksmedina.solar.bold.School
import com.chiksmedina.solar.bold.Search
import com.chiksmedina.solar.bold.Security
import com.chiksmedina.solar.bold.SettingsFineTuning
import com.chiksmedina.solar.bold.ShoppingEcommerce
import com.chiksmedina.solar.bold.Sports
import com.chiksmedina.solar.bold.TextFormatting
import com.chiksmedina.solar.bold.Time
import com.chiksmedina.solar.bold.TransportPartsService
import com.chiksmedina.solar.bold.Users
import com.chiksmedina.solar.bold.VideoAudioSound
import com.chiksmedina.solar.bold.Weather
import kotlin.collections.List as ____KtList

public object BoldGroup

public val Solar.Bold: BoldGroup
  get() = BoldGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BoldGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons + BuildingInfrastructure.AllIcons +
        BusinessStatistic.AllIcons + Call.AllIcons + DesignTools.AllIcons +
        ElectronicDevices.AllIcons + EssentionalUi.AllIcons + FacesEmotionsStickers.AllIcons +
        Files.AllIcons + Folders.AllIcons + FoodKitchen.AllIcons + Hands.AllIcons +
        HomeFurniture.AllIcons + Like.AllIcons + List.AllIcons + MapLocation.AllIcons +
        Medicine.AllIcons + MessagesConversation.AllIcons + Money.AllIcons + NatureTravel.AllIcons +
        NetworkItProgramming.AllIcons + Notes.AllIcons + Notifications.AllIcons + School.AllIcons +
        Search.AllIcons + Security.AllIcons + SettingsFineTuning.AllIcons +
        ShoppingEcommerce.AllIcons + Sports.AllIcons + TextFormatting.AllIcons + Time.AllIcons +
        TransportPartsService.AllIcons + Users.AllIcons + VideoAudioSound.AllIcons +
        Weather.AllIcons + listOf()
    return __AllIcons!!
  }
