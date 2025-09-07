package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.settingsfinetuning.Settings
import com.chiksmedina.solar.linear.settingsfinetuning.SettingsMinimalistic
import com.chiksmedina.solar.linear.settingsfinetuning.Tuning
import com.chiksmedina.solar.linear.settingsfinetuning.Tuning2
import com.chiksmedina.solar.linear.settingsfinetuning.Tuning3
import com.chiksmedina.solar.linear.settingsfinetuning.Tuning4
import com.chiksmedina.solar.linear.settingsfinetuning.TuningSquare
import com.chiksmedina.solar.linear.settingsfinetuning.TuningSquare2
import com.chiksmedina.solar.linear.settingsfinetuning.Widget
import com.chiksmedina.solar.linear.settingsfinetuning.Widget2
import com.chiksmedina.solar.linear.settingsfinetuning.Widget3
import com.chiksmedina.solar.linear.settingsfinetuning.Widget4
import com.chiksmedina.solar.linear.settingsfinetuning.Widget5
import com.chiksmedina.solar.linear.settingsfinetuning.Widget6
import com.chiksmedina.solar.linear.settingsfinetuning.WidgetAdd
import kotlin.collections.List as KtList

object SettingsFineTuningGroup

val LinearSolar.SettingsFineTuning: SettingsFineTuningGroup
    get() = SettingsFineTuningGroup

private var _AllIcons: KtList<ImageVector>? = null

val SettingsFineTuningGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Settings,
            SettingsMinimalistic,
            Tuning,
            Tuning2,
            Tuning3,
            Tuning4,
            TuningSquare,
            TuningSquare2,
            Widget,
            Widget2,
            Widget3,
            Widget4,
            Widget5,
            Widget6,
            WidgetAdd
        )
        return _AllIcons!!
    }
