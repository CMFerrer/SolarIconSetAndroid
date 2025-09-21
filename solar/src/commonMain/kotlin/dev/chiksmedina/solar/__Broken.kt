package dev.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.Solar
import dev.chiksmedina.solar.broken.AllIcons
import dev.chiksmedina.solar.broken.Arrows
import dev.chiksmedina.solar.broken.ArrowsAction
import dev.chiksmedina.solar.broken.Astronomy
import dev.chiksmedina.solar.broken.BusinessStatistic
import dev.chiksmedina.solar.broken.Call
import dev.chiksmedina.solar.broken.DesignTools
import dev.chiksmedina.solar.broken.ElectronicDevices
import dev.chiksmedina.solar.broken.EssentionalUi
import dev.chiksmedina.solar.broken.FacesEmotionsStickers
import dev.chiksmedina.solar.broken.Files
import dev.chiksmedina.solar.broken.Folders
import dev.chiksmedina.solar.broken.FoodKitchen
import dev.chiksmedina.solar.broken.HomeFurniture
import dev.chiksmedina.solar.broken.Like
import dev.chiksmedina.solar.broken.List
import dev.chiksmedina.solar.broken.MapLocation
import dev.chiksmedina.solar.broken.Medicine
import dev.chiksmedina.solar.broken.MessagesConversation
import dev.chiksmedina.solar.broken.Money
import dev.chiksmedina.solar.broken.NatureTravel
import dev.chiksmedina.solar.broken.NetworkItProgramming
import dev.chiksmedina.solar.broken.Notes
import dev.chiksmedina.solar.broken.Notifications
import dev.chiksmedina.solar.broken.School
import dev.chiksmedina.solar.broken.Search
import dev.chiksmedina.solar.broken.Security
import dev.chiksmedina.solar.broken.SettingsFineTuning
import dev.chiksmedina.solar.broken.ShoppingEcommerce
import dev.chiksmedina.solar.broken.Sports
import dev.chiksmedina.solar.broken.TextFormatting
import dev.chiksmedina.solar.broken.Time
import dev.chiksmedina.solar.broken.VideoAudioSound
import dev.chiksmedina.solar.broken.Weather
import kotlin.collections.List as KtList

object BrokenSolar

val Solar.Broken: BrokenSolar
    get() = BrokenSolar

private var _AllIcons: KtList<ImageVector>? = null

val BrokenSolar.AllIcons: KtList<ImageVector>
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
                VideoAudioSound.AllIcons + Weather.AllIcons + listOf()
        return _AllIcons!!
    }
