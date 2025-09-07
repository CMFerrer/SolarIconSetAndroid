package com.chiksmedina.solar.lineduotone.designtools

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
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

val DesignToolsGroup.RulerPen: ImageVector
    get() {
        if (_rulerPen != null) {
            return _rulerPen!!
        }
        _rulerPen = Builder(
            name = "RulerPen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 22.0f)
                curveTo(14.1144f, 22.0f, 13.1716f, 22.0f, 12.5858f, 21.4142f)
                curveTo(12.0f, 20.8284f, 12.0f, 19.8856f, 12.0f, 18.0f)
                lineTo(12.0f, 6.0f)
                curveTo(12.0f, 4.1144f, 12.0f, 3.1716f, 12.5858f, 2.5858f)
                curveTo(13.1716f, 2.0f, 14.1144f, 2.0f, 16.0f, 2.0f)
                lineTo(18.0f, 2.0f)
                curveTo(19.8856f, 2.0f, 20.8284f, 2.0f, 21.4142f, 2.5858f)
                curveTo(22.0f, 3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.8856f, 22.0f, 20.8284f, 21.4142f, 21.4142f)
                curveTo(20.8284f, 22.0f, 19.8856f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                horizontalLineTo(14.0f)
                moveTo(12.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                moveTo(12.0f, 18.0f)
                horizontalLineTo(14.0f)
                moveTo(12.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                moveTo(12.0f, 9.0f)
                lineTo(15.0f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0121f, 21.0271f)
                lineTo(5.7236f, 21.5751f)
                curveTo(5.5866f, 21.8355f, 5.3064f, 22.0f, 5.0f, 22.0f)
                curveTo(4.6936f, 22.0f, 4.4134f, 21.8355f, 4.2764f, 21.5751f)
                lineTo(3.9879f, 21.0271f)
                moveTo(6.0121f, 21.0271f)
                horizontalLineTo(3.9879f)
                moveTo(6.0121f, 21.0271f)
                lineTo(7.1921f, 18.785f)
                curveTo(7.4706f, 18.2559f, 7.6098f, 17.9914f, 7.7127f, 17.7157f)
                curveTo(7.834f, 17.3905f, 7.9177f, 17.0538f, 7.9622f, 16.7114f)
                curveTo(8.0f, 16.4211f, 8.0f, 16.1254f, 8.0f, 15.5338f)
                lineTo(8.0f, 5.8f)
                lineTo(8.0f, 4.85f)
                curveTo(8.0f, 3.276f, 6.6568f, 2.0f, 5.0f, 2.0f)
                curveTo(3.3431f, 2.0f, 2.0f, 3.276f, 2.0f, 4.85f)
                lineTo(2.0f, 5.8f)
                lineTo(2.0f, 15.5338f)
                curveTo(2.0f, 16.1254f, 2.0f, 16.4211f, 2.0378f, 16.7114f)
                curveTo(2.0823f, 17.0538f, 2.166f, 17.3905f, 2.2873f, 17.7157f)
                curveTo(2.3902f, 17.9914f, 2.5294f, 18.2559f, 2.8079f, 18.785f)
                lineTo(3.9879f, 21.0271f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 5.7998f)
                curveTo(2.0f, 5.7998f, 3.125f, 6.7498f, 5.0f, 6.7498f)
                curveTo(6.875f, 6.7498f, 8.0f, 5.7998f, 8.0f, 5.7998f)
            }
        }
            .build()
        return _rulerPen!!
    }

private var _rulerPen: ImageVector? = null
