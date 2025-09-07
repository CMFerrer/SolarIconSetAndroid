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

val DesignToolsGroup.AlignVerticalSpacing: ImageVector
    get() {
        if (_alignVerticalSpacing != null) {
            return _alignVerticalSpacing!!
        }
        _alignVerticalSpacing = Builder(
            name = "AlignVerticalSpacing", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 21.0f)
                lineTo(2.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 10.1144f, 20.0f, 9.1716f, 19.4142f, 8.5858f)
                curveTo(18.8284f, 8.0f, 17.8856f, 8.0f, 16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                curveTo(6.1144f, 8.0f, 5.1716f, 8.0f, 4.5858f, 8.5858f)
                curveTo(4.0f, 9.1716f, 4.0f, 10.1144f, 4.0f, 12.0f)
                curveTo(4.0f, 13.8856f, 4.0f, 14.8284f, 4.5858f, 15.4142f)
                curveTo(5.1716f, 16.0f, 6.1144f, 16.0f, 8.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(17.8856f, 16.0f, 18.8284f, 16.0f, 19.4142f, 15.4142f)
                curveTo(20.0f, 14.8284f, 20.0f, 13.8856f, 20.0f, 12.0f)
                close()
            }
        }
            .build()
        return _alignVerticalSpacing!!
    }

private var _alignVerticalSpacing: ImageVector? = null
