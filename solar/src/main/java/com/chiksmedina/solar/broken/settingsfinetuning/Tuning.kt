package com.chiksmedina.solar.broken.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SettingsFineTuningGroup

val SettingsFineTuningGroup.Tuning: ImageVector
    get() {
        if (_tuning != null) {
            return _tuning!!
        }
        _tuning = Builder(
            name = "Tuning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 14.5f)
                curveTo(14.0f, 12.8431f, 15.3431f, 11.5f, 17.0f, 11.5f)
                curveTo(18.6569f, 11.5f, 20.0f, 12.8431f, 20.0f, 14.5f)
                curveTo(20.0f, 16.1569f, 18.6569f, 17.5f, 17.0f, 17.5f)
                curveTo(15.3431f, 17.5f, 14.0f, 16.1569f, 14.0f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 9.5f)
                curveTo(4.0f, 11.1569f, 5.3432f, 12.5f, 7.0f, 12.5f)
                curveTo(8.6568f, 12.5f, 10.0f, 11.1569f, 10.0f, 9.5f)
                curveTo(10.0f, 7.8432f, 8.6568f, 6.5f, 7.0f, 6.5f)
                curveTo(5.3432f, 6.5f, 4.0f, 7.8432f, 4.0f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 13.0f)
                lineTo(7.0f, 18.0f)
                moveTo(7.0f, 21.0001f)
                lineTo(7.0f, 22.0001f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 11.0001f)
                lineTo(17.0f, 6.0001f)
                moveTo(17.0f, 3.0f)
                lineTo(17.0f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 22.0f)
                lineTo(17.0f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 2.0f)
                lineTo(7.0f, 6.0f)
            }
        }
            .build()
        return _tuning!!
    }

private var _tuning: ImageVector? = null
