package dev.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.Solar
import dev.chiksmedina.solar.outline.AllIcons
import dev.chiksmedina.solar.outline.Arrows
import dev.chiksmedina.solar.outline.ArrowsAction
import dev.chiksmedina.solar.outline.Astronomy
import dev.chiksmedina.solar.outline.BusinessStatistic
import dev.chiksmedina.solar.outline.Call
import dev.chiksmedina.solar.outline.DesignTools
import dev.chiksmedina.solar.outline.ElectronicDevices
import dev.chiksmedina.solar.outline.EssentionalUi
import dev.chiksmedina.solar.outline.FacesEmotionsStickers
import dev.chiksmedina.solar.outline.Files
import dev.chiksmedina.solar.outline.Folders
import dev.chiksmedina.solar.outline.FoodKitchen
import dev.chiksmedina.solar.outline.HomeFurniture
import dev.chiksmedina.solar.outline.Like
import dev.chiksmedina.solar.outline.List
import dev.chiksmedina.solar.outline.MapLocation
import dev.chiksmedina.solar.outline.Medicine
import dev.chiksmedina.solar.outline.MessagesConversation
import dev.chiksmedina.solar.outline.Money
import dev.chiksmedina.solar.outline.NatureTravel
import dev.chiksmedina.solar.outline.NetworkItProgramming
import dev.chiksmedina.solar.outline.Notes
import dev.chiksmedina.solar.outline.Notifications
import dev.chiksmedina.solar.outline.School
import dev.chiksmedina.solar.outline.Search
import dev.chiksmedina.solar.outline.Security
import dev.chiksmedina.solar.outline.SettingsFineTuning
import dev.chiksmedina.solar.outline.ShoppingEcommerce
import dev.chiksmedina.solar.outline.Sports
import dev.chiksmedina.solar.outline.TextFormatting
import dev.chiksmedina.solar.outline.Time
import dev.chiksmedina.solar.outline.Users
import dev.chiksmedina.solar.outline.VideoAudioSound
import dev.chiksmedina.solar.outline.Weather
import kotlin.collections.List as KtList

object OutlineSolar

val Solar.Outline: OutlineSolar
    get() = OutlineSolar

private var _AllIcons: KtList<ImageVector>? = null

val OutlineSolar.AllIcons: KtList<ImageVector>
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
