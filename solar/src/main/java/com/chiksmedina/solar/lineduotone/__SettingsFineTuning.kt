package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Settings
import com.chiksmedina.solar.lineduotone.settingsfinetuning.SettingsMinimalistic
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning2
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning3
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning4
import com.chiksmedina.solar.lineduotone.settingsfinetuning.TuningSquare
import com.chiksmedina.solar.lineduotone.settingsfinetuning.TuningSquare2
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Widget
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Widget2
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Widget3
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Widget4
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Widget5
import com.chiksmedina.solar.lineduotone.settingsfinetuning.Widget6
import com.chiksmedina.solar.lineduotone.settingsfinetuning.WidgetAdd
import kotlin.collections.List as ____KtList

public object SettingsFineTuningGroup

public val LineduotoneGroup.SettingsFineTuning: SettingsFineTuningGroup
  get() = SettingsFineTuningGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SettingsFineTuningGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Settings, SettingsMinimalistic, Tuning, Tuning2, Tuning3, Tuning4,
        TuningSquare, TuningSquare2, Widget, Widget2, Widget3, Widget4, Widget5, Widget6, WidgetAdd)
    return __AllIcons!!
  }
