package com.chiksmedina.solar.lineduotone.settingsfinetuning

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
import com.chiksmedina.solar.lineduotone.SettingsFineTuningGroup

val SettingsFineTuningGroup.Tuning4: ImageVector
    get() {
        if (_tuning4 != null) {
            return _tuning4!!
        }
        _tuning4 = Builder(
            name = "Tuning4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 6.0f)
                curveTo(12.8954f, 6.0f, 12.0f, 5.1046f, 12.0f, 4.0f)
                curveTo(12.0f, 2.8954f, 12.8954f, 2.0f, 14.0f, 2.0f)
                curveTo(15.1046f, 2.0f, 16.0f, 2.8954f, 16.0f, 4.0f)
                curveTo(16.0f, 5.1046f, 15.1046f, 6.0f, 14.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 22.0f)
                curveTo(11.1046f, 22.0f, 12.0f, 21.1046f, 12.0f, 20.0f)
                curveTo(12.0f, 18.8954f, 11.1046f, 18.0f, 10.0f, 18.0f)
                curveTo(8.8954f, 18.0f, 8.0f, 18.8954f, 8.0f, 20.0f)
                curveTo(8.0f, 21.1046f, 8.8954f, 22.0f, 10.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 12.0f)
                horizontalLineTo(14.0f)
                moveTo(19.0f, 4.0f)
                horizontalLineTo(16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 20.0f)
                horizontalLineTo(7.6667f)
            }
        }
            .build()
        return _tuning4!!
    }

private var _tuning4: ImageVector? = null
