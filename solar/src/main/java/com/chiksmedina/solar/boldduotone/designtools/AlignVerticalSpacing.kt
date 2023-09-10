package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 21.0f)
                curveTo(1.25f, 20.5858f, 1.5858f, 20.25f, 2.0f, 20.25f)
                lineTo(22.0f, 20.25f)
                curveTo(22.4142f, 20.25f, 22.75f, 20.5858f, 22.75f, 21.0f)
                curveTo(22.75f, 21.4142f, 22.4142f, 21.75f, 22.0f, 21.75f)
                lineTo(2.0f, 21.75f)
                curveTo(1.5858f, 21.75f, 1.25f, 21.4142f, 1.25f, 21.0f)
                close()
                moveTo(1.25f, 3.0f)
                curveTo(1.25f, 2.5858f, 1.5858f, 2.25f, 2.0f, 2.25f)
                lineTo(22.0f, 2.25f)
                curveTo(22.4142f, 2.25f, 22.75f, 2.5858f, 22.75f, 3.0f)
                curveTo(22.75f, 3.4142f, 22.4142f, 3.75f, 22.0f, 3.75f)
                lineTo(2.0f, 3.75f)
                curveTo(1.5858f, 3.75f, 1.25f, 3.4142f, 1.25f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 13.8856f, 4.0f, 14.8284f, 4.5858f, 15.4142f)
                curveTo(5.1716f, 16.0f, 6.1144f, 16.0f, 8.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                curveTo(17.8856f, 16.0f, 18.8284f, 16.0f, 19.4142f, 15.4142f)
                curveTo(20.0f, 14.8284f, 20.0f, 13.8856f, 20.0f, 12.0f)
                curveTo(20.0f, 10.1144f, 20.0f, 9.1716f, 19.4142f, 8.5858f)
                curveTo(18.8284f, 8.0f, 17.8856f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(6.1144f, 8.0f, 5.1716f, 8.0f, 4.5858f, 8.5858f)
                curveTo(4.0f, 9.1716f, 4.0f, 10.1144f, 4.0f, 12.0f)
                close()
            }
        }
            .build()
        return _alignVerticalSpacing!!
    }

private var _alignVerticalSpacing: ImageVector? = null
