package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.settingsfinetuning.Settings
import com.chiksmedina.solar.outline.settingsfinetuning.SettingsMinimalistic
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning2
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning3
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning4
import com.chiksmedina.solar.outline.settingsfinetuning.TuningSquare
import com.chiksmedina.solar.outline.settingsfinetuning.TuningSquare2
import com.chiksmedina.solar.outline.settingsfinetuning.Widget
import com.chiksmedina.solar.outline.settingsfinetuning.Widget2
import com.chiksmedina.solar.outline.settingsfinetuning.Widget3
import com.chiksmedina.solar.outline.settingsfinetuning.Widget4
import com.chiksmedina.solar.outline.settingsfinetuning.Widget5
import com.chiksmedina.solar.outline.settingsfinetuning.Widget6
import com.chiksmedina.solar.outline.settingsfinetuning.WidgetAdd
import kotlin.collections.List as ____KtList

public object SettingsFineTuningGroup

public val OutlineGroup.SettingsFineTuning: SettingsFineTuningGroup
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
