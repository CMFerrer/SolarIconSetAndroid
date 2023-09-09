package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.essentionalui.Accessibility
import com.chiksmedina.solar.linear.essentionalui.AddCircle
import com.chiksmedina.solar.linear.essentionalui.AddSquare
import com.chiksmedina.solar.linear.essentionalui.AugmentedReality
import com.chiksmedina.solar.linear.essentionalui.Balloon
import com.chiksmedina.solar.linear.essentionalui.BatteryCharge
import com.chiksmedina.solar.linear.essentionalui.BatteryChargeMinimalistic
import com.chiksmedina.solar.linear.essentionalui.BatteryFull
import com.chiksmedina.solar.linear.essentionalui.BatteryFullMinimalistic
import com.chiksmedina.solar.linear.essentionalui.BatteryHalf
import com.chiksmedina.solar.linear.essentionalui.BatteryHalfMinimalistic
import com.chiksmedina.solar.linear.essentionalui.BatteryLow
import com.chiksmedina.solar.linear.essentionalui.BatteryLowMinimalistic
import com.chiksmedina.solar.linear.essentionalui.Body
import com.chiksmedina.solar.linear.essentionalui.Bolt
import com.chiksmedina.solar.linear.essentionalui.BoltCircle
import com.chiksmedina.solar.linear.essentionalui.Box
import com.chiksmedina.solar.linear.essentionalui.BoxMinimalistic
import com.chiksmedina.solar.linear.essentionalui.Broom
import com.chiksmedina.solar.linear.essentionalui.Cat
import com.chiksmedina.solar.linear.essentionalui.CheckCircle
import com.chiksmedina.solar.linear.essentionalui.CheckSquare
import com.chiksmedina.solar.linear.essentionalui.CloseCircle
import com.chiksmedina.solar.linear.essentionalui.CloseSquare
import com.chiksmedina.solar.linear.essentionalui.Confetti
import com.chiksmedina.solar.linear.essentionalui.ConfettiMinimalistic
import com.chiksmedina.solar.linear.essentionalui.Copy
import com.chiksmedina.solar.linear.essentionalui.Copyright
import com.chiksmedina.solar.linear.essentionalui.Cosmetic
import com.chiksmedina.solar.linear.essentionalui.CreativeCommons
import com.chiksmedina.solar.linear.essentionalui.Crown
import com.chiksmedina.solar.linear.essentionalui.CrownLine
import com.chiksmedina.solar.linear.essentionalui.CrownMinimalistic
import com.chiksmedina.solar.linear.essentionalui.CrownStar
import com.chiksmedina.solar.linear.essentionalui.Cup
import com.chiksmedina.solar.linear.essentionalui.CupFirst
import com.chiksmedina.solar.linear.essentionalui.CupMusic
import com.chiksmedina.solar.linear.essentionalui.CupStar
import com.chiksmedina.solar.linear.essentionalui.Cursor
import com.chiksmedina.solar.linear.essentionalui.CursorSquare
import com.chiksmedina.solar.linear.essentionalui.Danger
import com.chiksmedina.solar.linear.essentionalui.DangerCircle
import com.chiksmedina.solar.linear.essentionalui.DangerSquare
import com.chiksmedina.solar.linear.essentionalui.DangerTriangle
import com.chiksmedina.solar.linear.essentionalui.Database
import com.chiksmedina.solar.linear.essentionalui.Delivery
import com.chiksmedina.solar.linear.essentionalui.Explicit
import com.chiksmedina.solar.linear.essentionalui.Feed
import com.chiksmedina.solar.linear.essentionalui.FerrisWheel
import com.chiksmedina.solar.linear.essentionalui.Figma
import com.chiksmedina.solar.linear.essentionalui.Filter
import com.chiksmedina.solar.linear.essentionalui.Flag
import com.chiksmedina.solar.linear.essentionalui.Flag2
import com.chiksmedina.solar.linear.essentionalui.Flashlight
import com.chiksmedina.solar.linear.essentionalui.FlashlightOn
import com.chiksmedina.solar.linear.essentionalui.Forbidden
import com.chiksmedina.solar.linear.essentionalui.ForbiddenCircle
import com.chiksmedina.solar.linear.essentionalui.Fuel
import com.chiksmedina.solar.linear.essentionalui.Ghost
import com.chiksmedina.solar.linear.essentionalui.GhostSmile
import com.chiksmedina.solar.linear.essentionalui.Gift
import com.chiksmedina.solar.linear.essentionalui.Glasses
import com.chiksmedina.solar.linear.essentionalui.HamburgerMenu
import com.chiksmedina.solar.linear.essentionalui.Hanger
import com.chiksmedina.solar.linear.essentionalui.Hanger2
import com.chiksmedina.solar.linear.essentionalui.Help
import com.chiksmedina.solar.linear.essentionalui.HighDefinition
import com.chiksmedina.solar.linear.essentionalui.HighQuality
import com.chiksmedina.solar.linear.essentionalui.Home
import com.chiksmedina.solar.linear.essentionalui.Home2
import com.chiksmedina.solar.linear.essentionalui.HomeAdd
import com.chiksmedina.solar.linear.essentionalui.HomeAddAngle
import com.chiksmedina.solar.linear.essentionalui.HomeAngle
import com.chiksmedina.solar.linear.essentionalui.HomeAngle2
import com.chiksmedina.solar.linear.essentionalui.HomeSmile
import com.chiksmedina.solar.linear.essentionalui.HomeSmileAngle
import com.chiksmedina.solar.linear.essentionalui.HomeWifi
import com.chiksmedina.solar.linear.essentionalui.HomeWifiAngle
import com.chiksmedina.solar.linear.essentionalui.InfoCircle
import com.chiksmedina.solar.linear.essentionalui.InfoSquare
import com.chiksmedina.solar.linear.essentionalui.MagicStick
import com.chiksmedina.solar.linear.essentionalui.MagicStick2
import com.chiksmedina.solar.linear.essentionalui.MagicStick3
import com.chiksmedina.solar.linear.essentionalui.Magnet
import com.chiksmedina.solar.linear.essentionalui.MagnetWave
import com.chiksmedina.solar.linear.essentionalui.MaskHapply
import com.chiksmedina.solar.linear.essentionalui.MaskSad
import com.chiksmedina.solar.linear.essentionalui.Masks
import com.chiksmedina.solar.linear.essentionalui.MentionCircle
import com.chiksmedina.solar.linear.essentionalui.MentionSquare
import com.chiksmedina.solar.linear.essentionalui.MenuDots
import com.chiksmedina.solar.linear.essentionalui.MenuDotsCircle
import com.chiksmedina.solar.linear.essentionalui.MenuDotsSquare
import com.chiksmedina.solar.linear.essentionalui.MinusCircle
import com.chiksmedina.solar.linear.essentionalui.MinusSquare
import com.chiksmedina.solar.linear.essentionalui.Mirror
import com.chiksmedina.solar.linear.essentionalui.PaperBin
import com.chiksmedina.solar.linear.essentionalui.Paw
import com.chiksmedina.solar.linear.essentionalui.Perfume
import com.chiksmedina.solar.linear.essentionalui.Pin
import com.chiksmedina.solar.linear.essentionalui.PinCircle
import com.chiksmedina.solar.linear.essentionalui.PinList
import com.chiksmedina.solar.linear.essentionalui.Plate
import com.chiksmedina.solar.linear.essentionalui.PostsCarouselHorizontal
import com.chiksmedina.solar.linear.essentionalui.PostsCarouselVertical
import com.chiksmedina.solar.linear.essentionalui.Power
import com.chiksmedina.solar.linear.essentionalui.QuestionCircle
import com.chiksmedina.solar.linear.essentionalui.QuestionSquare
import com.chiksmedina.solar.linear.essentionalui.Reorder
import com.chiksmedina.solar.linear.essentionalui.Revote
import com.chiksmedina.solar.linear.essentionalui.Scissors
import com.chiksmedina.solar.linear.essentionalui.ScissorsSquare
import com.chiksmedina.solar.linear.essentionalui.Share
import com.chiksmedina.solar.linear.essentionalui.ShareCircle
import com.chiksmedina.solar.linear.essentionalui.Skirt
import com.chiksmedina.solar.linear.essentionalui.Sledgehammer
import com.chiksmedina.solar.linear.essentionalui.Sleeping
import com.chiksmedina.solar.linear.essentionalui.SliderHorizontal
import com.chiksmedina.solar.linear.essentionalui.SliderMinimalisticHorizontal
import com.chiksmedina.solar.linear.essentionalui.SliderVertical
import com.chiksmedina.solar.linear.essentionalui.SliderVerticalMinimalistic
import com.chiksmedina.solar.linear.essentionalui.SmartHome
import com.chiksmedina.solar.linear.essentionalui.SmartHomeAngle
import com.chiksmedina.solar.linear.essentionalui.Sort
import com.chiksmedina.solar.linear.essentionalui.SpecialEffects
import com.chiksmedina.solar.linear.essentionalui.Subtitles
import com.chiksmedina.solar.linear.essentionalui.Target
import com.chiksmedina.solar.linear.essentionalui.Traffic
import com.chiksmedina.solar.linear.essentionalui.TrafficEconomy
import com.chiksmedina.solar.linear.essentionalui.TrashBin2
import com.chiksmedina.solar.linear.essentionalui.TrashBinMinimalistic
import com.chiksmedina.solar.linear.essentionalui.TrashBinMinimalistic2
import com.chiksmedina.solar.linear.essentionalui.TrashBinTrash
import com.chiksmedina.solar.linear.essentionalui.Umbrella
import com.chiksmedina.solar.linear.essentionalui.Waterdrop
import com.chiksmedina.solar.linear.essentionalui.Winrar
import com.chiksmedina.solar.linear.essentionalui.Xxx
import com.chiksmedina.solar.linear.essentionalui._4k
import com.chiksmedina.solar.linear.essentionalui.`T-shirt`
import kotlin.collections.List as ____KtList

public object EssentionalUiGroup

public val LinearGroup.EssentionalUi: EssentionalUiGroup
  get() = EssentionalUiGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EssentionalUiGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(_4k, Accessibility, AddCircle, AddSquare, AugmentedReality, Balloon,
        BatteryCharge, BatteryChargeMinimalistic, BatteryFull, BatteryFullMinimalistic, BatteryHalf,
        BatteryHalfMinimalistic, BatteryLow, BatteryLowMinimalistic, Body, Bolt, BoltCircle, Box,
        BoxMinimalistic, Broom, Cat, CheckCircle, CheckSquare, CloseCircle, CloseSquare, Confetti,
        ConfettiMinimalistic, Copy, Copyright, Cosmetic, CreativeCommons, Crown, CrownLine,
        CrownMinimalistic, CrownStar, Cup, CupFirst, CupMusic, CupStar, Cursor, CursorSquare,
        Danger, DangerCircle, DangerSquare, DangerTriangle, Database, Delivery, Explicit, Feed,
        FerrisWheel, Figma, Filter, Flag, Flag2, Flashlight, FlashlightOn, Forbidden,
        ForbiddenCircle, Fuel, Ghost, GhostSmile, Gift, Glasses, HamburgerMenu, Hanger, Hanger2,
        Help, HighDefinition, HighQuality, Home, Home2, HomeAdd, HomeAddAngle, HomeAngle,
        HomeAngle2, HomeSmile, HomeSmileAngle, HomeWifi, HomeWifiAngle, InfoCircle, InfoSquare,
        MagicStick, MagicStick2, MagicStick3, Magnet, MagnetWave, Masks, MaskHapply, MaskSad,
        MentionCircle, MentionSquare, MenuDots, MenuDotsCircle, MenuDotsSquare, MinusCircle,
        MinusSquare, Mirror, PaperBin, Paw, Perfume, Pin, PinCircle, PinList, Plate,
        PostsCarouselHorizontal, PostsCarouselVertical, Power, QuestionCircle, QuestionSquare,
        Reorder, Revote, Scissors, ScissorsSquare, Share, ShareCircle, Skirt, Sledgehammer,
        Sleeping, SliderHorizontal, SliderMinimalisticHorizontal, SliderVertical,
        SliderVerticalMinimalistic, SmartHome, SmartHomeAngle, Sort, SpecialEffects, Subtitles,
        `T-shirt`, Target, Traffic, TrafficEconomy, TrashBin2, TrashBinMinimalistic,
        TrashBinMinimalistic2, TrashBinTrash, Umbrella, Waterdrop, Winrar, Xxx)
    return __AllIcons!!
  }
