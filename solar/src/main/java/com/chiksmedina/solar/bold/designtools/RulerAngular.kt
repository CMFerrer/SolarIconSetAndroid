package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

public val DesignToolsGroup.RulerAngular: ImageVector
    get() {
        if (_rulerAngular != null) {
            return _rulerAngular!!
        }
        _rulerAngular = Builder(name = "RulerAngular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.1144f, 2.0f, 3.1716f, 2.0f, 2.5858f, 2.5858f)
                curveTo(2.0f, 3.1716f, 2.0f, 4.1144f, 2.0f, 6.0f)
                verticalLineTo(8.25f)
                horizontalLineTo(5.0f)
                curveTo(5.4142f, 8.25f, 5.75f, 8.5858f, 5.75f, 9.0f)
                curveTo(5.75f, 9.4142f, 5.4142f, 9.75f, 5.0f, 9.75f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 11.25f, 4.75f, 11.5858f, 4.75f, 12.0f)
                curveTo(4.75f, 12.4142f, 4.4142f, 12.75f, 4.0f, 12.75f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.25f)
                lineTo(5.0f, 14.25f)
                curveTo(5.4142f, 14.25f, 5.75f, 14.5858f, 5.75f, 15.0f)
                curveTo(5.75f, 15.4142f, 5.4142f, 15.75f, 5.0f, 15.75f)
                lineTo(2.0f, 15.75f)
                verticalLineTo(17.25f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 17.25f, 4.75f, 17.5858f, 4.75f, 18.0f)
                curveTo(4.75f, 18.4142f, 4.4142f, 18.75f, 4.0f, 18.75f)
                horizontalLineTo(2.0001f)
                curveTo(2.0013f, 19.9896f, 2.0206f, 20.6376f, 2.3371f, 21.1111f)
                curveTo(2.483f, 21.3295f, 2.6705f, 21.517f, 2.8889f, 21.6629f)
                curveTo(3.3933f, 22.0f, 4.0955f, 22.0f, 5.5f, 22.0f)
                curveTo(6.9045f, 22.0f, 7.6067f, 22.0f, 8.1111f, 21.6629f)
                curveTo(8.3295f, 21.517f, 8.517f, 21.3295f, 8.6629f, 21.1111f)
                curveTo(9.0f, 20.6067f, 9.0f, 19.9045f, 9.0f, 18.5f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 10.0572f, 9.0f, 9.5858f, 9.2929f, 9.2929f)
                curveTo(9.5858f, 9.0f, 10.0572f, 9.0f, 11.0f, 9.0f)
                horizontalLineTo(18.5f)
                curveTo(19.9045f, 9.0f, 20.6067f, 9.0f, 21.1111f, 8.6629f)
                curveTo(21.3295f, 8.517f, 21.517f, 8.3295f, 21.6629f, 8.1111f)
                curveTo(22.0f, 7.6067f, 22.0f, 6.9045f, 22.0f, 5.5f)
                curveTo(22.0f, 4.0955f, 22.0f, 3.3933f, 21.6629f, 2.8889f)
                curveTo(21.517f, 2.6705f, 21.3295f, 2.483f, 21.1111f, 2.3371f)
                curveTo(20.6376f, 2.0206f, 19.9896f, 2.0013f, 18.75f, 2.0001f)
                verticalLineTo(4.0f)
                curveTo(18.75f, 4.4142f, 18.4142f, 4.75f, 18.0f, 4.75f)
                curveTo(17.5858f, 4.75f, 17.25f, 4.4142f, 17.25f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(5.0f)
                curveTo(15.75f, 5.4142f, 15.4142f, 5.75f, 15.0f, 5.75f)
                curveTo(14.5858f, 5.75f, 14.25f, 5.4142f, 14.25f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(11.5858f, 4.75f, 11.25f, 4.4142f, 11.25f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.75f)
                lineTo(9.75f, 5.0f)
                curveTo(9.75f, 5.4142f, 9.4142f, 5.75f, 9.0f, 5.75f)
                curveTo(8.5858f, 5.75f, 8.25f, 5.4142f, 8.25f, 5.0f)
                lineTo(8.25f, 2.0f)
                close()
            }
        }
        .build()
        return _rulerAngular!!
    }

private var _rulerAngular: ImageVector? = null
