package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

public val DesignToolsGroup.RulerPen: ImageVector
    get() {
        if (_rulerPen != null) {
            return _rulerPen!!
        }
        _rulerPen = Builder(name = "RulerPen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                curveTo(14.1144f, 22.0f, 13.1716f, 22.0f, 12.5858f, 21.4142f)
                curveTo(12.0834f, 20.9119f, 12.0119f, 20.1469f, 12.0017f, 18.75f)
                lineTo(12.0f, 17.25f)
                verticalLineTo(15.75f)
                verticalLineTo(14.25f)
                verticalLineTo(12.75f)
                verticalLineTo(11.25f)
                verticalLineTo(9.75f)
                verticalLineTo(8.25f)
                verticalLineTo(6.75f)
                lineTo(12.0017f, 5.25f)
                curveTo(12.0119f, 3.8531f, 12.0834f, 3.0881f, 12.5858f, 2.5858f)
                curveTo(13.1716f, 2.0f, 14.1144f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 2.0f, 20.8284f, 2.0f, 21.4142f, 2.5858f)
                curveTo(22.0f, 3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.8856f, 22.0f, 20.8284f, 21.4142f, 21.4142f)
                curveTo(20.8284f, 22.0f, 19.8856f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.25f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 9.75f, 15.75f, 9.4142f, 15.75f, 9.0f)
                curveTo(15.75f, 8.5858f, 15.4142f, 8.25f, 15.0f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.25f)
                lineTo(12.0017f, 5.25f)
                lineTo(12.0f, 6.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 6.75f, 14.75f, 6.4142f, 14.75f, 6.0f)
                curveTo(14.75f, 5.5858f, 14.4142f, 5.25f, 14.0f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.25f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 12.75f, 14.75f, 12.4142f, 14.75f, 12.0f)
                curveTo(14.75f, 11.5858f, 14.4142f, 11.25f, 14.0f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.25f)
                lineTo(12.0f, 14.25f)
                verticalLineTo(15.75f)
                lineTo(15.0f, 15.75f)
                curveTo(15.4142f, 15.75f, 15.75f, 15.4142f, 15.75f, 15.0f)
                curveTo(15.75f, 14.5858f, 15.4142f, 14.25f, 15.0f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.25f)
                horizontalLineTo(12.0f)
                lineTo(12.0017f, 18.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 18.75f, 14.75f, 18.4142f, 14.75f, 18.0f)
                curveTo(14.75f, 17.5858f, 14.4142f, 17.25f, 14.0f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.9795f)
                lineTo(8.0f, 7.0002f)
                curveTo(7.231f, 7.3172f, 6.2167f, 7.589f, 5.0002f, 7.589f)
                curveTo(3.7835f, 7.589f, 2.769f, 7.3171f, 2.0f, 7.0f)
                lineTo(2.0f, 14.9795f)
                curveTo(2.0f, 15.6021f, 2.0f, 15.9135f, 2.0378f, 16.219f)
                curveTo(2.0823f, 16.5794f, 2.166f, 16.9339f, 2.2873f, 17.2762f)
                curveTo(2.3902f, 17.5664f, 2.5294f, 17.8448f, 2.8079f, 18.4018f)
                lineTo(4.2764f, 21.3388f)
                curveTo(4.4134f, 21.6129f, 4.6936f, 21.786f, 5.0f, 21.786f)
                curveTo(5.3064f, 21.786f, 5.5866f, 21.6129f, 5.7236f, 21.3388f)
                lineTo(7.1921f, 18.4018f)
                curveTo(7.4706f, 17.8448f, 7.6098f, 17.5664f, 7.7127f, 17.2762f)
                curveTo(7.834f, 16.9339f, 7.9177f, 16.5794f, 7.9622f, 16.219f)
                curveTo(8.0f, 15.9135f, 8.0f, 15.6021f, 8.0f, 14.9795f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                curveTo(6.6568f, 2.0f, 8.0f, 3.3431f, 8.0f, 5.0f)
                lineTo(8.0f, 7.0002f)
                curveTo(7.231f, 7.3172f, 6.2167f, 7.589f, 5.0002f, 7.589f)
                curveTo(3.7835f, 7.589f, 2.769f, 7.3171f, 2.0f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.3431f, 3.3431f, 2.0f, 5.0f, 2.0f)
                close()
            }
        }
        .build()
        return _rulerPen!!
    }

private var _rulerPen: ImageVector? = null
