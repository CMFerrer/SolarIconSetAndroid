package com.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

public val DesignToolsGroup.RulerAngular: ImageVector
    get() {
        if (_rulerAngular != null) {
            return _rulerAngular!!
        }
        _rulerAngular = Builder(name = "RulerAngular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                horizontalLineTo(11.0f)
                curveTo(10.0572f, 9.0f, 9.5858f, 9.0f, 9.2929f, 9.2929f)
                curveTo(9.0f, 9.5858f, 9.0f, 10.0572f, 9.0f, 11.0f)
                verticalLineTo(18.5f)
                curveTo(9.0f, 19.9045f, 9.0f, 20.6067f, 8.6629f, 21.1111f)
                curveTo(8.517f, 21.3295f, 8.3295f, 21.517f, 8.1111f, 21.6629f)
                curveTo(7.6067f, 22.0f, 6.9045f, 22.0f, 5.5f, 22.0f)
                curveTo(4.0955f, 22.0f, 3.3933f, 22.0f, 2.8889f, 21.6629f)
                curveTo(2.6705f, 21.517f, 2.483f, 21.3295f, 2.3371f, 21.1111f)
                curveTo(2.0f, 20.6067f, 2.0f, 19.9045f, 2.0f, 18.5f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.1144f, 2.0f, 3.1716f, 2.5858f, 2.5858f)
                curveTo(3.1716f, 2.0f, 4.1144f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.5f)
                curveTo(19.9045f, 2.0f, 20.6067f, 2.0f, 21.1111f, 2.3371f)
                curveTo(21.3295f, 2.483f, 21.517f, 2.6705f, 21.6629f, 2.8889f)
                curveTo(22.0f, 3.3933f, 22.0f, 4.0955f, 22.0f, 5.5f)
                curveTo(22.0f, 6.9045f, 22.0f, 7.6067f, 21.6629f, 8.1111f)
                curveTo(21.517f, 8.3295f, 21.3295f, 8.517f, 21.1111f, 8.6629f)
                curveTo(20.6067f, 9.0f, 19.9045f, 9.0f, 18.5f, 9.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 4.0f)
                moveTo(18.0f, 2.0f)
                lineTo(18.0f, 4.0f)
                moveTo(9.0f, 2.0f)
                lineTo(9.0f, 5.0f)
                moveTo(15.0f, 2.0f)
                lineTo(15.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(4.0f)
                moveTo(2.0f, 18.0f)
                horizontalLineTo(4.0f)
                moveTo(2.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                moveTo(2.0f, 9.0f)
                lineTo(5.0f, 9.0f)
            }
        }
        .build()
        return _rulerAngular!!
    }

private var _rulerAngular: ImageVector? = null
