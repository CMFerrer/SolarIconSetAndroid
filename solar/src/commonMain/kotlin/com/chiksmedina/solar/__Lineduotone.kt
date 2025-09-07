package com.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.Solar
import com.chiksmedina.solar.lineduotone.AllIcons
import com.chiksmedina.solar.lineduotone.Arrows
import com.chiksmedina.solar.lineduotone.ArrowsAction
import com.chiksmedina.solar.lineduotone.Astronomy
import com.chiksmedina.solar.lineduotone.BusinessStatistic
import com.chiksmedina.solar.lineduotone.Call
import com.chiksmedina.solar.lineduotone.DesignTools
import com.chiksmedina.solar.lineduotone.ElectronicDevices
import com.chiksmedina.solar.lineduotone.EssentionalUi
import com.chiksmedina.solar.lineduotone.FacesEmotionsStickers
import com.chiksmedina.solar.lineduotone.Files
import com.chiksmedina.solar.lineduotone.Folders
import com.chiksmedina.solar.lineduotone.FoodKitchen
import com.chiksmedina.solar.lineduotone.HomeFurniture
import com.chiksmedina.solar.lineduotone.Like
import com.chiksmedina.solar.lineduotone.List
import com.chiksmedina.solar.lineduotone.MapLocation
import com.chiksmedina.solar.lineduotone.Medicine
import com.chiksmedina.solar.lineduotone.MessagesConversation
import com.chiksmedina.solar.lineduotone.Money
import com.chiksmedina.solar.lineduotone.NatureTravel
import com.chiksmedina.solar.lineduotone.NetworkItProgramming
import com.chiksmedina.solar.lineduotone.Notes
import com.chiksmedina.solar.lineduotone.Notifications
import com.chiksmedina.solar.lineduotone.School
import com.chiksmedina.solar.lineduotone.Search
import com.chiksmedina.solar.lineduotone.Security
import com.chiksmedina.solar.lineduotone.SettingsFineTuning
import com.chiksmedina.solar.lineduotone.ShoppingEcommerce
import com.chiksmedina.solar.lineduotone.Sports
import com.chiksmedina.solar.lineduotone.TextFormatting
import com.chiksmedina.solar.lineduotone.Time
import com.chiksmedina.solar.lineduotone.Users
import com.chiksmedina.solar.lineduotone.VideoAudioSound
import com.chiksmedina.solar.lineduotone.Weather
import kotlin.collections.List as KtList

object LineDuotoneSolar

val Solar.LineDuotone: LineDuotoneSolar
    get() = LineDuotoneSolar

private var _AllIcons: KtList<ImageVector>? = null

val LineDuotoneSolar.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons +
                BusinessStatistic.AllIcons + Call.AllIcons + DesignTools.AllIcons +
                ElectronicDevices.AllIcons + EssentionalUi.AllIcons + FacesEmotionsStickers.AllIcons +
                Files.AllIcons + Folders.AllIcons + FoodKitchen.AllIcons + HomeFurniture.AllIcons +
                Like.AllIcons + List.AllIcons + MapLocation.AllIcons + Medicine.AllIcons +
                MessagesConversation.AllIcons + Money.AllIcons + NatureTravel.AllIcons +
                NetworkItProgramming.AllIcons + Notes.AllIcons + Notifications.AllIcons + School.AllIcons +
                Search.AllIcons + Security.AllIcons + SettingsFineTuning.AllIcons +
                ShoppingEcommerce.AllIcons + Sports.AllIcons + TextFormatting.AllIcons + Time.AllIcons +
                Users.AllIcons + VideoAudioSound.AllIcons + Weather.AllIcons + listOf()
        return _AllIcons!!
    }
